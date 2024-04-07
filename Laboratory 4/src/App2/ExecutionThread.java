package App2;

class ExecutionThread extends Thread {
    private final Object monitor1;
    private final Object monitor2;
    private final int sleepMin, sleepMax, activityMin, activityMax;

    public ExecutionThread(Object monitor1, Object monitor2, int sleepMin, int sleepMax, int activityMin, int activityMax) {
        this.monitor1 = monitor1;
        this.monitor2 = monitor2;
        this.sleepMin = sleepMin;
        this.sleepMax = sleepMax;
        this.activityMin = activityMin;
        this.activityMax = activityMax;
    }

    public void run() {
        try {
            System.out.println(this.getName() + " - STATE 1");
            // Sleep for a random duration within the specified sleep time range
            Thread.sleep((long) (Math.random() * (sleepMax - sleepMin) + sleepMin) * 500);
            System.out.println(this.getName() + " - STATE 2");
            synchronized (monitor1) {
                System.out.println(this.getName() + " - STATE 3");
                // Perform some activity
                int k = (int) (Math.random() * (activityMax - activityMin) + activityMin);
                for (int i = 0; i < k * 100000; i++) {
                    i++;
                    i--;
                }
            }
            System.out.println(this.getName() + " - STATE 4");
            synchronized (monitor2) {
                System.out.println(this.getName() + " - STATE 5");
                // Perform some activity
                int k = (int) (Math.random() * (activityMax - activityMin) + activityMin);
                for (int i = 0; i < k * 100000; i++) {
                    i++;
                    i--;
                }
            }
            System.out.println(this.getName() + " - STATE 6");
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
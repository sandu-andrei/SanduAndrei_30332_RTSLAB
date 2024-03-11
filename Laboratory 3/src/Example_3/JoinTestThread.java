package Example_3;

class JoinTestThread extends Thread {
    Thread t;
    static int sum = 0;
    int limit;

    JoinTestThread(String n, Thread t, int limit) {
        this.setName(n);
        this.t = t;
        this.limit = limit;
    }

    public void run() {
        System.out.println("Thread " + getName() + " has entered the run() method");
        try {
            if (t != null) t.join();
            System.out.println("Thread " + getName() + " executing operation.");
            for (int i = 1; i <= limit; i++) {
                if (limit % i == 0) {
                    sum += i;
                }
            }
            System.out.println("Thread " + getName() + " has terminated operation.");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}


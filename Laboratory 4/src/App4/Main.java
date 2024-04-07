package App4;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        Object monitor1 = new Object();
        Object monitor2 = new Object();
        ExecutionThread thread1 = new ExecutionThread(monitor1, monitor2, 7, 7, 2, 3);
        ExecutionThread thread2 = new ExecutionThread(monitor1, monitor2, 3, 5, 3, 5);
        ExecutionThread thread3 = new ExecutionThread(monitor1, monitor2, 4, 6, 4, 6);
        thread1.start();
        thread2.start();
        thread3.start();
        thread1.join();
        thread2.join();
        thread3.join();
        System.out.println("All threads have completed execution.");
    }
}

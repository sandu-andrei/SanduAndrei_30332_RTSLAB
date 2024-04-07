package App2;

public class Main {
    public static void main(String[] args) {
        Object monitor1 = new Object();
        Object monitor2 = new Object();
        new ExecutionThread(monitor1, monitor2, 2, 4, 3, 6).start();
        new ExecutionThread(monitor2, monitor1, 3, 5, 4, 7).start();
    }
}

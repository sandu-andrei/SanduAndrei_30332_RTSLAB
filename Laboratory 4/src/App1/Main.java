package App1;

public class Main {
    public static void main(String[] args) {
        Integer monitor1 = new Integer(1);
        Integer monitor2 = new Integer(2);
        new App1.ExecutionThread(monitor1, null, 2, 4, 3, 6).start(); // First branch
        new App1.ExecutionThread(monitor1, monitor2, 3, 6, 4, 7).start(); // Second branch
        new ExecutionThread(null, monitor2, 2, 5, 2, 4).start(); // Third branch
    }
}


package App3;

public class Main {
    public static void main(String[] args) {
        Integer monitor = new Integer(1);
        new ExecutionThread(monitor, 4, 7, 3, 6).start(); // Parameters for P0-T3 subnet
        new ExecutionThread(monitor, 5, 7, 6, 7).start(); // Parameters for P4-T7 subnet
        new ExecutionThread(monitor, 3, 6, 5, 6).start(); // Parameters for P17-T19 subnet
    }
}

package App4;

public class Main {
    public static void main(String[] args) {
        Integer monitor1=new Integer(1);
        Integer monitor2=new Integer(2);
        ExecutionThread1 executionThread1 = new ExecutionThread1(7, 2, 3,monitor1,monitor2);
        ExecutionThread2 executionThread21 = new ExecutionThread2(3, 5, executionThread1,monitor1);
        ExecutionThread2 executionThread22 = new ExecutionThread2(4, 6, executionThread1,monitor2);
        executionThread1.start();
        executionThread21.start();
        executionThread22.start();
    }

}

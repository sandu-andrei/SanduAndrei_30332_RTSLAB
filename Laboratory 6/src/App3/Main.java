package App3;

import java.util.concurrent.CountDownLatch;

public class Main {

    public static void main(String []args) {
        Object P6 = new Object();
        Object P10 = new Object();
        CountDownLatch T11 = new CountDownLatch(3);

        ExecutionThread1 thread1 = new ExecutionThread1(2, 3, 7, P6, P10, T11);
        ExecutionThread2 thread2 = new ExecutionThread2(3, 5, 2, P6, T11);
        ExecutionThread2 thread3 = new ExecutionThread2(3, 5, 5, P6, T11);

        thread1.start();
        thread2.start();
        thread3.start();
        System.out.println("Transition T11 has executed");
    }

}
package App2;

import java.util.concurrent.CountDownLatch;
import java.util.concurrent.CyclicBarrier;
import java.util.concurrent.Semaphore;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class Main {
    public static void main(String[] args) {
        Lock P9 = new ReentrantLock();
        Lock P10 = new ReentrantLock();

        CountDownLatch T8 = new CountDownLatch(3);

        ExecutionThread1 thread1 = new ExecutionThread1(P9, T8, 2, 4, 4);
        ExecutionThread1 thread3 = new ExecutionThread1(P10, T8, 2, 5, 5);

        ExecutionThread2 thread2 = new ExecutionThread2(P9, P10, T8, 3, 6, 3);

        System.out.println("Place 0");

        thread1.start();
        thread2.start();
        thread3.start();
    }
}
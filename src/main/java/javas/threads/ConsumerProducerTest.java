package javas.threads;

import java.util.ArrayList;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.ReentrantLock;

/**
 * @author changle
 * Created on 2019-07-31
 */
public class ConsumerProducerTest {
    public static void main(String []args) {
        final ReentrantLock lock = new ReentrantLock();
        final Condition full = lock.newCondition();
        final Condition empty = lock.newCondition();
        final ArrayList<Integer> data = new ArrayList<Integer>();
        Thread producer = new Thread(new Runnable() {
            Producer producer = new Producer(data, lock, full, empty);
            public void run() {
                while(true) {
                    try {
                        Thread.sleep(100);
                        producer.putValue();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            }
        });

        final Thread consumer = new Thread(new Runnable() {
            Consumer consumer = new Consumer(data, lock, full, empty);
            public void run() {
                while(true) {
                    try {
                        Thread.sleep(300);
                        consumer.takeValue();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            }
        });

        consumer.start();
        producer.start();
        try {
            consumer.join();
            producer.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

    }
}

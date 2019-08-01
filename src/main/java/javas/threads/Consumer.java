package javas.threads;

import java.util.ArrayList;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.ReentrantLock;

/**
 * @author changle
 * Created on 2019-07-31
 */
public class Consumer {
    private ArrayList<Integer> data;

    private ReentrantLock lock;

    private Condition full;

    private Condition empty;

    public Consumer(ArrayList<Integer> data, ReentrantLock lock, Condition full, Condition empty) {
        this.data = data;
        this.lock = lock;
        this.full = full;
        this.empty = empty;
    }

    public void takeValue() {
        try {
            lock.lock();
            while (data.size() <= 0) {
                empty.await();
            }
            int tmp = data.get(0);
            data.remove(0);
            System.out.println("take value: " + tmp);
            full.signalAll();
        } catch (InterruptedException e) {
            e.printStackTrace();
        } finally {
            lock.unlock();
        }
    }
}

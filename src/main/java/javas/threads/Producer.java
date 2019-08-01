package javas.threads;

import java.util.ArrayList;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.ReentrantLock;

/**
 * @author changle
 * Created on 2019-07-31
 */
public class Producer {
    private ArrayList<Integer> data;

    private ReentrantLock lock;

    private Condition full;

    private Condition empty;

    public Producer(ArrayList<Integer> data, ReentrantLock lock, Condition full, Condition empty) {
        this.data = data;
        this.lock = lock;
        this.full = full;
        this.empty = empty;
    }

    public void putValue() {
        try {
            lock.lock();
            while (data.size() >= 10) {
                full.await();
            }
            int tmp = (int)(Math.random() * 10);
            data.add(tmp);
            System.out.println(String.format("put value: %s, size: %s", tmp, data.size()));
            empty.signalAll();
        } catch (InterruptedException e) {
            e.printStackTrace();
        } finally {
            lock.unlock();
        }
    }
}

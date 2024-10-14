package io.github.wkktoria.designpatterns.creational.objectpool;

import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.function.Supplier;
import java.util.stream.IntStream;

/**
 * The object pool, here all objects are pre-created.
 */
class ObjectPool<T extends Poolable> {
    private BlockingQueue<T> availablePool;

    public ObjectPool(Supplier<T> creator, final int count) {
        availablePool = new LinkedBlockingQueue<>();
        IntStream.range(0, count).forEach(i -> availablePool.offer(creator.get()));
    }

    /**
     * It must decide what to do if pool is empty. It can create new object and return that
     * or wait unit one becomes available.
     *
     * @return object of type {@link T}
     */
    public T get() {
        try {
            // It is going to wait if none free.
            return availablePool.take();
        } catch (InterruptedException e) {
            System.err.println("take() interrupted");
        }

        return null;
    }

    public void release(T object) {
        object.reset();
        try {
            availablePool.put(object);
        } catch (InterruptedException e) {
            System.err.println("put() interrupted");
        }
    }
}

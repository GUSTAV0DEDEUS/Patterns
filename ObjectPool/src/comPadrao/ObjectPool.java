/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package comPadrao;
import java.util.concurrent.ConcurrentLinkedQueue;


/**
 *
 * @author Gustavo
 */

public class ObjectPool<T> {
    private ConcurrentLinkedQueue<T> pool;
    private int maxSize;
    private ObjectFactory<T> factory;

    public ObjectPool(int size, ObjectFactory<T> factory) {
        this.maxSize = size;
        this.factory = factory;
        this.pool = new ConcurrentLinkedQueue<>();
        for (int i = 0; i < size; i++) {
            pool.add(factory.create());
        }
    }

    public T borrowObject() {
        T object;
        if ((object = pool.poll()) == null) {
            object = factory.create();
        }
        return object;
    }

    public void returnObject(T object) {
        if (pool.size() < maxSize) {
            pool.offer(object);
        }
    }
}

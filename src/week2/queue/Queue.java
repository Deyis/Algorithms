package week2.queue;

import java.util.Iterator;

/**
 * Created by Denis_Ivanchenko on 12/8/2014.
 */
public interface Queue<T> extends Iterable<T>, Cloneable {

    void enqueue(T item);   // insert
    T dequeue ();           // remove and return
    boolean isEmpty();


    Queue<T> clone();
    default Iterator<T> iterator() {
        return new Iterator<T>() {
            @Override
            public boolean hasNext() {
                return !isEmpty();
            }

            @Override
            public T next() {
                return dequeue();
            }
        };
    }
}

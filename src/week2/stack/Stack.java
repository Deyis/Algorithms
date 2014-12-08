package week2.stack;

import java.util.Iterator;

/**
 * Created by Denis_Ivanchenko on 12/8/2014.
 */
public interface Stack<T> extends Iterable<T>, Cloneable {

    void push(T item);
    T pop();
    boolean isEmpty();

    Stack<T> clone();

    default Iterator<T> iterator() {
        return new Iterator<T>() {
            @Override
            public boolean hasNext() {
                return !isEmpty();
            }

            @Override
            public T next() {
                return pop();
            }
        };
    }


}

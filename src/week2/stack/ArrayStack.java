package week2.stack;

/**
 * Created by Denis_Ivanchenko on 12/8/2014.
 */
public class ArrayStack<T> implements Stack<T> {

    private Object[] array;
    private int index;

    public ArrayStack(int capacity) {
        this.array = new Object[capacity];
    }

    @Override
    public void push(T item) {
        array[index++] = item;
    }

    @Override
    public T pop() {
        T item = (T) array[--index];
        array[index] = null;
        return item;
    }

    @Override
    public boolean isEmpty() {
        return index == 0;
    }

    @Override
    public ArrayStack<T> clone() {
        ArrayStack<T> clone = new ArrayStack<>(array.length);
        for (int i = 0; i < index; i++) {
            clone.array[i] = array[i];
        }
        clone.index = index;
        return clone;
    }
}

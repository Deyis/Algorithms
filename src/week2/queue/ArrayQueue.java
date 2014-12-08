package week2.queue;

/**
 * Created by Denis_Ivanchenko on 12/8/2014.
 */
public class ArrayQueue<T> implements Queue<T> {

    private Object[] array;
    private int head;
    private int tail;


    public ArrayQueue() {
        array = new Object[1];
    }

    @Override
    public void enqueue(T item) {
        if (tail == array.length) {
            resize(array.length * 2);
        }
        array[tail++] = item;
    }

    @Override
    public T dequeue() {
        T item = (T) array[head];
        array[head++] = null;
        if ((tail - head) == array.length/4) {
            resize(array.length / 2);
        }
        return item;
    }

    @Override
    public boolean isEmpty() {
        return head == tail;
    }

    @Override
    public ArrayQueue<T> clone() {
        ArrayQueue<T> clone = new ArrayQueue<>();
        clone.array = new Object[array.length];

        int size = tail - head;
        for (int i = 0; i < size; i++) {
            clone.array[i] = array[i];
        }

        clone.head = 0;
        clone.tail = size;

        return clone;
    }

    private void resize(int capacity) {
        Object[] copy = new Object[capacity];
        int size = tail - head;
        for (int i = 0; i < size; i++) {
            copy[i] = array[i + head];
        }
        head = 0;
        tail = size;
        array = copy;
    }
}

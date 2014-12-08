package week2.stack;

/**
 * Created by Denis_Ivanchenko on 12/8/2014.
 */
public class ResizingArrayStack<T> implements Stack<T> {

    private Object[] array;
    private int index;


    public ResizingArrayStack() {
        this.array = new Object[1];
    }

    @Override
    public void push(T item) {
        if (index == array.length) {
            resize(2 * array.length);
        }
        array[index++] = item;
    }

    @Override
    public T pop() {
        T item = (T) array[--index];
        array[index] = null;
        if (index > 0 && index == array.length/4) {
            resize(array.length / 2);
        }
        return item;
    }

    @Override
    public boolean isEmpty() {
        return index == 0;
    }

    @Override
    public ResizingArrayStack<T> clone() {
        ResizingArrayStack<T> clone = new ResizingArrayStack<>();
        clone.array = new Object[array.length];
        for (int i = 0; i < index; i++) {
            clone.array[i] = array[i];
        }
        clone.index = index;
        return clone;
    }

    private void resize(int capacity) {
        Object[] copy = new Object[capacity];
        for (int i = 0; i < index; i++) {
            copy[i] = array[i];
        }
        array = copy;
    }
}

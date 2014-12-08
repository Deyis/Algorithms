package week2.queue;

/**
 * Created by Denis_Ivanchenko on 12/8/2014.
 */
public class NodeQueue<T> implements Queue<T> {

    private Node first;
    private Node last;

    @Override
    public void enqueue(T item) {
        Node oldLast = last;
        last = new Node(item, null);
        if (isEmpty()) {
            first = last;
        } else {
            oldLast.next = last;
        }
    }

    @Override
    public T dequeue() {
        T item = first.item;
        first = first.next;
        if (isEmpty()) {
            last = null;
        }
        return item;
    }

    @Override
    public boolean isEmpty() {
        return first == null;
    }

    @Override
    public NodeQueue<T> clone() {
        NodeQueue<T> clone = new NodeQueue<>();
        Node i = first;
        while (i != null) {
            clone.enqueue(i.item);
            i = i.next;
        }
        return clone;
    }



    private class Node {

        private T item;
        private Node next;

        Node(T item, Node next) {
            this.item = item;
            this.next = next;
        }

    }

}

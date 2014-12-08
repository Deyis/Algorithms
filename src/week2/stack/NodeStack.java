package week2.stack;

/**
 * Created by Denis_Ivanchenko on 12/8/2014.
 */
public class NodeStack<T> implements Stack<T>  {

    private Node head;

    @Override
    public void push(T item) {
        head = new Node(item, head);
    }

    @Override
    public T pop() {
        T result = head.item;
        head = head.next;
        return result;
    }

    @Override
    public boolean isEmpty() {
        return head == null;
    }

    @Override
    public NodeStack<T> clone() {
        NodeStack<T> stack = new NodeStack<>();
        stack.head = revert(head);
        return stack;
    }

    public Node revert(Node node){
        if (node.next == null) {
            return new Node(node.item, null);
        }
        return new Node(node.item, revert(node.next));
    }


    private class Node {

        private T item;
        private Node next;

        public Node() {
        }

        Node(T item, Node next) {
            this.item = item;
            this.next = next;
        }


    }
}

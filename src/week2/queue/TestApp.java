package week2.queue;

/**
 * Created by Denis_Ivanchenko on 12/8/2014.
 */
public class TestApp {

    public static void main(String[] args) {

        System.out.println("NODE QUEUE");
        System.out.println("----------------------------------");
        testQueue(new NodeQueue<>());
        System.out.println("----------------------------------");

        System.out.println("ARRAY QUEUE");
        System.out.println("----------------------------------");
        testQueue(new ArrayQueue<>());
        System.out.println("----------------------------------");

        System.out.println("TEST ITERABLE NODE QUEUE");
        System.out.println("----------------------------------");
        testIterableQueue(new NodeQueue<>());
        System.out.println("----------------------------------");

        System.out.println("TEST ITERABLE ARRAY QUEUE");
        System.out.println("----------------------------------");
        testIterableQueue(new ArrayQueue<>());
        System.out.println("----------------------------------");

        System.out.println("TEST ITERABLE CLONED NODE QUEUE");
        System.out.println("----------------------------------");
        testClonedIterableQueue(new NodeQueue<>());
        System.out.println("----------------------------------");

        System.out.println("TEST ITERABLE CLONED ARRAY QUEUE");
        System.out.println("----------------------------------");
        testClonedIterableQueue(new ArrayQueue<>());
        System.out.println("----------------------------------");
    }


    private static void testClonedIterableQueue(Queue<Integer> queue) {
        initQueue(queue);
        for (Integer i : queue.clone()) {
            System.out.print(i);
        }
        System.out.println();
        System.out.println("is queue empty? " + queue.isEmpty());
    }

    private static void testIterableQueue(Queue<Integer> queue) {
        initQueue(queue);
        for (Integer i : queue) {
            System.out.print(i);
        }
        System.out.println();
        System.out.println("is queue empty? " + queue.isEmpty());
    }

    private static void testQueue(Queue<Integer> queue) {
        initQueue(queue);
        printQueue(queue);
    }

    private static void initQueue(Queue<Integer> queue) {
        for (int i = 0; i < 10; i ++) {
            queue.enqueue(i);
        }
    }

    private static void printQueue(Queue<Integer> queue) {
        for (; !queue.isEmpty() ;) {
            System.out.print(queue.dequeue());
        }
        System.out.println();
    }
}

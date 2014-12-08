package week2.queue;

import util.Producer;
import util.TestMethod;
import util.TestWrapper;

/**
 * Created by Denis on 12/8/2014.
 */
public class QueueTestWrapper extends TestWrapper {

    private Producer<Queue<Integer>> producer;
    private Queue<Integer> queue;


    public QueueTestWrapper(Producer<Queue<Integer>> producer) {
        this.producer = producer;
    }

    @TestMethod
    public void testLogic() {
        initQueue();
        validateQueue();
    }

    @TestMethod
    public void testClonedIteratorFunctionality() {
        initQueue();
        testIteratorFunctionality(queue.clone());
        assertTrue(!queue.isEmpty());
    }

    @TestMethod
    public void testIteratorFunctionality() {
        initQueue();
        testIteratorFunctionality(queue);
        assertTrue(queue.isEmpty());
    }

    private void testIteratorFunctionality(Queue<Integer> queue) {
        int i = 0;
        for (Integer item : queue) {
            assertEquals(item, i++);
        }
    }

    private void initQueue() {
        queue = producer.produce();
        for (int i = 0; i < 10; i ++) {
            queue.enqueue(i);
        }
    }

    private void validateQueue() {
        for (int i = 0; !queue.isEmpty() ; i++) {
            assertEquals(queue.dequeue(), i);
        }
    }

}

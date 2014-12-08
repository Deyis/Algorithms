package week2.queue;

/**
 * Created by Denis_Ivanchenko on 12/8/2014.
 */
public class TestApp {

    public static void main(String[] args) {

        QueueTestWrapper testWrapper = new QueueTestWrapper(NodeQueue<Integer>::new);
        testWrapper.testLogic();
        testWrapper.testIteratorFunctionality();
        testWrapper.testClonedIteratorFunctionality();

        testWrapper = new QueueTestWrapper(ArrayQueue<Integer>::new);
        testWrapper.testLogic();
        testWrapper.testIteratorFunctionality();
        testWrapper.testClonedIteratorFunctionality();

    }

}

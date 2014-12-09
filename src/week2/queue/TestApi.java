package week2.queue;

/**
 * Created by Denis_Ivanchenko on 12/8/2014.
 */

public class TestApi implements util.TestApi {

    public void runAll() {
        new QueueTestWrapper(NodeQueue<Integer>::new).runAllTests();
        new QueueTestWrapper(ArrayQueue<Integer>::new).runAllTests();
    }


    public static void main(String[] args) {
        new TestApi().runAll();
    }

}

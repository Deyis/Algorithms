package week2.queue;

/**
 * Created by Denis_Ivanchenko on 12/8/2014.
 */
public class TestApp {

    public static void main(String[] args) {

        new QueueTestWrapper(NodeQueue<Integer>::new).runFullTest();
        new QueueTestWrapper(ArrayQueue<Integer>::new).runFullTest();

    }

}

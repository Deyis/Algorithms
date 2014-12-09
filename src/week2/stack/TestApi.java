package week2.stack;

/**
 * Created by Denis_Ivanchenko on 12/8/2014.
 */
public class TestApi {

    public static void main(String[] args) {

        new StackTestWrapper(NodeStack<Integer>::new).runAllTests();
        new StackTestWrapper(() -> new ArrayStack<>(10)).runAllTests();
        new StackTestWrapper(ResizingArrayStack<Integer>::new).runAllTests();

    }

}

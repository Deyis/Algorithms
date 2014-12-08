package week2.stack;

import util.Producer;

/**
 * Created by Denis_Ivanchenko on 12/8/2014.
 */
public class TestApp {

    public static void main(String[] args) {

        new StackTestWrapper(NodeStack<Integer>::new).runFullTest();
        new StackTestWrapper(() -> new ArrayStack<>(10)).runFullTest();
        new StackTestWrapper(ResizingArrayStack<Integer>::new).runFullTest();

    }

}

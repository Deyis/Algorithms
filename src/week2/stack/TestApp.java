package week2.stack;

import util.Producer;

/**
 * Created by Denis_Ivanchenko on 12/8/2014.
 */
public class TestApp {

    public static void main(String[] args) {

        StackTestWrapper testWrapper = new StackTestWrapper(NodeStack<Integer>::new);
        testWrapper.testStackLogic();
        testWrapper.testStackIteratorFunctionality();
        testWrapper.testClonedStackIteratorFunctionality();

        testWrapper = new StackTestWrapper(() -> new ArrayStack<>(10));
        testWrapper.testStackLogic();
        testWrapper.testStackIteratorFunctionality();
        testWrapper.testClonedStackIteratorFunctionality();

        testWrapper = new StackTestWrapper(ResizingArrayStack<Integer>::new);
        testWrapper.testStackLogic();
        testWrapper.testStackIteratorFunctionality();
        testWrapper.testClonedStackIteratorFunctionality();

    }

}

package week2.stack;

import util.Producer;
import util.TestWrapper;

/**
 * Created by Denis on 12/8/2014.
 */
public class StackTestWrapper extends TestWrapper {

    private Producer<Stack<Integer>> producer;
    private Stack<Integer> stack;

    public StackTestWrapper(Producer<Stack<Integer>> producer) {
        this.producer = producer;
    }

    public void testClonedStackIteratorFunctionality() {
        initStack();
        testStackIteratorFunctionality(stack.clone());
        assertTrue(!stack.isEmpty());
    }

    public void testStackIteratorFunctionality() {
        initStack();
        testStackIteratorFunctionality(stack);
        assertTrue(stack.isEmpty());
    }

    public void testStackLogic() {
        initStack();
        validateStack();
    }

    private void testStackIteratorFunctionality(Stack<Integer> stack) {
        int i = 9;
        for (Integer item: stack) {
            assertEquals(i--, item);
        }
    }

    private void initStack() {
        stack = producer.produce();
        for (int i = 0; i < 10; i ++) {
            stack.push(i);
        }
    }

    private void validateStack() {
        for (int i = 9; !stack.isEmpty() ; i--) {
            assertEquals(i, stack.pop());
        }
    }
}

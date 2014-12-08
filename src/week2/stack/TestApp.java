package week2.stack;

/**
 * Created by Denis_Ivanchenko on 12/8/2014.
 */
public class TestApp {

    public static void main(String[] args) {

        System.out.println("NODE STACK");
        System.out.println("----------------------------------");
        testStack(new NodeStack<>());
        System.out.println("----------------------------------");

        System.out.println("ARRAY STACK");
        System.out.println("----------------------------------");
        testStack(new ArrayStack<>(10));
        System.out.println("----------------------------------");

        System.out.println("RESIZING ARRAY STACK");
        System.out.println("----------------------------------");
        testStack(new ResizingArrayStack<>());
        System.out.println("----------------------------------");

        System.out.println("TEST ITERABLE NODE STACK");
        System.out.println("----------------------------------");
        testStackIterable(new NodeStack<>());
        System.out.println("----------------------------------");

        System.out.println("TEST ITERABLE ARRAY STACK");
        System.out.println("----------------------------------");
        testStackIterable(new ArrayStack<>(10));
        System.out.println("----------------------------------");

        System.out.println("TEST ITERABLE RESIZING ARRAY STACK");
        System.out.println("----------------------------------");
        testStackIterable(new ResizingArrayStack<>());
        System.out.println("----------------------------------");


        System.out.println("TEST FAKE ITERABLE NODE STACK");
        System.out.println("----------------------------------");
        testClonedStackIterable(new NodeStack<>());
        System.out.println("----------------------------------");

        System.out.println("TEST FAKE ITERABLE ARRAY STACK");
        System.out.println("----------------------------------");
        testClonedStackIterable(new ArrayStack<>(10));
        System.out.println("----------------------------------");

        System.out.println("TEST FAKE ITERABLE RESIZING ARRAY STACK");
        System.out.println("----------------------------------");
        testClonedStackIterable(new ResizingArrayStack<>());
        System.out.println("----------------------------------");

    }


    private static void testClonedStackIterable(Stack<Integer> stack) {
        initStack(stack);
        for (Integer i: stack.clone()) {
            System.out.print(i);
        }
        System.out.println();
        System.out.println("is stack empty? " + stack.isEmpty());
    }

    private static void testStackIterable(Stack<Integer> stack) {
        initStack(stack);
        for (Integer i: stack) {
            System.out.print(i);
        }
        System.out.println();
        System.out.println("is stack empty? " + stack.isEmpty());
    }

    private static void testStack(Stack<Integer> stack) {
        initStack(stack);
        printStack(stack);
        System.out.println();
    }

    private static void initStack(Stack<Integer> stack) {
        for (int i = 0; i < 10; i ++) {
            stack.push(i);
        }
    }

    private static void printStack(Stack<Integer> stack) {
        for (; !stack.isEmpty() ;) {
            System.out.print(stack.pop());
        }
    }
}

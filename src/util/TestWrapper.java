package util;

import java.lang.reflect.InvocationTargetException;
import java.util.Arrays;

/**
 * Created by Denis on 12/8/2014.
 */
public class TestWrapper {

    public void runAllTests() {
        Arrays.asList(this.getClass().getDeclaredMethods())
                .stream()
                .filter(method -> method.isAnnotationPresent(TestMethod.class))
                .forEach(method -> {
                    System.out.println("Start method: " + method.getName());
                    try {
                        method.invoke(this);
                    } catch (Throwable e) {
                        e.printStackTrace();
                    }
                });
    }

    protected void assertEquals(Integer expected, Integer actual) {
        if (!expected.equals(actual)) {
            throw new IllegalArgumentException("expected: " + expected+ " actual: " + actual);
        }
    }

    protected void assertTrue(Boolean statement) {
        if (!statement) {
            throw new IllegalArgumentException();
        }
    }

}

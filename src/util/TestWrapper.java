package util;

/**
 * Created by Denis on 12/8/2014.
 */
public class TestWrapper {

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

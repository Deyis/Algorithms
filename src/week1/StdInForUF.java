package week1;

/**
 * Created by Denis_Ivanchenko on 12/4/2014.
 */
public class StdInForUF {

    private static int[] array = {
            4, 3,
            3, 8,
            6, 5,
            9, 4,
            2, 1,
            8, 9,
            5, 0,
            7, 2,
            6, 1,
            1, 0,
            6, 7
    };

    private static int[][] connected = {
            {4, 3, 8, 9},
            {6, 5, 0, 2, 1, 7}
    };

    private static int currentIndex = 0;

    public static void reset() {
        currentIndex = 0;
    }

    public static int readInt() {
        return array[currentIndex++];
    }

    public static int readSize() {
        return 10;
    }

    public static int[][] getConnected() {
        return connected;
    }

    public static boolean isEmpty() {
        return currentIndex == array.length;
    }
}

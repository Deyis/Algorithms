package week1;

/**
 * Created by Denis_Ivanchenko on 12/4/2014.
 */
public class TestApi {

    public static void main(String[] args) {

        int N = StdInForUF.readSize();

        new UFTestWrapper(()-> new QuickFindUF(N)).runAllTests();
        new UFTestWrapper(()-> new QuickUnionUF(N)).runAllTests();
        new UFTestWrapper(()-> new QuickUnionImprUF(N)).runAllTests();

    }
}

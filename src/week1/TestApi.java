package week1;

/**
 * Created by Denis_Ivanchenko on 12/4/2014.
 */
public class TestApi {

    public static void main(String[] args) {
        int N = StdIn.readInt();
        UF uf = new QuickFindUF(N);
        while (!StdIn.isEmpty()) {
            int p = StdIn.readInt();
            int q = StdIn.readInt();
            if (!uf.isConnected(p, q)) {
                uf.union(p,q);
                System.out.println(p +"  "+ q);
            }
        }

        System.out.println("---------------------------------------------");
        StdIn.reset();
        N = StdIn.readInt();
        uf = new QuickUnionUF(N);
        while (!StdIn.isEmpty()) {
            int p = StdIn.readInt();
            int q = StdIn.readInt();
            if (!uf.isConnected(p, q)) {
                uf.union(p,q);
                System.out.println(p +"  "+ q);
            }
        }
    }
}

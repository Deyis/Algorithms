package week1;

/**
 * Created by Denis_Ivanchenko on 12/4/2014.
 */
public class QuickUnionUF implements UF {

    private int id[];

    public QuickUnionUF(int n) {
        id = new int[n];
        for (int i =0; i < n; i++) {
            id[i] = i;
        }
    }

    private int root(int i) {
        while (i != id[i]) {
            i = id[i];
        }
        return i;
    }

    public void union(int p, int q) {
        int i = root(p);
        int j = root(q);
        id[i] = j;
    }

    public boolean isConnected(int p, int q) {
        return root(id[p]) == root(id[q]);
    }


}

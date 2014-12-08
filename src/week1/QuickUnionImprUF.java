package week1;

/**
 * Created by Denis_Ivanchenko on 12/4/2014.
 */
public class QuickUnionImprUF implements UF {

    private int id[];
    private int sz[];

    public QuickUnionImprUF(int n) {
        id = new int[n];
        sz = new int[n];
        for (int i =0; i < n; i++) {
            id[i] = i;
            sz[i] = 0;
        }
    }

    private int root(int i) {
        while (i != id[i]) {
//          Path compression
            id[i] = id[id[i]];
            i = id[i];
        }
        return i;
    }

    public void union(int p, int q) {
        int i = root(p);
        int j = root(q);
        if (i == j) {
            return;
        }
//      Counting on weight of tree
        if (sz[i] <= sz[j]) {
            id[i] = j;
            sz[j] += sz[i];
        } else {
            id[j] = i;
            sz[i] += sz[j];
        }
    }

    public boolean isConnected(int p, int q) {
        return root(id[p]) == root(id[q]);
    }

}

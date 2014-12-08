package week1;

/**
 * Created by Denis_Ivanchenko on 12/4/2014.
 */
public class QuickFindUF implements UF {

    private int id[];

    public QuickFindUF(int n) {
        id = new int[n];
        for (int i =0; i < n; i++) {
            id[i] = i;
        }
    }

    public void union(int p, int q) {
        int pid = id[p];
        int qid = id[q];
        for (int i = 0; i < id.length; i++) {
            if (id[i] == pid) {
                id[i] = qid;
            }
        }

    }

    public boolean isConnected(int p, int q) {
        return id[p] == id[q];
    }



}

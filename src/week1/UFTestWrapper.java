package week1;

import util.Producer;
import util.TestMethod;
import util.TestWrapper;

/**
 * Created by Denis_Ivanchenko on 12/9/2014.
 */
public class UFTestWrapper extends TestWrapper {

    private UF uf;
    private Producer<UF> producer;

    public UFTestWrapper(Producer<UF> producer) {
        this.producer = producer;
    }

    @TestMethod
    public void testUFLogic() {
        initUF();
        testUF();
    }

    private void initUF() {
        uf = producer.produce();
        StdInForUF.reset();
        while (!StdInForUF.isEmpty()) {
            int p = StdInForUF.readInt();
            int q = StdInForUF.readInt();
            uf.union(p,q);
        }
    }

    private void testUF() {
        int[][] sets = StdInForUF.getConnected();

        for (int[] connected : sets) {
            for (int i = 0; i < connected.length; i++) {
                for (int j = 0; j < connected.length; j++) {
                    assertTrue(uf.isConnected(connected[i], connected[j]));
                }
            }
        }

    }
}

package week2;

import util.TestAllClasses;
import util.TestApiClasses;

/**
 * Created by Denis_Ivanchenko on 12/9/2014.
 */
@TestApiClasses( apiClasses =  { week2.stack.TestApi.class, week2.queue.TestApi.class})
public class TestAllWeek2 extends TestAllClasses {

    public static void main(String[] args) {
        new TestAllWeek2().runAll();
    }

}

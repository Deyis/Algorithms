import util.TestAllClasses;
import util.TestApiClasses;

/**
 * Created by Denis_Ivanchenko on 12/9/2014.
 */

@TestApiClasses( apiClasses =  { week2.TestAllWeek2.class, week1.TestApi.class})
public class TestAll extends TestAllClasses {

    public static void main(String[] args) {
        new TestAll().runAll();
    }

}

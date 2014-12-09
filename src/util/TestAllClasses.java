package util;

import java.lang.reflect.InvocationTargetException;

/**
 * Created by Denis_Ivanchenko on 12/9/2014.
 */

@TestApiClasses(apiClasses =  {})
public class TestAllClasses implements TestApi {

    public void runAll() {
        Class clazz = this.getClass();
        if (clazz.isAnnotationPresent(TestApiClasses.class)) {
            TestApiClasses annotation = (TestApiClasses) clazz.getAnnotation(TestApiClasses.class);
            for (Class testedClass: annotation.apiClasses()) {
                try {
                    System.out.println("Start testing: " + testedClass.getCanonicalName());
                    testedClass.getMethod("runAll").invoke(testedClass.newInstance());
                } catch (NoSuchMethodException | InvocationTargetException | IllegalAccessException |InstantiationException e) {
                    e.printStackTrace();
                }
            }
        }
    }

}

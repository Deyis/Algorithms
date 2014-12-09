package util;

import java.lang.annotation.*;

/**
 * Created by Denis_Ivanchenko on 12/9/2014.
 */


@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.TYPE)
public @interface TestApiClasses {

    Class[] apiClasses();

}

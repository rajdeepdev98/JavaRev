import java.lang.annotation.Documented;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

/**
 * Author : Rajdeep Deb
 * Date   : 04-08-2024
 * Time   : 12:44 PM
 */
@Retention(RetentionPolicy.RUNTIME)
@Documented
public @interface Categories {

    Category [] value();
}

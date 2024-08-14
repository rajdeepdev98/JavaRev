import java.lang.annotation.Documented;
import java.lang.annotation.Repeatable;

/**
 * Author : Rajdeep Deb
 * Date   : 04-08-2024
 * Time   : 12:43 PM
 */
@Repeatable(Categories.class)
@Documented
public @interface Category {

    String name();
}

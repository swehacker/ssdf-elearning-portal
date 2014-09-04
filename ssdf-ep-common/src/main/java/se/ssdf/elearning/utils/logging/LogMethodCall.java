package se.ssdf.elearning.utils.logging;

import org.apache.log4j.Level;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Retention(RetentionPolicy.RUNTIME)
@Target(value = {ElementType.METHOD, ElementType.CONSTRUCTOR})
public @interface LogMethodCall {
    boolean entry() default true;
    boolean exit() default true;
    String prefix() default "";
    String suffix() default "";
    int level() default Level.DEBUG_INT;
}
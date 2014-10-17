package se.ssdf.elearning.utils.logging;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Retention(RetentionPolicy.RUNTIME)
@Target(value = {ElementType.FIELD})
public @interface LogFieldCall {
    boolean read() default true;

    boolean write() default true;

    String prefix() default "";

    String suffix() default "";

    String level() default "DEBUG";
}

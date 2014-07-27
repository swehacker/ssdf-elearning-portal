package se.ssdf.elearning.common.profiles;

import org.springframework.context.annotation.Profile;

import java.lang.annotation.*;

@Target(ElementType.TYPE)
@Retention(RetentionPolicy.RUNTIME)
@Profile("dev")
public @interface Dev {
}

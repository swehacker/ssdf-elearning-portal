package se.ssdf.elearning.web.config;

import org.springframework.security.web.context.AbstractSecurityWebApplicationInitializer;

public class WebSecurityInitializer extends AbstractSecurityWebApplicationInitializer {

    public WebSecurityInitializer() {
        super(SecurityConfig.class, CoreConfig.class);
    }
}


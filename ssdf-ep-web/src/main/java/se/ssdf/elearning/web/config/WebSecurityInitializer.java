package se.ssdf.elearning.web.config;

import org.springframework.core.annotation.Order;
import org.springframework.security.web.context.AbstractSecurityWebApplicationInitializer;

@Order(1)
public class WebSecurityInitializer extends AbstractSecurityWebApplicationInitializer {

    public WebSecurityInitializer() {
        super(WebSecurityConfig.class, WebConfig.class);
    }
}


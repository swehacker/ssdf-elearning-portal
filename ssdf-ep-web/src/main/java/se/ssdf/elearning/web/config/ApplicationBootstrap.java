package se.ssdf.elearning.web.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Import;

@ComponentScan
@Import({WebSecurityConfig.class, WebConfig.class, DatabaseConfig.class})
public class ApplicationBootstrap {

}

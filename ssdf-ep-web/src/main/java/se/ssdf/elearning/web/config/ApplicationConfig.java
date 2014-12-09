package se.ssdf.elearning.web.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Import;

@ComponentScan(basePackages = { "se.ssdf.elearning" })
@Import({ WebConfig.class, WebSecurityConfig.class, DatabaseConfig.class })
public class ApplicationConfig {
}

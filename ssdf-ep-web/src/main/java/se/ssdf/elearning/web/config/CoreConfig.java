package se.ssdf.elearning.web.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

@Configuration
@ComponentScan(basePackages = "se.ssdf.elearning")
public class CoreConfig extends WebMvcConfigurerAdapter {

}

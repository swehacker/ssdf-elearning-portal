package se.ssdf.elearning.web.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;
import se.ssdf.elearning.utils.logging.AOPLogger;

@Configuration
@ComponentScan(basePackages = "se.ssdf.elearning")
@EnableAspectJAutoProxy
public class CoreConfig extends WebMvcConfigurerAdapter {

    @Bean
    public AOPLogger aopLogger() {
        return new AOPLogger();
    }
}

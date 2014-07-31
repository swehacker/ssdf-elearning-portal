package se.ssdf.elearning.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.jndi.JndiObjectFactoryBean;
import se.ssdf.elearning.utils.profiles.Acceptance;
import se.ssdf.elearning.utils.profiles.Dev;
import se.ssdf.elearning.utils.profiles.Prod;

import javax.naming.NamingException;
import javax.sql.DataSource;

@Configuration
public class DataSourceConfig {

    @Bean
    public DataSource dataSource() throws IllegalArgumentException, NamingException {
        JndiObjectFactoryBean factory = new JndiObjectFactoryBean();
        factory.setExpectedType(DataSource.class);
        factory.setJndiName("java:comp/env/jdbc/ssdfdb");
        factory.afterPropertiesSet();
        DataSource dataSource = (DataSource) factory.getObject();
        return dataSource;
    }

}

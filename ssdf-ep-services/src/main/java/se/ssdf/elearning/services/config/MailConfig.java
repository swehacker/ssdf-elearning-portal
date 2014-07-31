package se.ssdf.elearning.services.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.jndi.JndiObjectFactoryBean;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.mail.javamail.JavaMailSenderImpl;
import se.ssdf.elearning.utils.profiles.Prod;

import javax.mail.Session;
import javax.naming.NamingException;

@Configuration
public class MailConfig {

    /*@Bean
    public JavaMailSender javaMailSender() throws NamingException {

        JndiObjectFactoryBean factory = new JndiObjectFactoryBean();
        factory.setExpectedType(Session.class);
        factory.setJndiName("java:comp/env/mail/ssdf-mail");
        factory.afterPropertiesSet();

        Session session = (Session) factory.getObject();

        JavaMailSenderImpl sender = new JavaMailSenderImpl();
        sender.setSession(session);

        return sender;
    }

    @Bean
    public MailSetup mailSetup() throws NamingException {
        // Mail session @ JNDI
        JndiObjectFactoryBean factory = new JndiObjectFactoryBean();
        factory.setExpectedType(String.class);
        factory.setJndiName("java:comp/env/value/replyto");
        factory.afterPropertiesSet();

        String replyTo = (String) factory.getObject();
        return new MailSetup(replyTo);
    }  */

}

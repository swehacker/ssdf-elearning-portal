package se.ssdf.elearning.services.config;

import org.springframework.context.annotation.Configuration;

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

package pl.student.profiles;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.NoSuchBeanDefinitionException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App {

    public static void main(String[] args) {
        // profile can be set in JVM properties
        ApplicationContext applicationContext = new AnnotationConfigApplicationContext(AppConfig.class);
        Logger logger = LoggerFactory.getLogger(App.class);
        try {
            Foo notDevFoo = (Foo) applicationContext.getBean("notDevFoo");
            logger.info(notDevFoo.foo());
        } catch(NoSuchBeanDefinitionException e) {
            logger.warn("Did not create notDevFoo - wrong profile");
        }
        try {
            Foo devFoo = (Foo) applicationContext.getBean("devFoo");
            logger.info(devFoo.foo());
        } catch(NoSuchBeanDefinitionException e) {
            logger.warn("Did not create devFoo - wrong profile");
        }
    }

}

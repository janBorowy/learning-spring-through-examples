package pl.student.properties;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App {

    public static void main(String[] args) {

        ApplicationContext applicationContext = new AnnotationConfigApplicationContext(AppConfig.class);
        Foo foo = (Foo) applicationContext.getBean("foo");
        Logger logger = LoggerFactory.getLogger(App.class);
        logger.info(foo.foo());

    }

}

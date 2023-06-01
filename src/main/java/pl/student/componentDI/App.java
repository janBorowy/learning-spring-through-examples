package pl.student.componentDI;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import pl.student.componentDI.components.Foo;

public class App {

    public static void main(String[] args) {
        Logger logger = LoggerFactory.getLogger(App.class);
        var applicationContext = new AnnotationConfigApplicationContext(AppConfig.class);
        var fooComponent = (Foo) applicationContext.getBean("fooComponent");
        var fooRepository = (Foo) applicationContext.getBean("fooRepository");
        logger.info("fooComponent bean says : {}", fooComponent.foo());
        logger.info("fooRepository bean says : {}", fooRepository.foo());
        // main advantage - didn't have to name every bean or even register them in config - less boilerplate
    }
}

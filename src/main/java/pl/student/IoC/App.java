package pl.student.IoC;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.web.context.support.XmlWebApplicationContext;
import pl.student.IoC.classes.FooService;

public class App {

    public static void main(String[] args) {
        ApplicationContext applicationContext = //new AnnotationConfigApplicationContext(AppConfig.class);
                //new ClassPathXmlApplicationContext("applicationcontext/user-bean-config.xml");
                new ClassPathXmlApplicationContext("applicationcontext/app-bean-config.xml");
        testContext(applicationContext);
    }

    private static void testContext(ApplicationContext context) {
        // foo is already instansiated
        Logger logger = LoggerFactory.getLogger(App.class);
        // lazy foo is instansiated
        var lazyFoo = (FooService) context.getBean("lazyFooService");
        // log lazyFoo result
        logger.info(lazyFoo.foo());
        // get already created fooService
        var foo = (FooService) context.getBean("fooService");
        // log foo result
        logger.info(foo.foo());
    }

}

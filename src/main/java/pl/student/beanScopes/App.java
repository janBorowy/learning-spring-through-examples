package pl.student.beanScopes;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {

    private static Logger logger = LoggerFactory.getLogger(App.class);

    public static void main(String[] args) {
        ApplicationContext applicationContext = // new AnnotationConfigApplicationContext(AppConfig.class);
                new ClassPathXmlApplicationContext("beanScopes/app-bean-config.xml");
        testSingleton(applicationContext);
        testPrototype(applicationContext);
    }

    private static void testSingleton(ApplicationContext applicationContext) {
        logger.info("----------test singleton----------");
        // this would throw ClassCastException if fooSingleton didn't have implementation of FooSingleton
        var foo1 = (FooSingleton) applicationContext.getBean("fooSingleton");
        var foo2 = (FooSingleton) applicationContext.getBean("fooSingleton");
        logger.info("foo1 = {}", foo1.getMyVal());
        logger.info("foo2 = {}", foo2.getMyVal());
        logger.info("++foo1");
        foo1.setMyVal(foo1.getMyVal() + 1);
        logger.info("foo1 = {}", foo1.getMyVal());
        logger.info("foo2 = {}", foo2.getMyVal());
    }

    private static void testPrototype(ApplicationContext applicationContext) {
        logger.info("----------test prototype----------");
        // this would throw ClassCastException if fooSingleton didn't have implementation of FooPrototype
        var foo1 = (FooPrototype) applicationContext.getBean("fooPrototype");
        var foo2 = (FooPrototype) applicationContext.getBean("fooPrototype");
        logger.info("foo1 = {}", foo1.getMyVal());
        logger.info("foo2 = {}", foo2.getMyVal());
        logger.info("++foo1");
        foo1.setMyVal(foo1.getMyVal() + 1);
        logger.info("foo1 = {}", foo1.getMyVal());
        logger.info("foo2 = {}", foo2.getMyVal());
    }

}

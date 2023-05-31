package pl.student.constructorDI;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {

    public static void main(String[] args) {
        ApplicationContext applicationContext = //new AnnotationConfigApplicationContext(AppConfig.class);
            new ClassPathXmlApplicationContext("constructorDI/app-bean-config.xml");
    }

}

package pl.student.IoC;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Lazy;
import pl.student.IoC.classes.FooService;
import pl.student.IoC.classes.FooServiceImpl;
import pl.student.IoC.classes.FooServiceImplWithFireworks;

/* Java-Based configuration */

@Configuration
public class AppConfig {

    Logger logger = LoggerFactory.getLogger(AppConfig.class);

    @Bean
    public FooService fooService() {
        logger.info("Instantiated fooService");
        return new FooServiceImpl();
    }

    @Bean
    @Lazy
    public FooService lazyFooService() {
        logger.info("Instantiated lazyFooService");
        return new FooServiceImplWithFireworks();
    }

}

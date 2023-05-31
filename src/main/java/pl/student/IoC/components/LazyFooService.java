package pl.student.IoC.components;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Service;

/* Annotation-based configuration */

//@Controller
//@Component
//@Repository
@Service
@Lazy
public class LazyFooService implements pl.student.IoC.classes.FooService {

    Logger logger = LoggerFactory.getLogger(LazyFooService.class);
    public LazyFooService() {
        logger.info("Instantiated lazyFooService");
    }

    @Override
    public String foo() {
        return "*foo*";
    }

}

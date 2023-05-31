package pl.student.IoC.components;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

/* Annotation-based configuration */

//@Controller
//@Component
//@Repository
@Service
public class FooService implements pl.student.IoC.classes.FooService {

    Logger logger = LoggerFactory.getLogger(FooService.class);
    public FooService() {
        logger.info("Instantiated fooService");
    }

    @Override
    public String foo() {
        return "foo";
    }

}

package pl.student.componentDI.components;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Repository;

@Repository
public class FooRepository implements Foo {

    Logger logger = LoggerFactory.getLogger(FooComponent.class);
    public FooRepository() {
        logger.info(foo());
    }

    public String foo() {
        return "repository foo";
    }
}

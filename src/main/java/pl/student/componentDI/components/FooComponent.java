package pl.student.componentDI.components;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

@Component
public class FooComponent implements Foo{

    Logger logger = LoggerFactory.getLogger(FooComponent.class);
    public FooComponent() {
        logger.info(foo());
    }

    @Override
    public String foo() {
        return "component foo";
    }
}

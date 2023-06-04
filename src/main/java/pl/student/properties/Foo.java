package pl.student.properties;

import jakarta.annotation.Resource;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.PropertySource;

public class Foo {

    @Resource
    private PropertyManager propertyManager;

    @Value("${foo.myVal}")
    private String myVal;

    public String foo() {
        return "foo with val: " + myVal;
    }

}

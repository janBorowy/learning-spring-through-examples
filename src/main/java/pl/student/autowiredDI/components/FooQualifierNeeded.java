package pl.student.autowiredDI.components;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class FooQualifierNeeded {

    @Autowired
    //@Qualifier("fooComponent")
    @FooQualifier("fooComponent")
    Foo foo;
}

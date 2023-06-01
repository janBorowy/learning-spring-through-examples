package pl.student.autowiredDI.components;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component("fooServiceFieldAutowired")
public class FooServiceFieldAutowired {

    // Spring injects fooComponent when fooServiceFieldAutowierd is created
    // Not recommended
    @Autowired
    FooComponent fooComponent;

}

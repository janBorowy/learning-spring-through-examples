package pl.student.autowiredDI.components;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component()
public class FooServiceConstructorAutowired {

    FooComponent fooComponent;

    @Autowired
    public FooServiceConstructorAutowired(FooComponent fooComponent) {
        this.fooComponent = fooComponent;
    }

}

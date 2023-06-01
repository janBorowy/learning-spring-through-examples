package pl.student.autowiredDI.components;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service("fooServiceSetterAutowired")
public class FooServiceSetterAutowired {

    FooComponent fooComponent;

    // called when fooServiceSetterAutowired is created
    @Autowired
    public void setFooComponent(FooComponent fooComponent) {
        this.fooComponent = fooComponent;
    }

}

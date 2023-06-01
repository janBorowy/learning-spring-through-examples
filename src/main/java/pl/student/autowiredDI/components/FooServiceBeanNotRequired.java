package pl.student.autowiredDI.components;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import pl.student.IoC.components.FooService;

@Component
@FooQualifier("fooServiceBeanNotRequired")
public class FooServiceBeanNotRequired implements Foo {

    @Autowired(required = false)
    Foo foo;

    @Override
    public String foo() {
        return "foo foo";
    }
}

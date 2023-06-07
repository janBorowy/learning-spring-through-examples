package pl.student.resource_injection;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class Foo1 implements Foo {

    @Override
    public String foo() {
        return "foo1";
    }
}

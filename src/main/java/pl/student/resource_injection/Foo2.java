package pl.student.resource_injection;

import org.springframework.stereotype.Component;

@Component
public class Foo2 implements Foo {

    @Override
    public String foo() {
        return "foo2";
    }
}

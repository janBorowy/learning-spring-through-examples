package pl.student.autowiredDI.components;

import org.springframework.stereotype.Component;

// equivalent to @Component
@Component("fooComponent")
@FooQualifier("fooComponent")
public class FooComponent implements Foo {
    @Override
    public String foo() {
        return "component foo";
    }
}

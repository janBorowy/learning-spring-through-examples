package pl.student.beanScopes;

import lombok.Getter;
import lombok.Setter;

public class FooPrototype implements Foo{
    @Getter
    @Setter
    private int myVal = 0;

    @Override
    public String foo() {
        return "prototype foo";
    }
}

package pl.student.beanScopes;

import lombok.Getter;
import lombok.Setter;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Scope;

public class FooSingleton implements Foo {

    @Getter
    @Setter
    private int myVal = 0;

    @Override
    public String foo() {
        return "single foo";
    }
}

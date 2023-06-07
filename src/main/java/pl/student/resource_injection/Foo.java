package pl.student.resource_injection;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
@Qualifier("foo1")
public interface Foo {
    public String foo();
}

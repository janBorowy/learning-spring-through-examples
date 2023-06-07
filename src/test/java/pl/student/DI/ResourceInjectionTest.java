package pl.student.DI;

import jakarta.annotation.Resource;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit.jupiter.SpringExtension;
import org.springframework.test.context.web.WebAppConfiguration;
import org.springframework.util.Assert;
import pl.student.resource_injection.AppConfig;
import pl.student.resource_injection.Foo;

@ExtendWith(SpringExtension.class)
@ContextConfiguration(classes = {AppConfig.class})
public class ResourceInjectionTest {

    /* Resource injection precendence:
        1. By Name
        2. By Type
        3. By Qualifier
    */

    // @Resource(name="foo") - matches by name
    @Resource // - matches by type
    @Qualifier("foo1")
    private Foo foo;

    @Resource
    @Qualifier("foo2")
    private Foo foo2;

    @Test
    void fooShouldReturnFoo() {
        Assertions.assertNotNull(foo);
        Assertions.assertEquals(foo.foo(), "foo1");
    }

}

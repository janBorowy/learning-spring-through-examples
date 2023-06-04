package properties;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit.jupiter.SpringExtension;
import pl.student.properties.App;

@ExtendWith(SpringExtension.class)
@SpringBootTest(properties = {"foo=foo", "bar=bar"}, classes = App.class)
public class PropertiesSpec {

    @Value("${foo}")
    private String foo;

    @Value("${bar}")
    private String bar;

    @Test
    void shouldFetchProperties() {
        Assertions.assertEquals(foo, "foo");
        Assertions.assertEquals(bar, "bar");
    }

}

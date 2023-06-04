package pl.student.properties;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
@PropertySource("foo_properties.properties")
public class AppConfig {

    @Bean
    public Foo foo() {
        return new Foo();
    }

    @Bean
    public PropertyManager propertyManager() {
        return PropertyManager.getInstance();
    }

}

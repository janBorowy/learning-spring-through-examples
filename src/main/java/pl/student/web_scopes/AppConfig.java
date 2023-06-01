package pl.student.web_scopes;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;
import org.springframework.context.annotation.ScopedProxyMode;
import org.springframework.web.context.WebApplicationContext;

@Configuration
public class AppConfig {

    @Bean
    @Scope(value = WebApplicationContext.SCOPE_REQUEST, proxyMode = ScopedProxyMode.TARGET_CLASS)
    // == @RequestScope
    public Foo fooRequest() {
        return new Foo();
    }

    @Bean
    @Scope(value = WebApplicationContext.SCOPE_SESSION, proxyMode = ScopedProxyMode.TARGET_CLASS)
    // == @SessionScope
    public Foo fooSession() {
        return new Foo();
    }

    @Bean
    @Scope(value = WebApplicationContext.SCOPE_APPLICATION, proxyMode = ScopedProxyMode.TARGET_CLASS)
    // == @ApplicationScope
    // application scope is like singelton, but instance of singleton is shared within single application
    // whereas application scoped beans are shared between all applications in the same ServletContext
    public Foo fooApplication() {
        return new Foo();
    }

    // There is also websocket scope, bean is shared within the same websocket session
}

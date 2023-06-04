package pl.student.profiles;

import jakarta.servlet.ServletContext;
import jakarta.servlet.ServletException;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;
import org.springframework.web.WebApplicationInitializer;
import org.springframework.web.context.WebApplicationContext;

@Configuration
public class AppConfig implements WebApplicationInitializer {

    @Bean("devFoo")
    @Profile("dev")
    public Foo devFoo() {
        return () -> "dev.foo";
    }

    @Bean(name = "notDevFoo")
    @Profile("!dev")
    public Foo notDevFoo() {
        return () -> "not_dev.foo";
    }

    @Override
    public void onStartup(ServletContext servletContext) throws ServletException {
        servletContext.setInitParameter("spring.profiles.active", "dev");
    }
}

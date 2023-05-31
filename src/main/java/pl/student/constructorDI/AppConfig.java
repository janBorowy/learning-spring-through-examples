package pl.student.constructorDI;

import java.sql.Date;
import java.time.LocalDate;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

/* Arguments are just typed into constructors */

@Configuration
@ComponentScan("pl.student.constructorDI")
public class AppConfig {

    @Bean
    public Person person() {
        return new Person("Juliusz", "100-07-12");
    }

    @Bean
    public Dog dog() {
        return new Dog("Spark");
    }

}

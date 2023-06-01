package pl.student.autowiredDI;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(scanBasePackages = "pl.student.autowiredDI.components")
// equivalent to
// @ComponentScan (basePackages = "pl.student.autowiredDI.components")
// @Configuration
// @EnableAutoConfiguration
public class App {

    public static void main(String[] args) {
        SpringApplication.run(App.class, args);
    }

}

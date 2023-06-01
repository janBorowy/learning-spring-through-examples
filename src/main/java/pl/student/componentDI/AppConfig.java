package pl.student.componentDI;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = "pl.student.componentDI.components")
public class AppConfig {
}

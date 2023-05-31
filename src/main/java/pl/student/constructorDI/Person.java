package pl.student.constructorDI;

import java.time.LocalDate;
import java.util.Date;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Person {
    Logger logger = LoggerFactory.getLogger(Person.class);
    public Person(String name, String birthDay) {
        logger.info("{} was born on {}", name, birthDay);
    }
}

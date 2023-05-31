package pl.student.constructorDI;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Dog {
    Logger logger = LoggerFactory.getLogger(Dog.class);
    public Dog(String name) {
        logger.info("Dog with name {} created", name);
    }
}

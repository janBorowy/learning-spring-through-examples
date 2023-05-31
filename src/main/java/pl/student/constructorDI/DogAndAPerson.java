package pl.student.constructorDI;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/* Beans that are part of constructor are autowired */

@Component
public class DogAndAPerson {

    Logger logger = LoggerFactory.getLogger(DogAndAPerson.class);

    @Autowired
    public DogAndAPerson(Person person, Dog dog) {
        // Will produce the references to these instances, beans don't store any info
        logger.info("{} and {} got along", person, dog);
    }

}

package pl.student.junit5testing;


import java.util.Arrays;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assumptions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import static org.junit.jupiter.api.Assertions.*;


public class FooSpec {

    private static int myVal;
    private static Logger logger = LoggerFactory.getLogger(FooSpec.class);

    @BeforeAll
    // this method has to be static
    static void setup() {
        myVal = 0;
    }

    @BeforeEach
    void init() {
        myVal += 1;
    }

    @AfterAll
    // this method has to be static
    static void tearDown() {
        logger.info("Finished computing {} unit tests", myVal);
    }

    @AfterEach
    void progress() {
        logger.info("{} tests done", myVal);
    }

    @DisplayName("Foo passed test one")
    @Test
    void fooTestOne() {
        logger.info("going through test one");
    }

    @Test
    @Disabled("give money and we add this feature")
    void fooDisabled() {
        logger.info("computing something awesome");
    }

    @Test
    void simpleTest() {
        assertTrue(2 + 2 == 4, "The prophecy is true!");
    }

    @Test
    void groupAssertion() {
        var numbers = Arrays.asList(1, 2, 3);
        assertAll("these should equal",
                () -> assertEquals(numbers.get(0), 1),
                () -> assertEquals(numbers.get(1), 2),
                () -> assertEquals(numbers.get(2), 3)
        );
    }

    @Test
    void assumedTest() {
        var myVal = -1;
        // if the assumptions fail, test is simply skipped
        // test doesn't fail but is marked as ignored
        Assumptions.assumeTrue(myVal > 0);
        assertEquals(myVal * myVal, 1);
    }

    @Test
    void excpetionTest() {
        var exception = assertThrows(RuntimeException.class, () -> {
            throw new RuntimeException("oh no");
        });
        assertEquals(exception.getMessage(), "oh no");
    }

}

package geetoor.kurniawan.spring.core;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class CyclycTest {

    @Test
    void testCyclyc() {
        Assertions.assertThrows(Throwable.class, () -> {
            ApplicationContext applicationContext = new AnnotationConfigApplicationContext(CyclycConfig.class);
        });
    }
}

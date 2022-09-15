package geetoor.kurniawan.spring.core;

import geetoor.kurniawan.spring.core.data.Car;
import geetoor.kurniawan.spring.core.processor.IdGeneratorBeanPostProcesor;
import geetoor.kurniawan.spring.core.processor.PrefixIdGeneratorBeanPostProcesor;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

public class OrderedTest {

    @Configuration
    @Import({
            Car.class,
            IdGeneratorBeanPostProcesor.class,
            PrefixIdGeneratorBeanPostProcesor.class
    })
    public static class TestConfig{

    }

    private ConfigurableApplicationContext applicationContext;

    @BeforeEach
    void setUp() {
        applicationContext = new AnnotationConfigApplicationContext(TestConfig.class);
        applicationContext.registerShutdownHook();
    }

    @Test
    void testCar() {
        Car car = applicationContext.getBean(Car.class);

        Assertions.assertNotNull(car.getId());
        Assertions.assertTrue(car.getId().startsWith("PREFIX="));
    }
}

package geetoor.kurniawan.spring.core;

import geetoor.kurniawan.spring.core.service.AuthService;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

public class AwareTest {

    @Configuration
    @Import({
            AuthService.class
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
    void testAware() {
        AuthService service = applicationContext.getBean(AuthService.class);

        Assertions.assertEquals("geetoor.kurniawan.spring.core.service.AuthService", service.getBeanName());
        Assertions.assertNotNull(service.getApplicationContext());

    }
}

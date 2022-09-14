package geetoor.kurniawan.spring.core;

import geetoor.kurniawan.spring.core.client.PaymentGatewayClient;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class FactoryTest {
    private ConfigurableApplicationContext applicationContext;

    @BeforeEach
    void setUp() {
        applicationContext = new AnnotationConfigApplicationContext(FactoryConfig.class);
        applicationContext.registerShutdownHook();
    }

    @Test
    void testFactory() {
        PaymentGatewayClient client = applicationContext.getBean(PaymentGatewayClient.class);

        Assertions.assertNotNull(client);
        Assertions.assertEquals("https://example.com", client.getEndPoint());
        Assertions.assertEquals("public", client.getPublicKey());
        Assertions.assertEquals("private", client.getPrivateKey());
    }
}

package geetoor.kurniawan.spring.core;

import geetoor.kurniawan.spring.core.data.Foo;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class PrimaryTest {

    private ApplicationContext applicationContext;

    @BeforeEach
    void setUp() {
        applicationContext = new AnnotationConfigApplicationContext(PrimaryConfiguration.class);
    }

    @Test
    void testGetPrimary() {
        Foo foo = applicationContext.getBean(Foo.class);
        Foo foo1 = applicationContext.getBean("fooFirst",Foo.class);
        Foo foo2 = applicationContext.getBean("fooSeecond",Foo.class);

        Assertions.assertSame(foo, foo1);
        Assertions.assertNotSame(foo,foo2);
        Assertions.assertNotSame(foo1, foo2);

    }
}

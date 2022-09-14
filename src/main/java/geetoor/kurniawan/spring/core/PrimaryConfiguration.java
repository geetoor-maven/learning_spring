package geetoor.kurniawan.spring.core;

import geetoor.kurniawan.spring.core.data.Foo;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

@Configuration
public class PrimaryConfiguration {

    @Primary
    @Bean(value = "fooFirst")
    public Foo foo1(){
        Foo foo = new Foo();
        return foo;
    }

    @Bean(value = "fooSeecond")
    public Foo foo2(){
        Foo foo = new Foo();
        return foo;
    }

}

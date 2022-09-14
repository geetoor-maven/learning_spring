package geetoor.kurniawan.spring.core.configuration;

import geetoor.kurniawan.spring.core.data.Foo;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class FooConfig {
    @Bean
    public Foo foo(){
        return new Foo();
    }
}

package geetoor.kurniawan.spring.core;

import geetoor.kurniawan.spring.core.data.Bar;
import geetoor.kurniawan.spring.core.data.Foo;
import lombok.extern.slf4j.Slf4j;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.DependsOn;

@Slf4j
@Configuration
public class DepencOnConfig {

    @Bean
    @DependsOn({
            "bar"
    })
    public Foo foo(){
        log.info("Create new Foo");
        return new Foo();
    }

    @Bean
    public Bar bar(){
        log.info("Create new Bar");
        return new Bar();
    }
}

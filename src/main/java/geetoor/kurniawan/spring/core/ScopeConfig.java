package geetoor.kurniawan.spring.core;

import geetoor.kurniawan.spring.core.data.Bar;
import geetoor.kurniawan.spring.core.data.Foo;
import geetoor.kurniawan.spring.core.scope.DoubleTonScope;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.config.CustomScopeConfigurer;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

@Slf4j
@Configuration
public class ScopeConfig {

    @Bean
    @Scope("prototype")
    public Foo foo(){
        log.info("create new Foo");
        return new Foo();
    }

    @Bean
    public CustomScopeConfigurer customScopeConfigurer(){
        CustomScopeConfigurer configurer = new CustomScopeConfigurer();
        configurer.addScope("doubleton", new DoubleTonScope());
        return configurer;
    }


    @Bean
    @Scope("doubleton")
    public Bar bar(){
        log.info("create new bar");
        return new Bar();
    }
}

package geetoor.kurniawan.spring.core.configuration;

import geetoor.kurniawan.spring.core.data.Bar;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class BarConfig {

    @Bean
    public Bar bar(){
        return new Bar();
    }
}

package geetoor.kurniawan.spring.core;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan({
        "geetoor.kurniawan.spring.core.service",
        "geetoor.kurniawan.spring.core.repo",
})
public class ComponentConfig {

}

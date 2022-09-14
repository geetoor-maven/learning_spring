package geetoor.kurniawan.spring.core;

import geetoor.kurniawan.spring.core.configuration.BarConfig;
import geetoor.kurniawan.spring.core.configuration.FooConfig;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

@Configuration
@Import({
        FooConfig.class,
        BarConfig.class
})
public class MainConfig {

}

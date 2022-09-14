package geetoor.kurniawan.spring.core;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = {
        "geetoor.kurniawan.spring.core.configuration"
})
public class ScanConfig {

}

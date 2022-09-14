package geetoor.kurniawan.spring.core;

import geetoor.kurniawan.spring.core.data.cyclyc.CyclycA;
import geetoor.kurniawan.spring.core.data.cyclyc.CyclycB;
import geetoor.kurniawan.spring.core.data.cyclyc.CyclycC;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class CyclycConfig {

    @Bean
    public CyclycA cyclycA(CyclycB cyclycB){
        return new CyclycA(cyclycB);
    }

    @Bean
    public CyclycB cyclycB(CyclycC cyclycC){
        return new CyclycB(cyclycC);
    }

    @Bean
    public CyclycC cyclycC(CyclycA cyclycA){
        return new CyclycC(cyclycA);
    }

}

package geetoor.kurniawan.spring.core;

import geetoor.kurniawan.spring.core.data.Connection;
import geetoor.kurniawan.spring.core.data.Server;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class LifeCycleConfig {

    @Bean
    public Connection connection(){
        return new Connection();
    }

    //@Bean(initMethod = "start", destroyMethod = "stop")
    @Bean
    public Server server(){
        return new Server();
    }
}

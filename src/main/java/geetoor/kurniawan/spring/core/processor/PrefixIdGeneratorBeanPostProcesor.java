package geetoor.kurniawan.spring.core.processor;

import geetoor.kurniawan.spring.core.aware.IdAware;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;
import org.springframework.core.Ordered;
import org.springframework.stereotype.Component;

import java.util.UUID;

@Slf4j
@Component
public class PrefixIdGeneratorBeanPostProcesor implements BeanPostProcessor, Ordered {

    @Override
    public Object postProcessAfterInitialization(Object bean, String beanName) throws BeansException {
        log.info("Prefix Id generator processor for" + beanName);
        if (bean instanceof IdAware){
            log.info("Seat Prefix id generator for " + beanName);
            IdAware idAware = (IdAware) bean;
            idAware.setId("PREFIX="+idAware.getId());

        }
        return bean;
    }

    @Override
    public int getOrder() {
        return 2;
    }
}

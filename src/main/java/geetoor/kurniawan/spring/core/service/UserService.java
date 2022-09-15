package geetoor.kurniawan.spring.core.service;


import geetoor.kurniawan.spring.core.data.User;
import geetoor.kurniawan.spring.core.event.LoginSuccessEvent;
import org.springframework.context.ApplicationEventPublisher;
import org.springframework.context.ApplicationEventPublisherAware;
import org.springframework.stereotype.Component;

@Component
public class UserService implements ApplicationEventPublisherAware {

    private ApplicationEventPublisher applicationEventPublisher;


    @Override
    public void setApplicationEventPublisher(ApplicationEventPublisher applicationEventPublisher) {
        this.applicationEventPublisher = applicationEventPublisher;
    }

    public boolean login(String userName, String password){
        if (isLoginSucces(userName, password)){
            applicationEventPublisher.publishEvent(new LoginSuccessEvent(new User(userName)));
            return true;
        }else {
            return false;
        }
    }

    private boolean isLoginSucces(String userName, String password) {
        return "agus".equals(userName) && "agus".equals(password);
    }
}

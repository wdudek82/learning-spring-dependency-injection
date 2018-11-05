package guru.springframework.didemo.services;

import org.springframework.stereotype.Service;

@Service
public class SetterGreetService implements GreetingService {

    @Override
    public String sayGreeting() {
        return "setterGreetingService";
    }
}

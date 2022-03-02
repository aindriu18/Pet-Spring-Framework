package guru.springframework.sfgdi.Services;

import org.springframework.stereotype.Service;

//by annotating, spring now knows to bring an instance into its context
@Service
public class ConstructorGreetingService implements GreetingService {
    @Override
    public String sayGreeting() {
        return "Hello World - Constructor";
    }
}

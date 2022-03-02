package guru.springframework.sfgdi.Services;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

//Profiles need to be defined in Resources-> application.properties if default is not set.
@Profile({"ES", "default"})
@Service("i18nService")
public class I18nSpanishGreetingService implements GreetingService{
    @Override
    public String sayGreeting() {

        return "Hola Mundo - ES Greeting";
    }
}

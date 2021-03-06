package guru.springframework.sfgdi.controllers;

import guru.services.GreetingService;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;

@Controller
public class ConstructerInjectedController {

    private final GreetingService greetingService;

    // The autowired is not necessary for constructors.
    public ConstructerInjectedController(@Qualifier("constructorGreetingService") GreetingService greetingService) {
        this.greetingService = greetingService;
    }

    public String getGreeting(){
        return greetingService.sayGreeting();
    }
}

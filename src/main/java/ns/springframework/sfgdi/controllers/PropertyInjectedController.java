package ns.springframework.sfgdi.controllers;

import ns.springframework.sfgdi.services.GreetingService;

public class PropertyInjectedController {

    public GreetingService greetingService;

    public String getGreeting(){
      return greetingService.sayGreeting();
    }
}

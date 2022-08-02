package org.andersen.talker.welcome;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/start")
public class WelcomeController {

    @GetMapping
    public Object welcomePage() {
        return "Welcome to talker!";
    }
}

package org.andersen.talker.person;

import jdk.jfr.ContentType;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(value = "/person")
@AllArgsConstructor
public class PersonController {

    private final PersonService personService;

    @GetMapping(value = "/{personNickName}")
    public Person getPersonByNickName(@PathVariable("personNickName") String nickName) {
        return personService.getPersonByNickName(nickName);
    }
}

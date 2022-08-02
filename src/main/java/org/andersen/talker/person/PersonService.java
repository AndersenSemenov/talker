package org.andersen.talker.person;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class PersonService {

    private final PersonRepository personRepository;

    public Person getPersonByNickName(String nickName) {
        return personRepository.getPersonByNickName(nickName)
                .orElseThrow(() -> new RuntimeException("No person was found with nickName " + nickName));
    }
}

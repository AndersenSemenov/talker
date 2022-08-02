package org.andersen.talker.talk;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.andersen.talker.person.Person;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class Talk {

    private Long id;
    private String content;
    private Person person;
}

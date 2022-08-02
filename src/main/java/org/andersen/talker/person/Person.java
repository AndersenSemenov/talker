package org.andersen.talker.person;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.andersen.talker.talk.Talk;

import java.util.List;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class Person {

    private Long id;
    private String nickName;
    private String description;
    private List<Talk> talks;
}

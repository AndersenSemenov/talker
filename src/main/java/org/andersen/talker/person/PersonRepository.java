package org.andersen.talker.person;

import org.andersen.talker.talk.Talk;
import org.apache.ibatis.annotations.*;
import org.apache.ibatis.mapping.FetchType;

import java.util.List;
import java.util.Optional;

@Mapper
public interface PersonRepository {

    @Select("""
            select
                id, nickname, description
            from person
            where nickname = #{nickName}
            """)
    @Results({
            @Result(property = "id", column = "id"),
            @Result(property = "nickName", column = "nickname"),
            @Result(property = "description", column = "description"),
            @Result(property = "talks", column = "id", javaType = List.class,
                    many = @Many(select = "getTalks", fetchType = FetchType.EAGER))
    })
    Optional<Person> getPersonByNickName(String nickName);

    @Select("""
            select
                *
            from talk
            where person_id = #{personId}
            """)
    @Results({
            @Result(property = "id", column = "id"),
            @Result(property = "content", column = "content")
    })
    List<Talk> getTalks(Long personId);
}

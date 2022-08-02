create table if not exists talk
(
    id      bigserial primary key,
    content varchar(1024) not null,
    person_id bigint not null references person(id)
);

insert into talk(content, person_id) values('My new post', 1);
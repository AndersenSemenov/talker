create table if not exists person
(
    id          bigserial primary key,
    nickname    varchar(50) not null,
    description varchar(50) not null
);

insert into person(nickname, description) values('Key', 'Key Oklender, 18 yo');
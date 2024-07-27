create sequence note_id_seq
    as integer
    increment by 50;

create table note (
    id              integer      not null default nextval('note_id_seq')
    , version       integer      not null default 0
    , title         varchar(255) not null
    , content       varchar(255) not null
);

alter sequence note_id_seq
    owned by note.id;
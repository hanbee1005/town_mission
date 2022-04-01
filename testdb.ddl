create table mission
(
    id               int auto_increment
        primary key,
    status           varchar(25)            not null,
    start_at         datetime               not null,
    end_at           datetime               not null,
    adjusted_yn      varchar(1) default 'N' not null,
    contact_yn       varchar(1) default 'Y' not null,
    pay              int                    not null,
    settlement_type  varchar(100)           not null,
    description      longtext               null,
    creator          int                    not null,
    created_at       datetime               not null,
    last_modifier    int                    null,
    last_modified_at datetime               null
);

create table mission_address
(
    id               int auto_increment
        primary key,
    mission_id       int          not null,
    address          varchar(255) not null,
    address_detail   varchar(255) null,
    postal_code      varchar(6)   not null,
    creator          int          not null,
    created_at       datetime     not null,
    last_modifier    int          null,
    last_modified_at datetime     null,
    constraint mission_address_mission_id_fk
        foreign key (mission_id) references mission (id)
);

create table mission_attachment
(
    id                 int auto_increment
        primary key,
    mission_id         int          not null,
    bucket_type        varchar(50)  not null,
    original_file_name varchar(512) not null,
    file_name          varchar(512) not null,
    file_path          varchar(512) not null,
    ordinal            int          not null,
    creator            int          not null,
    created_at         datetime     not null,
    last_modifier      int          null,
    last_modified_at   datetime     null,
    constraint mission_attachment_mission_id_fk
        foreign key (mission_id) references mission (id)
);

create table mission_category
(
    id               int auto_increment
        primary key,
    mission_id       int          not null,
    parent_type      varchar(100) not null,
    type             varchar(100) not null,
    type_name        varchar(255) not null,
    ordinal          int          not null,
    creator          int          not null,
    created_at       datetime     not null,
    last_modifier    int          null,
    last_modified_at datetime     null,
    constraint mission_category_mission_id_fk
        foreign key (mission_id) references mission (id)
);

create table mission_question
(
    id               int auto_increment
        primary key,
    mission_id       int          not null,
    question         varchar(512) not null,
    ordinal          int          not null,
    creator          int          not null,
    created_at       datetime     not null,
    last_modifier    int          null,
    last_modified_at datetime     null,
    constraint mission_question_mission_id_fk
        foreign key (mission_id) references mission (id)
);


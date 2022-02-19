create table if not exists townmission_db.missions (
    id bigint(20) not null comment 'id',
    status varchar(50) comment '상태',
    start_at datetime comment '시작 일시',
    end_at datetime comment '종료 일시',
    adjusted_yn char(1) default 'N' comment '시간 협의 Y/N',
    postal_code varchar(16) comment '우편 번호',
    contact_yn char(1) default 'Y' comment '현장 근무 Y/N',
    pay int default 0 comment '미션 금액',
    settlement_type varchar(50) comment '정산 타입',
    description longtext comment '설명',
    creator int comment '등록 회원 id',
    created_at datetime default current_timestamp not null comment '생성 일시',
    last_modifier int comment '수정 회원 id',
    modified_at datetime default current_timestamp not null comment '수정 일시',

    constraint missions_pk primary key (id)
);

create table if not exists townmission_db.mission_attach (
    id bigint(20) not null comment 'id',
    mission_id bigint(20) comment '미션 id',
    bucket_type varchar(20) comment 's3 버킷 타입',
    original_file_name varchar(255) comment '원본 파일 명',
    file_name varchar(255) comment '서버 파일 명',
    file_path varchar(500) comment '파일 경로',
    file_size int comment '파일 크기',
    last_modifier int comment '수정 회원 id',
    modified_at datetime default current_timestamp not null comment '수정 일시',

    constraint mission_attach_pk primary key (id),
    constraint mission_attach_fk_mission_id foreign key (mission_id) references missions (id)
);

create table if not exists townmission_db.mission_question (
    id bigint(20) not null comment 'id',
    mission_id bigint(20) comment '미션 id',
    question varchar(255) comment '질문',
    type varchar(50) comment '질문 타입',
    ordinal int comment '정렬 순서',
    last_modifier int comment '수정 회원 id',
    modified_at datetime default current_timestamp not null comment '수정 일시',

    constraint mission_question_pk primary key (id),
    constraint mission_question_fk_mission_id foreign key (mission_id) references missions (id)
);

create table if not exists townmission_db.mission_category (
    id bigint(20) not null comment 'id',
    mission_id bigint(20) comment '미션 id',
    parent_type varchar(50) comment '상위 카테고리 타입',
    type varchar(50) comment '하위 카테고리 타입',
    ordinal int comment '정렬 순서',
    last_modifier int comment '수정 회원 id',
    modified_at datetime default current_timestamp not null comment '수정 일시',

    constraint mission_category_pk primary key (id),
    constraint mission_category_fk_mission_id foreign key (mission_id) references missions (id)
);
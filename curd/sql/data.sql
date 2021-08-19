use curd;

create table data(
    id bigint auto_increment comment 'id' primary key,
    data varchar(255) default '' not null comment '数据'
)
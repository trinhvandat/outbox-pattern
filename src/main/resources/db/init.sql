drop table if exists orders;
drop table if exists order_log;

create table orders (
    id varchar(255) primary key not null,
    total int,
    status varchar(50),
    buyer varchar(255)
);

create table order_log(
    id int primary key not null auto_increment,
    change_type varchar(255),
    detail_order text
);
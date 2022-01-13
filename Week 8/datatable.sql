-- brendan DB
create table USER_ACCOUNT 
(
USER_NAME VARCHAR(30) not null,

GENDER    VARCHAR(1) not null,

PASSWORD  VARCHAR(30) not null,

primary key (USER_NAME)

);


-- table creation

create table PRODUCT

(

CODE  VARCHAR(20) not null,

NAME  VARCHAR(128) not null,

PRICE FLOAT not null,

primary key (CODE)

) ;

 
-- table data

insert into user_account (USER_NAME, GENDER, PASSWORD)

values ('brendan', 'M', 'brendan01');

insert into user_account (USER_NAME, GENDER, PASSWORD)

values ('erica', 'M', 'erica01');

insert into product (CODE, NAME, PRICE)

values ('P001', 'Java Core', 100);

insert into product (CODE, NAME, PRICE)

values ('P002', 'C# Core', 90);
 
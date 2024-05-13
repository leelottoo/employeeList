drop table employees;

create table employees(
	id varchar2(10) not null,
	pass varchar2(10) not null,
	name varchar2(24),
	lev char(1) default 'a',
	enter date default sysdate,
	gender char(1) default '1',
	phone varchar(30),
	primary key(id)
);

delete from employees;

insert into employees values ('admin','1111','한정교','A',to_date('2014/04/17','yy/mm/dd'), '1', '010-1111-1111');
insert into employees values ('subin','2222','홍길동','B',to_date('2014/04/17','yy/mm/dd'), '2', '010-2222-2222');
insert into employees values ('pinksung','3333','김자바','A',to_date('2014/04/17','yy/mm/dd'), '2', '010-2222-2222');

select * from employees;

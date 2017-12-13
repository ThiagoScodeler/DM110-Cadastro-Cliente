create table cliente (
id integer not null,
name varchar(80) not null,
email varchar(80) not null,
constraint pk_cliente primary key (id)
);
create sequence seq_cliente;
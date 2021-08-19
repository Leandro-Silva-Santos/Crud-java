create database DespesasDB;
use DespesasDB;

create table despesas (
	id int auto_increment primary key,
    descricao varchar(100),
    dat date,
    valor decimal(10,2),
    categoria varchar(60)
);

select * from despesas;
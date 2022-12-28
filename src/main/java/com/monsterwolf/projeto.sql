create database projeto;
use projeto;

create table cliente(
id integer primary key auto_increment,
nome varchar(50),
cpf varchar(30), 
email varchar(30),
senha varchar(30)
);

create table carrinho (
id integer primary key auto_increment,
produto varchar(30),
preco varchar(10),
quantidade integer
);

create table vendas (
id integer primary key auto_increment,
nome_produto varchar(50),
valor varchar(10), 
quantidade integer
);

create database db_ecommerce;

create table tb_user
(
id_user int primary key auto_increment,
nom_user varchar(100),
ape_user varchar(100),
email_user varchar(100),
pass_user varchar(100),
cel_user char(9),
sex_user char(1)
);
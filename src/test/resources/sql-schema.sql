create database if not exists ims;
drop table if exists ims.customers;
drop table if exists ims.items;
frop table if exists ims.orders;
create table ims.customers(id int primary key auto_increment, first_name varchar(40), surname varchar(40));
create table ims.items(id int primary key auto_increment, name varchar(40), itemsPrice double, itemsAgeRestriction int);
create table ims.orders(id int primary key auto_increment, ordersNumItems int, ordersCost double, ordersDate varchar(40), item_id int not null, customer_id int not null, foreign key(customer_id) references customers(id), foreign key(item_id) references items(id));

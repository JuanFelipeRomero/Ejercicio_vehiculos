create role userdb with password '123456';
create database vehiculos owner userdb;
ALTER ROLE userdb LOGIN;

MyBatisSnippets
================


Database 준비
-------------

- mysql
- create database mybatis_test;
- grant all privileges on mybatis_test.* to 'mybatis_user'@'localhost' identified by 'mybatis_pass' with grant option;
- flush privileges;
- create table model1 ( name char(200), description char(200) );
- insert into model1(name, description) values('James','developer');
- insert into model1(name, description) values('Jane','designer');

- create table model2 ( keyfield char(200), valuefield char(200) );
- insert into model2(keyfield, valuefield) values('k1','v1');
- insert into model2(keyfield, valuefield) values('k2','v2');
create database storedb;

create user 'kingsley'@'localhost'identified by 'Store123';
grant all privileges on storedb.* to 'kingsley'@'localhost';
flush privileges ;
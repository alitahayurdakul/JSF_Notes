CREATE USER 'demo'@'localhost' IDENTIFIED BY 'demo';

GRANT ALL PRIVILEGES ON * . * TO 'demo'@'localhost';

alter user 'demo'@'localhost' identified with mysql_native_password by 'demo';
use hr_schema;
show variables like "secure_file_priv";



select * into outfile
'd:/javainductionio/sql/employees.txt' from employees;


select phone_number,email into outfile
'd:/javainductionio/sql/employees_contact.txt' from employees;

select * from employees;


select phone_number,email into outfile
'd:/javainductionio/sql/employees_contact.csv' 
fields
terminated by ','
optionally enclosed by "'"
lines terminated by '\r\n'
from employees;


create table user_credentials(
sr_no int primary key auto_increment,
user_name varchar(40),
pass_word varchar(40));


load data infile 'd:/javainductionio/sql/credentials.csv'
into table user_credentials
fields terminated by ','
lines terminated by '\r\n'
ignore 1 rows;

select * from user_credentials;
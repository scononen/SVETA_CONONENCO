package org.example.homework_nr_16.customer_db;

public class sql {
    create table customer_information (
            customer_id serial primary key,
            name varchar(20),
    surname varchar(20),
    phone_number varchar(9),
    is_active bool
)
    select * from customer_information;
    insert into customer_information (name,surname,phone_number,is_active)
    values
            ('Vladimir','Popov','067345567',true),
('Alexei','Ivanov','079456738',false),
        ('Stepan','Terzi','069324534',true),
        ('Andrei','Stefanet','069569789',false),
        ('Reghina','Sirbu','067345231',true),
        ('Serghei','Borduja','079789567',false),
        ('Ala','Corovai','067789789',true),
        ('Ion','Ciobanu','062356798',false),
        ('Vica','Tepordei','069200300',true),
        ('Semion','Abalduev','079567400',false)

    select * from customer_information
    where customer_id between 1 and 5

    select * from customer_information
    where name like 'A%'

    select * from customer_information
    where name like 'V%e%r_'

    select * from customer_information
    where is_active =true

    select name,phone_number from customer_information
}

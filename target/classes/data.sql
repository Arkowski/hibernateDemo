insert into Addresses (street, city) values ('Mickiewicza1', 'Krakow1');
insert into Addresses (street, city) values ('Mickiewicza2', 'Krakow2');
insert into Addresses (street, city) values ('Mickiewicza3', 'Krakow3');
insert into Addresses (street, city) values ('Mickiewicza4', 'Krakow4');

insert into Students(name, surname, course, address_id) values ('Ania1', 'Nowak1', 'Matematyka',1);
insert into Students(name, surname, course, address_id) values ('Ania2', 'Nowak2', 'Matematyka',2);
insert into Students(name, surname, course, address_id) values ('Ania3', 'Nowak3', 'Matematyka',3);
insert into Students(name, surname, course, address_id) values ('Ania4', 'Nowak4', 'Matematyka',4);

insert into Books (author, title, student_id) values ('King', 'Stukostrachy', 1);
insert into Books (author, title, student_id) values ('autor1', 'ksiazka1', 1);
insert into Books (author, title, student_id) values ('Coelho', 'superKsiazka', 3);
insert into Books (author, title, student_id) values ('autor2', 'ksiazka3', 4);
insert into Books (author, title, student_id) values ('autor5', 'ksiazka4', 1);
insert into Books (author, title, student_id) values ('autor5', 'ksiazka7', null);
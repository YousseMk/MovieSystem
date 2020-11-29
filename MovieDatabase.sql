create Database MovieDatabase;

create table if not exists MovieDatabase.Theatre(
name varchar(255),
theatrenum int PRIMARY KEY,
theatrecap int);

insert into `MovieDatabase`.`Theatre`(`name`, `theatrenum`, `theatrecap`) values ('Cineplex', 1, 25);
insert into `MovieDatabase`.`Theatre`(`name`, `theatrenum`, `theatrecap`) values ('Cineplex', 2, 25);
insert into `MovieDatabase`.`Theatre`(`name`, `theatrenum`, `theatrecap`) values ('Cineplex', 3, 25);
insert into `MovieDatabase`.`Theatre`(`name`, `theatrenum`, `theatrecap`) values ('Cineplex', 4, 25);
insert into `MovieDatabase`.`Theatre`(`name`, `theatrenum`, `theatrecap`) values ('Cineplex', 5, 25);
insert into `MovieDatabase`.`Theatre`(`name`, `theatrenum`, `theatrecap`) values ('Cineplex', 6, 25);
insert into `MovieDatabase`.`Theatre`(`name`, `theatrenum`, `theatrecap`) values ('Cineplex', 7, 25);
insert into `MovieDatabase`.`Theatre`(`name`, `theatrenum`, `theatrecap`) values ('Cineplex', 8, 25);
insert into `MovieDatabase`.`Theatre`(`name`, `theatrenum`, `theatrecap`) values ('Cineplex', 9, 25);
insert into `MovieDatabase`.`Theatre`(`name`, `theatrenum`, `theatrecap`) values ('Cineplex', 10, 25);

create table if not exists MovieDatabase.RegisteredUser(
name varchar(255),
email varchar(255),
address varchar(255),
memberid int PRIMARY KEY,
username varchar(255),
password varchar(255),
cardnum varchar(255));

create table if not exists MovieDatabase.Booking(
bookingid int PRIMARY KEY ,
memberid int,
seatrow varchar(255),
seatcol int,
moviename varchar(255),
theatrenum int,
showstart varchar(255),
showend varchar(255),
foreign key(theatrenum) references theatre(theatrenum),
Foreign Key(memberid) references RegisteredUser(memberid));


create table if not exists MovieDatabase.Movie(
name varchar(255),
theatrenum int,
showstart varchar(255),
showend varchar(255),
foreign key(theatrenum) references theatre(theatrenum));

INSERT into `MovieDatabase`.`Movie`(`name`, `theatrenum`, `showstart`, `showend`) values ('UP', 1, '12:00', '2:00');
INSERT into `MovieDatabase`.`Movie`(`name`, `theatrenum`, `showstart`, `showend`) values ('UP', 1, '4:00', '6:00');
INSERT into `MovieDatabase`.`Movie`(`name`, `theatrenum`, `showstart`, `showend`) values ('UP', 1, '8:00', '10:00');
INSERT into `MovieDatabase`.`Movie`(`name`, `theatrenum`, `showstart`, `showend`) values ('SALT', 2, '12:00', '2:00');
INSERT into `MovieDatabase`.`Movie`(`name`, `theatrenum`, `showstart`, `showend`) values ('SALT', 2, '4:00', '6:00');
INSERT into `MovieDatabase`.`Movie`(`name`, `theatrenum`, `showstart`, `showend`) values ('SALT', 2, '8:00', '10:00');
INSERT into `MovieDatabase`.`Movie`(`name`, `theatrenum`, `showstart`, `showend`) values ('Good Will Hunting', 3, '12:00', '2:00');
INSERT into `MovieDatabase`.`Movie`(`name`, `theatrenum`, `showstart`, `showend`) values ('Good Will Hunting', 3, '4:00', '6:00');
INSERT into `MovieDatabase`.`Movie`(`name`, `theatrenum`, `showstart`, `showend`) values ('Good Will Hunting', 3, '8:00', '10:00');
INSERT into `MovieDatabase`.`Movie`(`name`, `theatrenum`, `showstart`, `showend`) values ('Rocky', 4, '12:00', '2:00');
INSERT into `MovieDatabase`.`Movie`(`name`, `theatrenum`, `showstart`, `showend`) values ('Rocky', 4, '4:00', '6:00');
INSERT into `MovieDatabase`.`Movie`(`name`, `theatrenum`, `showstart`, `showend`) values ('Rocky', 4, '8:00', '10:00');
INSERT into `MovieDatabase`.`Movie`(`name`, `theatrenum`, `showstart`, `showend`) values ('Transformers', 5, '12:00', '2:00');
INSERT into `MovieDatabase`.`Movie`(`name`, `theatrenum`, `showstart`, `showend`) values ('Transformers', 5, '4:00', '6:00');
INSERT into `MovieDatabase`.`Movie`(`name`, `theatrenum`, `showstart`, `showend`) values ('Transformers', 5, '8:00', '10:00');
INSERT into `MovieDatabase`.`Movie`(`name`, `theatrenum`, `showstart`, `showend`) values ('Cinderella', 6, '12:00', '2:00');
INSERT into `MovieDatabase`.`Movie`(`name`, `theatrenum`, `showstart`, `showend`) values ('Cinderella', 6, '4:00', '6:00');
INSERT into `MovieDatabase`.`Movie`(`name`, `theatrenum`, `showstart`, `showend`) values ('Cinderella', 6, '8:00', '10:00');
INSERT into `MovieDatabase`.`Movie`(`name`, `theatrenum`, `showstart`, `showend`) values ('Robocop', 7, '12:00', '2:00');
INSERT into `MovieDatabase`.`Movie`(`name`, `theatrenum`, `showstart`, `showend`) values ('Robocop', 7, '4:00', '6:00');
INSERT into `MovieDatabase`.`Movie`(`name`, `theatrenum`, `showstart`, `showend`) values ('Robocop', 7, '8:00', '10:00');
INSERT into `MovieDatabase`.`Movie`(`name`, `theatrenum`, `showstart`, `showend`) values ('Batman', 8, '12:00', '2:00');
INSERT into `MovieDatabase`.`Movie`(`name`, `theatrenum`, `showstart`, `showend`) values ('Batman', 8, '4:00', '6:00');
INSERT into `MovieDatabase`.`Movie`(`name`, `theatrenum`, `showstart`, `showend`) values ('Batman', 8, '8:00', '10:00');
INSERT into `MovieDatabase`.`Movie`(`name`, `theatrenum`, `showstart`, `showend`) values ('Avengers', 9, '12:00', '2:00');
INSERT into `MovieDatabase`.`Movie`(`name`, `theatrenum`, `showstart`, `showend`) values ('Avengers', 9, '4:00', '6:00');
INSERT into `MovieDatabase`.`Movie`(`name`, `theatrenum`, `showstart`, `showend`) values ('Avengers', 9, '8:00', '10:00');
INSERT into `MovieDatabase`.`Movie`(`name`, `theatrenum`, `showstart`, `showend`) values ('A-Team', 10, '12:00', '2:00');
INSERT into `MovieDatabase`.`Movie`(`name`, `theatrenum`, `showstart`, `showend`) values ('A-Team', 10, '4:00', '6:00');
INSERT into `MovieDatabase`.`Movie`(`name`, `theatrenum`, `showstart`, `showend`) values ('A-Team', 10, '8:00', '10:00');

create table if not exists MovieDatabase.Seats(
seatrow varchar(255),
seatcol int);

insert into `MovieDatabase`.`seats`(`seatrow`, `seatcol`) values ('a', 1);
insert into `MovieDatabase`.`Seats`(`seatrow`, `seatcol`) values ('a', 2);
insert into `MovieDatabase`.`Seats`(`seatrow`, `seatcol`) values ('a', 3);
insert into `MovieDatabase`.`Seats`(`seatrow`, `seatcol`) values ('a', 4);
insert into `MovieDatabase`.`Seats`(`seatrow`, `seatcol`) values ('a', 5);
insert into `MovieDatabase`.`Seats`(`seatrow`, `seatcol`) values ('b', 1);
insert into `MovieDatabase`.`Seats`(`seatrow`, `seatcol`) values ('b', 2);
insert into `MovieDatabase`.`Seats`(`seatrow`, `seatcol`) values ('b', 3);
insert into `MovieDatabase`.`Seats`(`seatrow`, `seatcol`) values ('b', 4);
insert into `MovieDatabase`.`Seats`(`seatrow`, `seatcol`) values ('b', 5);
insert into `MovieDatabase`.`Seats`(`seatrow`, `seatcol`) values ('c', 1);
insert into `MovieDatabase`.`Seats`(`seatrow`, `seatcol`) values ('c', 2);
insert into `MovieDatabase`.`Seats`(`seatrow`, `seatcol`) values ('c', 3);
insert into `MovieDatabase`.`Seats`(`seatrow`, `seatcol`) values ('c', 4);
insert into `MovieDatabase`.`Seats`(`seatrow`, `seatcol`) values ('c', 5);
insert into `MovieDatabase`.`Seats`(`seatrow`, `seatcol`) values ('d', 1);
insert into `MovieDatabase`.`Seats`(`seatrow`, `seatcol`) values ('d', 2);
insert into `MovieDatabase`.`Seats`(`seatrow`, `seatcol`) values ('d', 3);
insert into `MovieDatabase`.`Seats`(`seatrow`, `seatcol`) values ('d', 4);
insert into `MovieDatabase`.`Seats`(`seatrow`, `seatcol`) values ('d', 5);
insert into `MovieDatabase`.`Seats`(`seatrow`, `seatcol`) values ('e', 1);
insert into `MovieDatabase`.`Seats`(`seatrow`, `seatcol`) values ('e', 2);
insert into `MovieDatabase`.`Seats`(`seatrow`, `seatcol`) values ('e', 3);
insert into `MovieDatabase`.`Seats`(`seatrow`, `seatcol`) values ('e', 4);
insert into `MovieDatabase`.`Seats`(`seatrow`, `seatcol`) values ('e', 5);


Insert into `MovieDatabase`.`RegisteredUser`(`name`, `email`, `address`, `memberid`, `username`, `password`, `cardnum`) values
('youssef', 'youssefmaksoud50@gmail.com', '22 glen way', 1234, 'jojo', '1234567', '1111111111111111');

Insert into `MovieDatabase`.`RegisteredUser`(`name`, `email`, `address`, `memberid`, `username`, `password`, `cardnum`) values
('elgiz', 'elgizabbasov2001@gmail.com', '3456 drive nw', 3333, 'project', '0001112', '2222222222222222');

Insert into `MovieDatabase`.`RegisteredUser`(`name`, `email`, `address`, `memberid`, `username`, `password`, `cardnum`) values
('tony', 'ensfproj@gmail.com', 'stephen ave', 0001, 'tony', '7777777', '1234567890123456');

Insert into `MovieDatabase`.`RegisteredUser`(`name`, `email`, `address`, `memberid`, `username`, `password`, `cardnum`) values
('alphonso', 'davies@gmail.com', 'saddleway ne', 5555, 'munich', '8889990', '4355665678990123');


Insert into `MovieDatabase`.`Booking`(`bookingid`, `memberid`, `seatrow`, `seatcol`, `moviename`, `theatrenum`, `showstart`, `showend`) values
(122, '1234', 'a', 1, 'UP', 1, '4:00', '6:00');
Insert into `MovieDatabase`.`Booking`(`bookingid`,`memberid`, `seatrow`, `seatcol`, `moviename`, `theatrenum`, `showstart`, `showend`) values
(123, '1234', 'e', 3, 'UP', 1, '4:00', '6:00');
Insert into `MovieDatabase`.`Booking`(`bookingid`,`memberid`, `seatrow`, `seatcol`, `moviename`, `theatrenum`, `showstart`, `showend`) values
(124, '1234', 'c', 2, 'UP', 1, '4:00', '6:00');
Insert into `MovieDatabase`.`Booking`(`bookingid`,`memberid`, `seatrow`, `seatcol`, `moviename`, `theatrenum`, `showstart`, `showend`) values
(125, '1234', 'd', 5, 'UP', 1, '4:00', '6:00');
Insert into `MovieDatabase`.`Booking`(`bookingid`, `memberid`, `seatrow`, `seatcol`, `moviename`, `theatrenum`, `showstart`, `showend`) values
(126, '3333', 'a', 1, 'Avengers', 9, '12:00', '2:00');
Insert into `MovieDatabase`.`Booking`(`bookingid`, `memberid`, `seatrow`, `seatcol`, `moviename`, `theatrenum`, `showstart`, `showend`) values
(127, '3333', 'b', 3, 'Avengers', 9, '12:00', '2:00');
Insert into `MovieDatabase`.`Booking`(`bookingid`, `memberid`, `seatrow`, `seatcol`, `moviename`, `theatrenum`, `showstart`, `showend`) values
(128, '0001', 'c', 5, 'Batman', 8, '8:00', '10:00');
Insert into `MovieDatabase`.`Booking`(`bookingid`, `memberid`, `seatrow`, `seatcol`, `moviename`, `theatrenum`, `showstart`, `showend`) values
(129, '0001', 'c', 4, 'Batman', 8, '8:00', '10:00');
Insert into `MovieDatabase`.`Booking`(`bookingid`, `memberid`, `seatrow`, `seatcol`, `moviename`, `theatrenum`, `showstart`, `showend`) values
(130, '0001', 'c', 3, 'Batman', 8, '8:00', '10:00');
Insert into `MovieDatabase`.`Booking`(`bookingid`, `memberid`, `seatrow`, `seatcol`, `moviename`, `theatrenum`, `showstart`, `showend`) values
(131, '5555', 'b', 1, 'A-Team', 10, '4:00', '6:00');
Insert into `MovieDatabase`.`Booking`(`bookingid`, `memberid`, `seatrow`, `seatcol`, `moviename`, `theatrenum`, `showstart`, `showend`) values
(132, '5555', 'b', 2, 'A-Team', 10, '4:00', '6:00');

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
cardnum varchar(255))
cvv varchar(255),
exp varchar(255);

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

create table if not exists MovieDatabase.BookingforGuest(
bookingid int PRIMARY KEY ,
email varchar(255),
seatrow varchar(255),
seatcol int,
moviename varchar(255),
theatrenum int,
showstart varchar(255),
showend varchar(255),
cardnum varchar(255),
cvv varchar(255),
exp varchar(255),
foreign key(theatrenum) references theatre(theatrenum));

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
('Hashir', 'hashir204@gmail.com', '23 glen way', 1235, 'Joestar', '11121314', '1111111111111112');

Insert into `MovieDatabase`.`RegisteredUser`(`name`, `email`, `address`, `memberid`, `username`, `password`, `cardnum`) values
('Elgis', 'elgis38@gmail.com', '24 glen way', 1236, 'Excalibur', '7654321', '1111111111111113');

Insert into `MovieDatabase`.`RegisteredUser`(`name`, `email`, `address`, `memberid`, `username`, `password`, `cardnum`) values
('Moiz', 'moiz100@gmail.com', '25 glen way', 1237, 'QueenLover', '5678910', '1111111111111114');

Insert into `MovieDatabase`.`Booking`(`bookingid`, `memberid`, `seatrow`, `seatcol`, `moviename`, `theatrenum`, `showstart`, `showend`) values
(122, '1234', 'a', 1, 'UP', 1, '4:00', '6:00');
Insert into `MovieDatabase`.`Booking`(`bookingid`,`memberid`, `seatrow`, `seatcol`, `moviename`, `theatrenum`, `showstart`, `showend`) values
(123, '1234', 'e', 3, 'UP', 1, '4:00', '6:00');
Insert into `MovieDatabase`.`Booking`(`bookingid`,`memberid`, `seatrow`, `seatcol`, `moviename`, `theatrenum`, `showstart`, `showend`) values
(124, '1234', 'c', 2, 'UP', 1, '4:00', '6:00');
Insert into `MovieDatabase`.`Booking`(`bookingid`,`memberid`, `seatrow`, `seatcol`, `moviename`, `theatrenum`, `showstart`, `showend`) values
(125, '1234', 'd', 5, 'UP', 1, '4:00', '6:00');
Insert into `MovieDatabase`.`Booking`(`bookingid`,`memberid`, `seatrow`, `seatcol`, `moviename`, `theatrenum`, `showstart`, `showend`) values
(126, '1235', 'd', 5, 'Robocop',7, '12:00', '2:00');
Insert into `MovieDatabase`.`Booking`(`bookingid`,`memberid`, `seatrow`, `seatcol`, `moviename`, `theatrenum`, `showstart`, `showend`) values
(127, '1236', 'b', 4, 'Robocop',7, '12:00', '2:00');
Insert into `MovieDatabase`.`Booking`(`bookingid`,`memberid`, `seatrow`, `seatcol`, `moviename`, `theatrenum`, `showstart`, `showend`) values
(128, '1237', 'd', 2, 'Robocop',7, '12:00', '2:00');
Insert into `MovieDatabase`.`Booking`(`bookingid`,`memberid`, `seatrow`, `seatcol`, `moviename`, `theatrenum`, `showstart`, `showend`) values
(129, '1235', 'd', 5, 'Transformers',5, '4:00', '6:00');

/* these other entries will be for Guest users, just going to give them ids that aren't in the database */
Insert into `MovieDatabase`.`Booking`(`bookingid`,`memberid`, `seatrow`, `seatcol`, `moviename`, `theatrenum`, `showstart`, `showend`) values
(130, '1238', 'd', 3, 'Transformers',5, '12:00', '2:00');
Insert into `MovieDatabase`.`Booking`(`bookingid`,`memberid`, `seatrow`, `seatcol`, `moviename`, `theatrenum`, `showstart`, `showend`) values
(131, '1239', 'd', 2, 'Transformers',5, '12:00', '2:00');
Insert into `MovieDatabase`.`Booking`(`bookingid`,`memberid`, `seatrow`, `seatcol`, `moviename`, `theatrenum`, `showstart`, `showend`) values
(132, '1240', 'e', 5, 'Batman',8, '8:00', '10:00');
Insert into `MovieDatabase`.`Booking`(`bookingid`,`memberid`, `seatrow`, `seatcol`, `moviename`, `theatrenum`, `showstart`, `showend`) values
(133, '1241', 'a', 5, 'Batman',8, '8:00', '10:00');
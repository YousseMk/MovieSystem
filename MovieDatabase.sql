create Database MovieDatabase;

create table if not exists MovieDatabase.Theatre(
name varchar(255) PRIMARY KEY,
seat varchar(255),
seatavail varchar(255),
theatrenum int,
theatrecap int);

create table if not exists MovieDatabase.RegisteredUser(
name varchar(255),
email varchar(255),
address varchar(255),
memberid int PRIMARY KEY,
username varchar(255),
password varchar(255),
cardnum varchar(255));

create table if not exists MovieDatabase.Booking(
memberid int,
seatid varchar(255),
moviename varchar(255),
theatrename varchar(255), 
theatrenum int,
foreign key(theatrename) references theatre(name),
Foreign Key(memberid) references RegisteredUser(memberid));

Insert into `MovieDatabase`.`RegisteredUser`(`name`, `email`, `address`, `memberid`, `username`, `password`, `cardnum`) values
('youssef', 'youssefmaksoud50@gmail.com', '22 glen way', 1234, 'jojo', '1234567', '1111111111111111');

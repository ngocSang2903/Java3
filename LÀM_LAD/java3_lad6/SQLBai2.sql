create database Lad6_bai2
go
use Lad6_bai2
go
create table Standars(
standars nvarchar(20) primary key
)
go
create table Student(
RegID int identity(1,1) primary key,
[Name] nvarchar(30),
[Address] nvarchar(100),
ParentName nvarchar(20),
Phone nvarchar(20),
standars nvarchar(20) references Standars(standars),
RegDate datetime
)
go

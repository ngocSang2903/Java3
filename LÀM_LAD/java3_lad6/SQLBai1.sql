create database Lad6_bai1
go
use Lad6_bai1
go
create table Title(
ID varchar(20) primary key,
Title nvarchar(100),
Price int
)
insert into Title values (1,N'Lập trình Java',99000),
(2,N'Lập trình Đối tượng',1000),
(3,N'Lập trình C',6000),
(4,N'Lập trình C++',4000),
(5,N'Lập trình C#',9000),
(6,N'Lập trình Python',21000)
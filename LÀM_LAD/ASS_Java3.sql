create database ASS_JAVA3
go
use ASS_JAVA3
go
create table STUDENT(
MASV nvarchar(50) primary key,
HoTen nvarchar(50),
Email nvarchar(50),
SoDT nvarchar(50),
GioiTinh nvarchar(50),
DiaChi nvarchar(50),
Hinh nvarchar(200)
)
go
create table GRADE(
ID int identity(1,1) primary key,
MASV nvarchar(50),
TiengAnh float,
TinHoc float,
GDTC float
constraint pk_na foreign key(MASV) references STUDENT(MASV)
)
go
create table USERS(
UserName nvarchar(50) primary key,
[PassWord] nvarchar(50),
[Role] nvarchar(50)
)

insert into USERS values ('admin','123','1')
insert into USERS values (N'Daotao@fpt.edu.vn','123',N'Đào tạo')
insert into USERS values (N'Giaovien@fpt.edu.vn','123',N'Giáo viên')

select UserName,[PassWord] from USERS where UserName=N'Daotao' and [PassWord]='123' and [Role]=N'Đào tạo'


select top 3 HoTen,STUDENT.MASV,TiengAnh,TinHoc,GDTC from STUDENT join GRADE on STUDENT.MASV=GRADE.MASV order by (TiengAnh+TinHoc+GDTC)/3 desc
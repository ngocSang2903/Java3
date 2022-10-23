CREATE DATABASE Account;
GO
USE Account;
GO

CREATE TABLE AccountData(
	MaSV INT IDENTITY PRIMARY KEY,
	ho_ten NVARCHAR(50) NOT NULL,
	email NVARCHAR(50) NOT NULL,
	password NVARCHAR(20) NOT NULL,
	gioi_tinh BIT NOT NULL--0-nam--1nu
);
GO
CREATE TABLE AccountManagerData(
	MaQL INT IDENTITY PRIMARY KEY,
	ho_ten NVARCHAR(50) NOT NULL,
	email NVARCHAR (50) NOT NULL,
	password NVARCHAR(20) NOT NULL
);
GO
create TABLE QuanLyTruyen(
	maTruyen int identity(1,1) ,
    ten NVARCHAR(50) NOT NULL,
    theLoai NVARCHAR(50) NOT NULL,
    trangThai NVARCHAR(50) NOT NULL,
    namPhatHanh INT NOT NULL,
    Tap INT NOT NULL
);

insert into AccountManagerData
values ('hung','hung1234@fpt.edu.vn','Hung2003@')

select * from AccountData

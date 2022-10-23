create database Java3_Lad5_bai2
go
use Java3_Lad5_bai2
go
create table Student(
MaSV varchar(20) primary key,
HoTen nvarchar(20),
Email nvarchar(30),
sodt int,
gioitinh nvarchar(5),
diachi nvarchar(50)
)
insert into Student values ('SV001','SinhVien1','Sinhvien1@gmail.com',0123456789,'Nam',N'Hà Nội'),
('SV002','SinhVien2','Sinhvien2@gmail.com',0123456789,'Nam',N'Hà Nội'),
('SV003','SinhVien3','Sinhvien3@gmail.com',0123456789,'Nam',N'Bắc Giang'),
('SV004','SinhVien4','Sinhvien4@gmail.com',0123456789,'Nam',N'Hà Tĩnh'),
('SV005','SinhVien5','Sinhvien5@gmail.com',0123456789,'Nam',N'Thanh hóa')
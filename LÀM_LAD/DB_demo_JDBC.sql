CREATE DATABASE su22b2_sof203;
GO

USE su22b2_sof203;
GO

CREATE TABLE danh_muc (
    id INT IDENTITY PRIMARY KEY,
    ten NVARCHAR (255) NOT NULL,
    mo_ta NVARCHAR(255) NOT NULL,
    trang_thai INT NOT NULL DEFAULT 1
);

GO

CREATE TABLE san_pham (
    id INT IDENTITY PRIMARY KEY,
    ten NVARCHAR (255) NOT NULL,
    so_luong INT NOT NULL DEFAULT 0,
    mau_sac NVARCHAR(255) NOT NULL,
    don_gia FLOAT NOT NULL DEFAULT 0,
    danh_muc_id INT NOT NULL
);

GO
CREATE TABLE khach_hang (
    id INT IDENTITY PRIMARY KEY,
    ten NVARCHAR (255) NOT NULL,
    dia_chi NVARCHAR(255) NOT NULL,
    email NVARCHAR(255) NOT NULL,
    tuoi int NOT NULL,
    gioi_tinh int NOT NULL DEFAULT 1
);

GO
CREATE TABLE nhan_vien (
    id INT IDENTITY PRIMARY KEY,
    ten NVARCHAR (255) NOT NULL,
    ma_nv NVARCHAR (255) NOT NULL,
    sdt NVARCHAR(255) NOT NULL UNIQUE,
    tuoi int NOT NULL,
    vai_tro int NOT NULL DEFAULT 1
);

GO

INSERT INTO nhan_vien (ten, ma_nv, sdt, tuoi, vai_tro) VALUES
('Ng Van A', 'PH09125', '097321123', 25, 1),
('Tran Thi C', 'PH07098', '098123456', 26, 0);
GO

INSERT INTO khach_hang (ten, dia_chi, email, tuoi, gioi_tinh) VALUES
('Ng Van A', 'HN', 'dungna29@fpt.edu.vn', 20, 1),
('Tran Thi C', 'HN', 'minhdq8@fpt.edu.vn', 22, 0);
GO

INSERT INTO danh_muc (ten, mo_ta, trang_thai) VALUES
('Ao Nam', '', 1),
('Ao The Thao', '', 1),
('Quan Nam', '', 0);
GO

INSERT INTO san_pham(ten, mau_sac, so_luong, don_gia, danh_muc_id) VALUES
('Ao Polo', 'WHITE', 10, 100000, 1),
('Ao the thao', 'RED', 5, 99000, 2),
('Quan', 'BLACK', 15, 250000, 3);

GO
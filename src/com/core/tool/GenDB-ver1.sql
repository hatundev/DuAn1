-- Xóa cơ sở dữ liệu nếu tồn tại
DROP DATABASE IF EXISTS DuAn1;

-- Tạo cơ sở dữ liệu mới
CREATE DATABASE DuAn1;

-- Sử dụng cơ sở dữ liệu mới tạo
USE DuAn1;

-- Bắt đầu tạo các bảng

-- Bảng 1
CREATE TABLE TinhTrangSanPham 
(
    id INT IDENTITY(1,1) NOT NULL,
    tentinhtrang NVARCHAR(30) NOT NULL,
    hoatdong BIT NOT NULL,
    mota NVARCHAR(250),
    PRIMARY KEY (id),
    UNIQUE (tentinhtrang)
);

CREATE TABLE Ram 
(
    id INT IDENTITY(1,1) NOT NULL,
    dungluong NVARCHAR(30) NOT NULL,
    hoatdong BIT NOT NULL,
    mota NVARCHAR(250),
    PRIMARY KEY (id),
    UNIQUE (dungluong)
);

CREATE TABLE Chip
(
    id INT IDENTITY(1,1) NOT NULL,
    tenchip NVARCHAR(30) NOT NULL,
    hoatdong BIT NOT NULL,
    mota NVARCHAR(250),
    PRIMARY KEY (id),
    UNIQUE (tenchip)
);

CREATE TABLE MauSac
(
    id INT IDENTITY(1,1) NOT NULL,
    tenmau NVARCHAR(30) NOT NULL,
    hoatdong BIT NOT NULL,
    mota NVARCHAR(250),
    PRIMARY KEY (id),
    UNIQUE (tenmau)
);

CREATE TABLE LoaiManHinh
(
    id INT IDENTITY(1,1) NOT NULL,
    tenloaimanhinh NVARCHAR(30) NOT NULL,
    hoatdong BIT NOT NULL,
    mota NVARCHAR(250),
    PRIMARY KEY (id),
    UNIQUE (tenloaimanhinh)
);

CREATE TABLE DoPhanGiai
(
    id INT IDENTITY(1,1) NOT NULL,
    tendophangiai NVARCHAR(30) NOT NULL,
    hoatdong BIT NOT NULL,
    mota NVARCHAR(250),
    PRIMARY KEY (id),
    UNIQUE (tendophangiai)
);

CREATE TABLE BoNho
(
    id INT IDENTITY(1,1) NOT NULL,
    tenduongluong NVARCHAR(30) NOT NULL,
    hoatdong BIT NOT NULL,
    mota NVARCHAR(250),
    PRIMARY KEY (id),
    UNIQUE (tenduongluong)
);

CREATE TABLE CameraTruoc
(
    id INT IDENTITY(1,1) NOT NULL,
    tendophangiai NVARCHAR(30) NOT NULL,
    hoatdong BIT NOT NULL,
    mota NVARCHAR(250),
    PRIMARY KEY (id),
    UNIQUE (tendophangiai)
);

CREATE TABLE CameraSau
(
    id INT IDENTITY(1,1) NOT NULL,
    tendophangiai NVARCHAR(30) NOT NULL,
    hoatdong BIT NOT NULL,
    mota NVARCHAR(250),
    PRIMARY KEY (id),
    UNIQUE (tendophangiai)
);

CREATE TABLE TanSoQuet
(
    id INT IDENTITY(1,1) NOT NULL,
    tentanso NVARCHAR(30) NOT NULL,
    hoatdong BIT NOT NULL,
    mota NVARCHAR(250),
    PRIMARY KEY (id),
    UNIQUE (tentanso)
);

CREATE TABLE TocDoSac
(
    id INT IDENTITY(1,1) NOT NULL,
    tentocdosac NVARCHAR(30) NOT NULL,
    hoatdong BIT NOT NULL,
    mota NVARCHAR(250),
    PRIMARY KEY (id),
    UNIQUE (tentocdosac)
);

CREATE TABLE CongSac
(
    id INT IDENTITY(1,1) NOT NULL,
    tencongsac NVARCHAR(30) NOT NULL,
    hoatdong BIT NOT NULL,
    mota NVARCHAR(250),
    PRIMARY KEY (id),
    UNIQUE (tencongsac)
);

CREATE TABLE ChucVu
(
    id INT IDENTITY(1,1) NOT NULL,
    tenchucvu NVARCHAR(30) NOT NULL,
    hoatdong BIT NOT NULL,
    mota NVARCHAR(250),
    PRIMARY KEY (id),
    UNIQUE (tenchucvu)
);

CREATE TABLE TrangThaiNhanVien
(
    id INT IDENTITY(1,1) NOT NULL,
    tentrangthai NVARCHAR(30) NOT NULL,
    hoatdong BIT NOT NULL,
    mota NVARCHAR(250),
    PRIMARY KEY (id),
    UNIQUE (tentrangthai)
);

CREATE TABLE TrangThaiKhachHang
(
    id INT IDENTITY(1,1) NOT NULL,
    tentrangthai NVARCHAR(30) NOT NULL,
    hoatdong BIT NOT NULL,
    mota NVARCHAR(250),
    PRIMARY KEY (id),
    UNIQUE (tentrangthai)
);

CREATE TABLE LoaiKhachHang
(
    id INT IDENTITY(1,1) NOT NULL,
    tenloai NVARCHAR(30) NOT NULL,
    hoatdong BIT NOT NULL,
    mota NVARCHAR(250),
    PRIMARY KEY (id),
    UNIQUE (tenloai)
);

CREATE TABLE TrangThaiHoaDon
(
    id INT IDENTITY(1,1) NOT NULL,
    tentrangthai NVARCHAR(30) NOT NULL,
    hoatdong BIT NOT NULL,
    mota NVARCHAR(250),
    PRIMARY KEY (id),
    UNIQUE (tentrangthai)
);

CREATE TABLE HinhThucThanhToan
(
    id INT IDENTITY(1,1) NOT NULL,
    tenhinhthuc NVARCHAR(30) NOT NULL,
    hoatdong BIT NOT NULL,
    mota NVARCHAR(250),
    PRIMARY KEY (id),
    UNIQUE (tenhinhthuc)
);

CREATE TABLE Hang
(
    id INT IDENTITY(1,1) NOT NULL,
    tenhang NVARCHAR(30) NOT NULL,
    hoatdong BIT NOT NULL,
    mota NVARCHAR(250),
    PRIMARY KEY (id),
    UNIQUE (tenhang)
);

CREATE TABLE Voucher
(
    id INT IDENTITY(1,1) NOT NULL,
    mavoucher VARCHAR(10) NOT NULL,
    tenvoucher NVARCHAR(50),
    ngaybatdau DATE NOT NULL,
    ngayketthuc DATE,
    phantram INT NOT NULL,
    sotientoida INT NOT NULL,
    hoatdong BIT NOT NULL,
    mota NVARCHAR(250),
    PRIMARY KEY (id),
    UNIQUE (mavoucher)
);

CREATE TABLE KhuyenMai
(
    id INT IDENTITY(1,1) NOT NULL,
    makhuyenmai VARCHAR(10) NOT NULL,
    tenkhuyenmai NVARCHAR(50),
    ngaybatdau DATE NOT NULL,
    ngayketthuc DATE,
    phantram INT NOT NULL,
    sotientoida INT NOT NULL,
    hoatdong BIT NOT NULL,
    mota NVARCHAR(250),
    PRIMARY KEY (id),
    UNIQUE (makhuyenmai)
);

-- Bảng 2
CREATE TABLE KhachHang
(
    id INT IDENTITY(1,1) NOT NULL,
    makhachhang VARCHAR(10) NOT NULL UNIQUE,
    tenkhachhang NVARCHAR(30),
    sodienthoai VARCHAR(13) UNIQUE,
    ngaysinh DATE,
    maxeploai INT NOT NULL,
    matrangthai INT NOT NULL,
    hoatdong BIT NOT NULL,
    PRIMARY KEY (id),
    FOREIGN KEY (maxeploai) REFERENCES LoaiKhachHang(id),
    FOREIGN KEY (matrangthai) REFERENCES TrangThaiKhachHang(id)
);

CREATE TABLE NhanVien
(
    id INT IDENTITY(1,1) NOT NULL,
    manhanvien VARCHAR(10) NOT NULL UNIQUE,
    tennhanvien NVARCHAR(30),
    ngaysinh DATE,
    diachi NVARCHAR(250),
    sodienthoai VARCHAR(13) UNIQUE,
    cccd VARCHAR(12) UNIQUE,
    matrangthai INT NOT NULL,
    machucvu INT NOT NULL,
    hoatdong BIT NOT NULL,
    PRIMARY KEY (id),
    FOREIGN KEY (matrangthai) REFERENCES TrangThaiNhanVien(id),
    FOREIGN KEY (machucvu) REFERENCES ChucVu(id)
);

CREATE TABLE SanPham
(
    id INT IDENTITY(1,1) NOT NULL,
    masanpham VARCHAR(10) NOT NULL UNIQUE,
    tensanpham NVARCHAR(50),
    mahang INT NOT NULL,
    soluong INT,
    hoatdong BIT NOT NULL,
    PRIMARY KEY (id),
    FOREIGN KEY (mahang) REFERENCES Hang(id)
);

-- Bảng 3
CREATE TABLE TaiKhoan
(
    id INT IDENTITY(1,1) NOT NULL,
    username VARCHAR(20) NOT NULL UNIQUE,
    password VARCHAR(20) NOT NULL,
    manhanvien VARCHAR(10) NOT NULL UNIQUE,
    hoatdong BIT NOT NULL,
    PRIMARY KEY (id),
    FOREIGN KEY (manhanvien) REFERENCES NhanVien(manhanvien)
);

CREATE TABLE ChiTietSanPham
(
    id INT IDENTITY(1,1) NOT NULL,
    masanphamchitiet VARCHAR(20) NOT NULL UNIQUE,
    masanpham VARCHAR(10) NOT NULL,
    tensanphamchitiet NVARCHAR(250),
    serial VARCHAR(30) NOT NULL UNIQUE,
    imei1 VARCHAR(30) NOT NULL UNIQUE,
    imei2 VARCHAR(30),
    giaban FLOAT,
    matinhtrang INT,
    maram INT,
    machip INT,
    mamausac INT,
    mamanhinh INT,
    madophangiai INT,
    mabonho INT,
    macamtruoc INT,
    macamsau INT,
    matansoquet INT,
    macongsac INT,
    matocdosac INT,
    makhuyenmai VARCHAR(10),
    hoatdong BIT NOT NULL,
    PRIMARY KEY (id),
    FOREIGN KEY (masanpham) REFERENCES SanPham(masanpham),
    FOREIGN KEY (matinhtrang) REFERENCES TinhTrangSanPham(id),
    FOREIGN KEY (maram) REFERENCES Ram(id),
    FOREIGN KEY (machip) REFERENCES Chip(id),
    FOREIGN KEY (mamausac) REFERENCES MauSac(id),
    FOREIGN KEY (mamanhinh) REFERENCES LoaiManHinh(id),
    FOREIGN KEY (madophangiai) REFERENCES DoPhanGiai(id),
    FOREIGN KEY (mabonho) REFERENCES BoNho(id),
    FOREIGN KEY (macamtruoc) REFERENCES CameraTruoc(id),
    FOREIGN KEY (macamsau) REFERENCES CameraSau(id),
    FOREIGN KEY (matansoquet) REFERENCES TanSoQuet(id),
    FOREIGN KEY (macongsac) REFERENCES CongSac(id),
    FOREIGN KEY (matocdosac) REFERENCES TocDoSac(id),
    FOREIGN KEY (makhuyenmai) REFERENCES KhuyenMai(makhuyenmai)
);

-- Bảng 4
CREATE TABLE HoaDon 
(
    id INT IDENTITY(1,1) NOT NULL,
    mahoadon VARCHAR(10) NOT NULL UNIQUE,
    ngaytao DATE NOT NULL,
    tongtien FLOAT NOT NULL,
    matrangthai INT NOT NULL,
    makhachhang VARCHAR(10),
    mavoucher VARCHAR(10),
    username VARCHAR(20) NOT NULL,
    hoatdong BIT NOT NULL,
    PRIMARY KEY (id),
    FOREIGN KEY (matrangthai) REFERENCES TrangThaiHoaDon(id),
    FOREIGN KEY (makhachhang) REFERENCES KhachHang(makhachhang),
    FOREIGN KEY (mavoucher) REFERENCES Voucher(mavoucher),
    FOREIGN KEY (username) REFERENCES TaiKhoan(username)
);

-- Bảng 5
CREATE TABLE ChiTietHinhThucThanhToan
(
    mahinhthucthanhtoan INT NOT NULL,
    mahoadon VARCHAR(10) NOT NULL,
    mota NVARCHAR(250),
    hoatdong BIT NOT NULL,
    PRIMARY KEY (mahinhthucthanhtoan, mahoadon),
    FOREIGN KEY (mahinhthucthanhtoan) REFERENCES HinhThucThanhToan(id),
    FOREIGN KEY (mahoadon) REFERENCES HoaDon(mahoadon)
);

CREATE TABLE HoaDonChiTiet
(
    id INT IDENTITY(1,1) NOT NULL,
    mahoadonchitiet VARCHAR(20) NOT NULL UNIQUE,
    mahoadon VARCHAR(10) NOT NULL,
    masanphamchitiet VARCHAR(20) NOT NULL,
    hoatdong BIT NOT NULL,
    PRIMARY KEY (id),
    FOREIGN KEY (masanphamchitiet) REFERENCES ChiTietSanPham(masanphamchitiet),
    FOREIGN KEY (mahoadon) REFERENCES HoaDon(mahoadon)
);

-- Kết thúc script

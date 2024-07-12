Use DuAn1

INSERT INTO ChucVu (tenchucvu,hoatdong,mota)
VALUES (N'Nhân viên',1,N'Đây là role nhân viên !'),
		(N'Quản lý',1,N'Đây là role quản !')

INSERT INTO TrangThaiNhanVien (tentrangthai,hoatdong,mota)
VALUES (N'Chưa nghĩ ra',1,N'Chưa nghĩ ra')

INSERT INTO NhanVien (manhanvien, tennhanvien, sodienthoai, cccd, matrangthai, machucvu, hoatdong)
VALUES 
    ('PH56356', N'Nguyễn Thanh Tùng', '09611926600', '037200009245', 1, 2, 1),
    ('PH53651', N'Nguyễn Như Thành', '09611926601', '037200009246', 1, 2, 1),
    ('PH54034', N'Lương Văn Hoàng', '09611926602', '037200009247', 1, 1, 1),
    ('PH54024', N'Bùi Minh Tuấn', '09611926603', '037200009248', 1, 1, 1),
    ('PH48214', N'Đặng Thị Ngọc Điệp', '09611926604', '037200009249', 1, 1, 1),
    ('PH50856', N'Trần Thị Trang', '09611926605', '037200009250', 1, 1, 1);

INSERT INTO TaiKhoan (username, password, manhanvien, hoatdong)
values 
	('tungntph56356','123456','PH56356',1),
	('thanhntph53651','123456','PH53651',1),
	('hoanglvph54034','123456','PH54034',1),
	('tuanbmph54024','123456','PH54024',1),
	('diepdtnph48214','123456','PH48214',1),
	('trangttph50856','123456','PH50856',1);

INSERT INTO TinhTrangSanPham (tentinhtrang, hoatdong)
VALUES 
	('No',0),
	(N'Mới',1),
	('99%',1),
	('95%',1);
	
SELECT * FROM TinhTrangSanPham ttsp 

INSERT INTO Ram (dungluong , hoatdong)
VALUES 
	('No',0),
	('2GB',1),
	('4GB',1),
	('6GB',1);
	
SELECT * FROM Ram r

INSERT INTO Chip (tenchip , hoatdong)
VALUES 
	('No',0),
	('Apple A15',1),
	('Apple A16',1),
	('Apple A17',1),
	('Apple A18',1);
	
SELECT * FROM Chip c  

INSERT INTO MauSac (tenmau , hoatdong)
VALUES 
	('No',0),
	(N'Đen',1),
	(N'Vàng',1),
	(N'Trắng',1),
	(N'Bạch kim',1);
	
SELECT * FROM MauSac ms

INSERT INTO LoaiManHinh(tenloaimanhinh , hoatdong)
VALUES 
	('No',0),
	(N'Home',1),
	(N'Tai thỏ',1),
	(N'Nốt ruồi',1),
	(N'Dynamic Island',1);
	
SELECT * FROM LoaiManHinh lmh

INSERT INTO DoPhanGiai(tendophangiai , hoatdong)
VALUES 
	('No',0),
	(N'HD',1),
	(N'Full HD',1),
	(N'2K',1),
	(N'4K',1);
	
SELECT * FROM DoPhanGiai

INSERT INTO BoNho(tenduongluong , hoatdong)
VALUES 
	('No',0),
	(N'8GB',1),
	(N'16GB',1),
	(N'32GB',1),
	(N'64GB',1);
	
SELECT * FROM BoNho

INSERT INTO CameraTruoc(tendophangiai , hoatdong)
VALUES 
	('No',0),
	(N'5MP',1),
	(N'10MP',1),
	(N'20MP',1),
	(N'40MP',1);
	
SELECT * FROM CameraTruoc

INSERT INTO CameraSau(tendophangiai , hoatdong)
VALUES 
	('No',0),
	(N'5MP',1),
	(N'10MP',1),
	(N'20MP',1),
	(N'40MP',1);
	
SELECT * FROM CameraSau

INSERT INTO TanSoQuet(tentanso , hoatdong)
VALUES 
	('No',0),
	(N'55Hz',1),
	(N'60Hz',1),
	(N'75Hz',1),
	(N'140Hz',1);
	
SELECT * FROM TanSoQuet

INSERT INTO TocDoSac(tentocdosac , hoatdong)
VALUES 
	('No',0),
	(N'Chậm',1),
	(N'Thường',1),
	(N'Nhanh',1),
	(N'Siêu nhanh',1);
	
SELECT * FROM TocDoSac

INSERT INTO TocDoSac(tentocdosac , hoatdong)
VALUES 
	('No',0),
	(N'Chậm',1),
	(N'Thường',1),
	(N'Nhanh',1),
	(N'Siêu nhanh',1);
	
SELECT * FROM TocDoSac

INSERT INTO CongSac(tencongsac , hoatdong)
VALUES 
	('No',0),
	(N'Micro',1),
	(N'Type-C',1),
	(N'Lighning',1);
	
SELECT * FROM CongSac

INSERT INTO Hang(tenhang , hoatdong)
VALUES 
	('No',0),
	(N'Iphone',1),
	(N'SamSung',1),
	(N'Xiaomi',1),
	(N'Oppo',1);
	
SELECT * FROM Hang

INSERT INTO SanPham(masanpham,tensanpham,mahang,hoatdong)
VALUES 
	('Ip11',N'Iphone 11',2,1),
	('Ip11P',N'Iphone 11 Pro',2,1),
	('Ip11PM',N'Iphone 11 Pro Max',2,1),
	('Ip12',N'Iphone 12',2,1),
	('Ip12P',N'Iphone 12 Pro',2,1),
	('Ip12PM',N'Iphone 12 Pro Max',2,1);

SELECT * FROM SanPham

INSERT INTO KhuyenMai(makhuyenmai,tenkhuyenmai,ngaybatdau,phantram,sotientoida,hoatdong)
VALUES 
	('km000',N'Khuyến mãi mặc định',N'10-10-2010',0,0,2);

SELECT * FROM KhuyenMai

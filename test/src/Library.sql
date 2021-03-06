Create Database FULib
Go
Use FULib
Go
CREATE TABLE Users (
	UserID char(5) Primary key,
	FullName nvarchar (30) NOT NULL ,
	Email varchar (30) NULL Check(Email  like '[a-z]%@[a-z]%.[a-z]%'),
	Password varchar(10) not null,
	Status char(2) default('BT') check(status in ('BT','LT','KT','SP')) not null,
	UserRight int default(1) check(userRight>=1 and userRight<=3) not null)
Go
Insert into Users(UserID,FullName,Email,password) values('U0001',N'Trần Minh Mẫn','a@b.c','1234')
Insert into Users(UserID,FullName,Email,password) values('U0002',N'Lê Hữu Nam','a@b.c','1234')
Go
Create Table Category(
	CatID char(2) primary key,
	CatName nvarchar(30) not null)
Go
Insert into Category(CatID, CatName) values('PR', N'Programming')	
Insert into Category(CatID, CatName) values('LT', N'Lập trình')	
Insert into Category(CatID, CatName) values('CS', N'Computer Science')	
Insert into Category(CatID, CatName) values('TX', N'Textbook')
Insert into Category(CatID, CatName) values('RF', N'Reference')
Insert into Category(CatID, CatName) values('MA', N'Magazine')
Go
Create Table Books(
	BookID varchar(12) primary key,
	Title nvarchar(150) not null,
	Author nvarchar(30) not null,
	Category char(2) foreign key references Category(CatID),
	Keyword nvarchar(100) not null)
Go
Insert into Books(BookID, Title,Author,Category,Keyword) values('B0001',N'Lập trình Java',N'Ngô Trung Việt','LT','Java')	
Insert into Books(BookID, Title,Author,Category,Keyword) values('B0002',N'Lập trình Python',N'Nguyễn Thành Thủy','LT','Python')	
Insert into Books(BookID, Title,Author,Category,Keyword) values('B0003',N'Machine Learning',N'Michael William','CS','Machine')	
Go
Create Table LogLibs(
	UserID char(5) foreign key references Users(UserID) not null,
	BookID varchar(12) foreign key references Books(BookID) not null,
	NgayDat datetime default(getDate()) not null,
	NgayMuon datetime, NgayPtra datetime, NgayTra datetime,
	MaNV char(5) foreign key references Users(UserID),
	LogID int identity(1,1) primary key,
	check(NgayMuon>NgayDat), check(NgayTra>NgayMuon))
Go
Create procedure MuonSach
@bid varchar(12), @mbd char(5), @id int output
As
Begin
 -- Begin transaction
	Insert into LogLibs(userID,bookid) values(@mbd,@bid)
	Set @id=@@identity
  --commit transaction	
End	
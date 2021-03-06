USE [PRJ321_DE140280]
GO
/****** Object:  Table [dbo].[Contact]    Script Date: 11/7/2020 11:41:52 AM ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [dbo].[Contact](
	[id_contact] [int] IDENTITY(1,1) NOT NULL,
	[first_name] [nvarchar](50) NOT NULL,
	[last_name] [nvarchar](50) NOT NULL,
	[id_group] [int] NOT NULL,
	[phone] [nvarchar](15) NOT NULL,
 CONSTRAINT [PK_Contact] PRIMARY KEY CLUSTERED 
(
	[id_contact] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON, OPTIMIZE_FOR_SEQUENTIAL_KEY = OFF) ON [PRIMARY]
) ON [PRIMARY]
GO
/****** Object:  Table [dbo].[Groups]    Script Date: 11/7/2020 11:41:52 AM ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [dbo].[Groups](
	[id_group] [int] IDENTITY(1,1) NOT NULL,
	[name] [nvarchar](50) NOT NULL,
	[description] [nvarchar](50) NOT NULL,
 CONSTRAINT [PK_Group] PRIMARY KEY CLUSTERED 
(
	[id_group] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON, OPTIMIZE_FOR_SEQUENTIAL_KEY = OFF) ON [PRIMARY]
) ON [PRIMARY]
GO
SET IDENTITY_INSERT [dbo].[Contact] ON 

INSERT [dbo].[Contact] ([id_contact], [first_name], [last_name], [id_group], [phone]) VALUES (2, N'Nhan', N'Hoang', 2, N'0935302089')
INSERT [dbo].[Contact] ([id_contact], [first_name], [last_name], [id_group], [phone]) VALUES (3, N'Lê', N'Hoàng', 2, N'0914743856')
INSERT [dbo].[Contact] ([id_contact], [first_name], [last_name], [id_group], [phone]) VALUES (4, N'Hello', N'Hi', 3, N'0914743961')
INSERT [dbo].[Contact] ([id_contact], [first_name], [last_name], [id_group], [phone]) VALUES (5, N'Lê', N'Anh', 3, N'0914743856')
SET IDENTITY_INSERT [dbo].[Contact] OFF
GO
SET IDENTITY_INSERT [dbo].[Groups] ON 

INSERT [dbo].[Groups] ([id_group], [name], [description]) VALUES (1, N'Family', N'Nhom gia dinh')
INSERT [dbo].[Groups] ([id_group], [name], [description]) VALUES (2, N'Friend', N'Nhom ban than')
INSERT [dbo].[Groups] ([id_group], [name], [description]) VALUES (3, N'Colleague', N'Nhom dong nhiep')
INSERT [dbo].[Groups] ([id_group], [name], [description]) VALUES (4, N'Animal', N'Nhóm động vật')
SET IDENTITY_INSERT [dbo].[Groups] OFF
GO

CREATE DATABASE PRJ321_DE140280;
USE [PRJ321_DE140280]
GO
/****** Object:  Table [dbo].[Course_DE140280]    Script Date: 10/24/2020 12:04:00 AM ******/
IF  EXISTS (SELECT * FROM sys.objects WHERE object_id = OBJECT_ID(N'[dbo].[Course_DE140280]') AND type in (N'U'))
DROP TABLE [dbo].[Course_DE140280]
GO
/****** Object:  Table [dbo].[Course_DE140280]    Script Date: 10/24/2020 12:04:00 AM ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [dbo].[Course_DE140280](
	[Course ID] [nvarchar](10) NOT NULL,
	[Subject] [nvarchar](100) NOT NULL,
	[Lecturer] [nvarchar](100) NOT NULL,
	[Schedule] [nvarchar](500) NOT NULL,
 CONSTRAINT [PK_Couse_DE140280] PRIMARY KEY CLUSTERED 
(
	[Course ID] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON, OPTIMIZE_FOR_SEQUENTIAL_KEY = OFF) ON [PRIMARY]
) ON [PRIMARY]
GO
INSERT [dbo].[Course_DE140280] ([Course ID], [Subject], [Lecturer], [Schedule]) VALUES (N'1232', N'123', N'123', N'123')
INSERT [dbo].[Course_DE140280] ([Course ID], [Subject], [Lecturer], [Schedule]) VALUES (N'PRJ3', N'321', N'321', N'321')
INSERT [dbo].[Course_DE140280] ([Course ID], [Subject], [Lecturer], [Schedule]) VALUES (N'PRJ311', N'Desktop Java Application', N'Nguyen Phong Son', N'2(3)-4(1-2)')
INSERT [dbo].[Course_DE140280] ([Course ID], [Subject], [Lecturer], [Schedule]) VALUES (N'PRJ321', N'Web programming with Java', N'Doan Duy Binh', N'3(1-2)-6(3)')
INSERT [dbo].[Course_DE140280] ([Course ID], [Subject], [Lecturer], [Schedule]) VALUES (N'SEC101', N'Security ', N'Le Anh Tuan', N'2(1-4)(5-6)')
INSERT [dbo].[Course_DE140280] ([Course ID], [Subject], [Lecturer], [Schedule]) VALUES (N'SEC102', N'Cyber Attack & Defense', N'Le Anh Tuan', N'122')
INSERT [dbo].[Course_DE140280] ([Course ID], [Subject], [Lecturer], [Schedule]) VALUES (N'Test', N'Testing', N'Testing', N'Testing')
INSERT [dbo].[Course_DE140280] ([Course ID], [Subject], [Lecturer], [Schedule]) VALUES (N'VN001', N'Tiáº¿ng viá»t 1 , ,2 ,3', N'Viá»t Nam', N'Háº±ng ngÃ y')
GO

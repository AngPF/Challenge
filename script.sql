/****** Object:  Table [dbo].[tb_cnw_usuarios]    Script Date: 12/09/2024 16:24:23 ******/
SET ANSI_NULLS ON
GO

SET QUOTED_IDENTIFIER ON
GO

CREATE TABLE [dbo].[tb_cnw_usuarios](
	[id] [bigint] NOT NULL,
	[email] [varchar](255) NULL,
	[nome] [varchar](255) NULL,
	[senha] [varchar](6) NULL,
PRIMARY KEY CLUSTERED 
(
	[id] ASC
)WITH (STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, OPTIMIZE_FOR_SEQUENTIAL_KEY = OFF) ON [PRIMARY]
) ON [PRIMARY]
GO

/****** Object:  Table [dbo].[tb_cnw_campanhas]    Script Date: 12/09/2024 16:24:59 ******/
SET ANSI_NULLS ON
GO

SET QUOTED_IDENTIFIER ON
GO

CREATE TABLE [dbo].[tb_cnw_campanhas](
	[id] [bigint] NOT NULL,
	[budget] [real] NOT NULL,
	[expectativa_alcance] [int] NOT NULL,
	[faixa_etaria_filme] [varchar](255) NULL,
	[genero_filme] [varchar](255) NULL,
	[titulo_filme] [varchar](255) NULL,
	[usuario_id] [bigint] NULL,
PRIMARY KEY CLUSTERED 
(
	[id] ASC
)WITH (STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, OPTIMIZE_FOR_SEQUENTIAL_KEY = OFF) ON [PRIMARY]
) ON [PRIMARY]
GO

ALTER TABLE [dbo].[tb_cnw_campanhas]  WITH CHECK ADD  CONSTRAINT [FK3y510p3xgdopw0plp1l28jj72] FOREIGN KEY([usuario_id])
REFERENCES [dbo].[tb_cnw_usuarios] ([id])
GO

ALTER TABLE [dbo].[tb_cnw_campanhas] CHECK CONSTRAINT [FK3y510p3xgdopw0plp1l28jj72]
GO

/****** Object:  Table [dbo].[tb_cnw_insights]    Script Date: 12/09/2024 16:25:14 ******/
SET ANSI_NULLS ON
GO

SET QUOTED_IDENTIFIER ON
GO

CREATE TABLE [dbo].[tb_cnw_insights](
	[id] [bigint] NOT NULL,
	[canal_marketing] [varchar](255) NULL,
	[custo_medio_clique] [real] NOT NULL,
	[previsao_convercao] [real] NOT NULL,
	[previsao_roi] [real] NOT NULL,
	[campanha_id] [bigint] NULL,
PRIMARY KEY CLUSTERED 
(
	[id] ASC
)WITH (STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, OPTIMIZE_FOR_SEQUENTIAL_KEY = OFF) ON [PRIMARY]
) ON [PRIMARY]
GO

ALTER TABLE [dbo].[tb_cnw_insights]  WITH CHECK ADD  CONSTRAINT [FKto1w956iq61xi7dh8byj91vc3] FOREIGN KEY([campanha_id])
REFERENCES [dbo].[tb_cnw_campanhas] ([id])
GO

ALTER TABLE [dbo].[tb_cnw_insights] CHECK CONSTRAINT [FKto1w956iq61xi7dh8byj91vc3]
GO

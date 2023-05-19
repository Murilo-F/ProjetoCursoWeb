--UNIDADESMEDIDA
create table UNIDADESMEDIDA (ID number(10) not null,DSUNIMED varchar2(50) not null,DSSIGLA varchar2(6) not null);
create unique index WEUNIMED_PK_UNIDADESMEDIDA on UNIDADESMEDIDA (ID);
alter table UNIDADESMEDIDA add constraint WEUNIMED_PK_UNIDADESMEDIDA primary key (ID) using index WEUNIMED_PK_UNIDADESMEDIDA;
create sequence WEUNIMEDID;

--MATERIAIS
create table MATERIAIS (ID number(10) not null,DSMATERIAL varchar2(100) not null,STMATERIAL number(10) not null,VLCOMPRA float,QTMINIMA float,IDUNIMED number(10));
create unique index WEMAT_PK_MATERIAIS on MATERIAIS (ID) ;
alter table MATERIAIS add constraint WEMAT_PK_MATERIAIS primary key (ID) using index WEMAT_PK_MATERIAIS;
create index WEMAT_IND_MAT_UNIMED on MATERIAIS (IDUNIMED);
alter table MATERIAIS add constraint FK_MAT_UNIMED foreign key (IDUNIMED) references UNIDADESMEDIDA (ID)  enable;
create sequence WEMATID;

--FUNCIONARIOS
create table FUNCIONARIOS (ID number(10) not null,STFUNCIONARIO number(10),CDLOGIN varchar2(20),CDSENHA varchar2(150));
create unique index WEFUNC_PK_FUNCIONARIOS on FUNCIONARIOS (ID);
alter table FUNCIONARIOS add constraint WEFUNC_PK_FUNCIONARIOS primary key (ID) using index WEFUNC_PK_FUNCIONARIOS;
create sequence WEFUNCID;

--FUNCIONARIOSCOMPLEMENTO
create table FUNCIONARIOSCOMPLEMENTO (ID number(10) not null,IDFUNCIONARIO number(10),NMFUNCIONARIO varchar2(200)) ;
create unique index WEFUNCCO_PK_FUNCIONARIOSCOMPL on FUNCIONARIOSCOMPLEMENTO (ID);                           
alter table FUNCIONARIOSCOMPLEMENTO add constraint WEFUNCCO_PK_FUNCIONARIOSCOMPL primary key (ID) using index WEFUNCCO_PK_FUNCIONARIOSCOMPL;
create index WEFUNCCO_IND_FUNCCOMP_FUNC on FUNCIONARIOSCOMPLEMENTO (IDFUNCIONARIO);
alter table FUNCIONARIOSCOMPLEMENTO add constraint FK_FUNCCOMP_FUNC foreign key (IDFUNCIONARIO) references FUNCIONARIOS (ID)  enable;
create sequence WEFUNCCOID;

--PESSOAS
create table PESSOAS (ID number(10) not null,NMPESSOA varchar2(100), STPESSOA number(10));
create unique index WEPES_PK_PESSOAS on PESSOAS (ID);
alter table PESSOAS add constraint WEPES_PK_PESSOAS primary key (ID) using index WEPES_PK_PESSOAS;
create sequence WEPESID;

--ARMAZENS
create table ARMAZENS (ID number(10) not null, NMARMAZEM varchar2(100));
create unique index WEARM_PK_ARMAZEM on ARMAZENS (ID);
alter table ARMAZENS add constraint WEARM_PK_ARMAZEM primary key (ID) using index WEARM_PK_ARMAZEM;
create sequence WEARMID;

--BOXES
create table BOXES (ID number(10) not null, CDBOX varchar2(15), IDARMAZEM number(10));
create unique index WEBOXES_PK_BOX on BOXES (ID);
alter table BOXES add constraint WEBOXES_PK_BOX primary key (ID) using index WEBOXES_PK_BOX;
create sequence WEBOXESID;

--LOTESESTOQUE
create table LOTESESTOQUE (ID number(10) not null, CDLOTE varchar2(100));
create unique index WELOTE_PK_LOTE on LOTESESTOQUE (ID);
alter table LOTESESTOQUE add constraint WELOTE_PK_LOTE primary key (ID) using index WELOTE_PK_LOTE;
create sequence WELOTEID;

--ATRIBUTOSESTOQUE
create table ATRIBUTOSESTOQUE (ID number(10) not null,IDFABRICANTE number(10),IDLOTEESTOQUE number(10),IDBOX number(10));
create unique index WEATRIES_PK_ATRIBUTOSESTOQUE on ATRIBUTOSESTOQUE (ID);
alter table ATRIBUTOSESTOQUE add constraint WEATRIES_PK_ATRIBUTOSESTOQUE primary key (ID) using index WEATRIES_PK_ATRIBUTOSESTOQUE;
create index WEATRIES_IND_ATRIESTO_PES on ATRIBUTOSESTOQUE (IDFABRICANTE);
create index WEATRIES_IND_ATRIESTO_LOTEEST on ATRIBUTOSESTOQUE (IDLOTEESTOQUE);
create index WEATRIES_IND_ATRIESTO_BOX on ATRIBUTOSESTOQUE (IDBOX);
alter table ATRIBUTOSESTOQUE add constraint FK_ATRIESTO_BOX foreign key (IDBOX) references BOXES (ID)  enable;
alter table ATRIBUTOSESTOQUE add constraint FK_ATRIESTO_PES foreign key (IDFABRICANTE) references PESSOAS (ID)  enable;
alter table ATRIBUTOSESTOQUE add constraint FK_ATRILOTE_LOTEEST foreign key (IDLOTEESTOQUE) references LOTESESTOQUE (ID)  enable;
create sequence WEATRIESID;

--MATERIAISFABRICANTE
create table MATERIAISFABRICANTE (ID number(10) not null,IDMATERIAL number(10) not null,IDFABRICANTE number(10) not null,CDEAN13 varchar2(13) not null);
create unique index WEMATFAB_PK_MATERIAISFABRICAN on MATERIAISFABRICANTE (ID);
alter table MATERIAISFABRICANTE add constraint WEMATFAB_PK_MATERIAISFABRICAN primary key (ID) using index WEMATFAB_PK_MATERIAISFABRICAN;
create index WEMATFAB_IND_MATFAB_MAT on MATERIAISFABRICANTE (IDMATERIAL);
create index WEMATFAB_IND_MATFAB_FAB on MATERIAISFABRICANTE (IDFABRICANTE);
alter table MATERIAISFABRICANTE add constraint FK_MATFAB_MAT foreign key (IDMATERIAL) references MATERIAIS (ID)  enable;
alter table MATERIAISFABRICANTE add constraint FK_MATFAB_FAB foreign key (IDFABRICANTE) references PESSOAS (ID)  enable;
create sequence WEMATFABID;

--MOVIMENTACOES
create table MOVIMENTACOES (ID number(10) not null,DTMOVIMENTO date,IDTIPOMOVIMENTO number(10),TIOPERACAO number(10),IDMATERIAL number(10),IDATRIESTO number(10),QTMOVIMENTO float,IDARMAZEM number(10));
create unique index WEMOV_PK_MOVIMENTACOES on MOVIMENTACOES (ID);
alter table MOVIMENTACOES add constraint WEMOV_PK_MOVIMENTACOES primary key (ID) using index WEMOV_PK_MOVIMENTACOES;
create index WEMOV_IND_MOV_ARM on MOVIMENTACOES (IDARMAZEM);
create index WEMOV_IND_MOV_ATRIESTO on MOVIMENTACOES (IDATRIESTO);
create index WEMOV_IND_MOV_TIPOMOVI on MOVIMENTACOES (IDTIPOMOVIMENTO);
alter table MOVIMENTACOES add constraint FK_MOVI_TIPOMOVI foreign key (IDTIPOMOVIMENTO) references TIPOSMOVIMENTO (ID)  enable;
alter table MOVIMENTACOES add constraint FK_MOVI_ATRIESTO foreign key (IDATRIESTO) references ATRIBUTOSESTOQUE (ID)  enable;
alter table MOVIMENTACOES add constraint FK_MOVI_ARM foreign key (IDARMAZEM) references ARMAZENS (ID)  enable;
create sequence WEMOVID;

--REQUISICOES
create table REQUISICOES (ID number(10) not null,STREQUISICAO number(10),IDFUNCIONARIO number(10),DTREQUISICAO date,IDTIPOMOVI number(10));
create unique index WEREQU_PK_REQUISICOES on REQUISICOES (ID);
alter table REQUISICOES add constraint WEREQU_PK_REQUISICOES primary key (ID) using index WEREQU_PK_REQUISICOES;
create index WEREQU_IND_REQU_FUNC on REQUISICOES (IDFUNCIONARIO);
create index WEREQU_IND_REQU_TIPOMOVI on REQUISICOES (IDTIPOMOVI);
alter table REQUISICOES add constraint FK_REQU_FUNC foreign key (IDFUNCIONARIO) references FUNCIONARIOS (ID)  enable;
alter table REQUISICOES add constraint FK_REQU_TIPOMOVI foreign key (IDTIPOMOVI) references TIPOSMOVIMENTO (ID)  enable;
create sequence WEREQUID;

--REQUISICOESITEM
create table REQUISICOESITEM (ID number(10) not null,IDREQUISICAO number(10),IDMATERIAL number(10)) ;
create unique index WEREITEM_PK_REQUISICOESITEM on REQUISICOESITEM (ID);
alter table REQUISICOESITEM add constraint WEREITEM_PK_REQUISICOESITEM primary key (ID) using index WEREITEM_PK_REQUISICOESITEM;
create index WEREITEM_IND_REQUITEM_REQU on REQUISICOESITEM (IDREQUISICAO);
create index WEREITEM_IND_REQUITEM_MAT on REQUISICOESITEM (IDMATERIAL);
alter table REQUISICOESITEM add constraint FK_REQUITEM_REQU foreign key (IDREQUISICAO) references REQUISICOES (ID)  enable;
alter table REQUISICOESITEM add constraint FK_REQUITEM_MAT foreign key (IDMATERIAL) references MATERIAIS (ID)  enable;
create sequence WEREITEMID;

--REQUISICOESATRIBUTO
create table REQUISICOESATRIBUTO (ID number(10) not null,IDREQUITEM number(10),IDATRIESTO number(10),QTREQUISICAO float,IDARMAZEM number(10)) tablespace &TableSpace_Tabelas;
create unique index WEREQUAT_PK_REQUISICOESATRIBU on REQUISICOESATRIBUTO (ID);
alter table REQUISICOESATRIBUTO add constraint WEREQUAT_PK_REQUISICOESATRIBU primary key (ID) using index WEREQUAT_PK_REQUISICOESATRIBU;
create index WEREQUAT_IND_REQUATRI_REQUITE on REQUISICOESATRIBUTO (IDREQUITEM);
create index WEREQUAT_IND_REQUATRI_ATRIEST on REQUISICOESATRIBUTO (IDATRIESTO) ;
create index WEREQUAT_IND_REQUATRI_ARM on REQUISICOESATRIBUTO (IDARMAZEM);
alter table REQUISICOESATRIBUTO add constraint FK_REQUATRI_REQUITEM foreign key (IDREQUITEM) references REQUISICOESITEM (ID)  enable;
alter table REQUISICOESATRIBUTO add constraint FK_REQUATRI_ATRILOTE foreign key (IDATRIESTO) references ATRIBUTOSESTOQUE (ID)  enable;
alter table REQUISICOESATRIBUTO add constraint FK_REQUATRI_ARM foreign key (IDARMAZEM) references ARMAZENS (ID)  enable;
create sequence WEREQUATID;

--REQUISICOESMOVIMENTO
create table REQUISICOESMOVIMENTO (ID number(10) not null,IDREQUATRI number(10),IDMOVIMENTO number(10));
create unique index WEREQUEM_PK_REQUISICOESMOVIME on REQUISICOESMOVIMENTO (ID);
alter table REQUISICOESMOVIMENTO add constraint WEREQUEM_PK_REQUISICOESMOVIME primary key (ID) using index WEREQUEM_PK_REQUISICOESMOVIME;
create index WEREQUEM_IND_REQUMOVI_REQUATR on REQUISICOESMOVIMENTO (IDREQUATRI);
create index WEREQUEM_IND_REQUMOVI_MOVI on REQUISICOESMOVIMENTO (IDMOVIMENTO);
alter table REQUISICOESMOVIMENTO add constraint FK_REQUMOVI_REQUATRI foreign key (IDREQUATRI) references REQUISICOESATRIBUTO (ID)  enable;
alter table REQUISICOESMOVIMENTO add constraint FK_REQUMOVI_MOVI foreign key (IDMOVIMENTO) references MOVIMENTACOES (ID)  enable;
create sequence WEREQUEMID;

















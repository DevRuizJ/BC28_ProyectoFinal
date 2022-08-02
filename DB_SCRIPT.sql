CREATE database BC28;

USE bc28;

CREATE TABLE MST_Document_Type (
    dct_id INTEGER NOT NULL auto_increment PRIMARY KEY,
    dct_name VARCHAR(20)
);

CREATE TABLE MST_Client (
    cli_id integer not null auto_increment PRIMARY KEY,
    cli_dct_id integer not null,
    cli_docNumber varchar(50),
    cli_name varchar(100),
    cli_lastName varchar(100),
    cli_motherLastName varchar(100),client_afp
	cli_phone varchar(20),
    cli_email varchar(50)
);

CREATE TABLE MST_Company (
    com_id INTEGER NOT NULL auto_increment PRIMARY KEY,
    com_dct_id integer not null,
    com_docNumber varchar(15),
    com_name VARCHAR(20)
);

CREATE TABLE MST_AFP (
	afp_id integer not null auto_increment primary key,
	afp_com_id integer
);

CREATE TABLE Client_AFP(
	cli_afp_id integer not null auto_increment primary key,
	cli_id integer,
    afp_id integer
);

ALTER TABLE Client_AFP
ADD COLUMN aporte_total decimal(10,2);

CREATE TABLE WITHDRAWAL_REQUEST(
	req_id integer not null auto_increment primary key,
    req_cli_afp_id integer
)
-- tabelle löschen
drop table programminformation;



-- tabelle anlegen
create table programminformation(
	nummer integer auto_increment,
	titel varchar(150),
	startzeit BIGINT,
	endzeit BIGINT,
	prod_verantwortlicher varchar(150),
	sende_verantwortlicher varchar(150),
	reale_startzeit BIGINT,
	reale_endzeit BIGINT,
	primary key (nummer)
);	

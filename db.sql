drop table programminformation;

create table programminformation(
	nummer integer auto_increment,
	titel varchar(150),
	startzeit BIGINT,
	endzeit BIGINT,
	vorname varchar(150),
	nachname varchar(150),
	reale_startzeit BIGINT,
	reale_endzeit BIGINT,
	primary key (nummer)
);	
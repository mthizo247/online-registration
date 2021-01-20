CREATE TABLE if not exists iq_person (
	id bigserial NOT NULL,
	full_name varchar(255) NOT NULL,
	id_number varchar(255) NOT NULL,
	telephone_number varchar(255) NULL,
	CONSTRAINT iq_person_pkey PRIMARY KEY (id)
);
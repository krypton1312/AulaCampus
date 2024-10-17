create table medicos(
	codmedico int(4) auto_increment,
	nombre varchar(40) not null,
	apellidos varchar(60) not null,
	dni varchar(12) not null,
	direccion varchar(45),
	telefono varchar(12) not null,
	poblacion enum('Valencia','Castellón','Alicante'),
	codpostal varchar(5),
	fechanac date,
	especialidad enum('Medicina General','Traumatología',
	'Dermatología','Aparato Digestívo') default 'Medicina General'
	not null,
	primary key (codmedico)
);


create table pacientes(
	codpaciente int(4) auto_increment,
	nombre varchar(40) not null,
	apellidos varchar(60) not null,
	dni varchar(12) not null,
	direccion varchar(45),
	telefono varchar(12) not null,
	poblacion enum('Valencia','Castellón','Alicante'),
	codpostal varchar(5),
	fechanac date,
	historial text,
	primary key (codpaciente)
);


create table ingresos(
	codingreso int(4) auto_increment,
	codpaciente int(4) not null,
	codmedico int(4) not null,
	fecha_ingreso datetime default now(),
	habitacion varchar(3),
	cama varchar(1),
	fecha_alta datetime,
	diagnostico text,
	primary key(codingreso)	
);

alter table ingresos add constraint 
ingresos_medicos_fk foreign key (codmedico)
references medicos(codmedico)
on delete cascade;

alter table ingresos add constraint 
ingresos_pacientes_fk foreign key (codpaciente)
references pacientes(codpaciente)
on delete cascade;

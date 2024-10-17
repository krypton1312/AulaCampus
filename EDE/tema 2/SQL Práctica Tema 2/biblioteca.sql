create table libros (
	codlibro int(4),
	titulo varchar(50),
	autor varchar(50),
	editorial varchar(50),
	tema varchar(50),
	isbn varchar(20),
	primary key(codlibro)
);


create table socios (
	codsocio int(4),
	nombre varchar(50),
	apellidos varchar(50),
	dni varchar(20),
	direccion varchar(50),
	telefono varchar(20),
	provincia varchar(30),
	codpostal varchar(10),
	fnacimiento date,
	cuota decimal(6,2),
	sexo varchar(5),
	primary key(codsocio)
);



create table prestamos (
	codprestamo int(4),
	codlibro int(4),
	codsocio int(4),
	fprestamo datetime,
	devolucion varchar(5),
	primary key(codprestamo)
);

alter table prestamos add constraint 
prestamos_libros_fk foreign key (codlibro) 
references libros(codlibro);

alter table prestamos add constraint 
prestamos_socios_fk foreign key (codsocio) 
references socios(codsocio);

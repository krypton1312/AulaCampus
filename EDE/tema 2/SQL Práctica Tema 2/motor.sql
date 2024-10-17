create table vehiculos(
codvehiculo int(4),
marca varchar(20),
modelo  varchar(40),
tipo varchar(5),
color varchar(15),
motor varchar(5),
cilindrada int(4),
fecha date,
matricula varchar(15),
extras varchar(100),
precio decimal(8,2)
);

create table clientes(
codcliente int(4),
nombre varchar(20),
apellidos varchar(40),
direccion varchar(40),
telefono varchar(15),
poblacion varchar(30),
edad int(3),
carnet varchar(5)
);

create table venta(
codventa int(4),
codvehiculo int(4),
codcliente int(4),
fechacompra date,
tipocompra varchar(5),
asegurado varchar(5)
);

alter table clientes add constraint clientes_pk primary key(codcliente);
alter table vehiculos add constraint vehiculos_pk primary key(codvehiculo);
alter table venta add constraint venta_pk primary key(codventa);
alter table venta add constraint venta_clientes_fk foreign key(codcliente) references clientes(codcliente) on delete cascade;
alter table venta add constraint venta_vehiculos_fk foreign key(codvehiculo) references vehiculos(codvehiculo) on delete cascade;

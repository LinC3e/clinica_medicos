create TABLE medicos(
    id INTEGER not null auto_increment,
    nombre VARCHAR(20) not null,
    email VARCHAR(20) not null unique,
    documento VARCHAR(20) not null unique,
    especialidad VARCHAR(20) not null,
    calle VARCHAR(20) not null,
    distrito VARCHAR(20) not null,
    ciudad VARCHAR(20) not null,
    numero VARCHAR(20),
    complemento VARCHAR(20),

    primary key (id)
);

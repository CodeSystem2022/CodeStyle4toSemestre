CREATE TABLE tareas (
    id SERIAL PRIMARY KEY,
    titulo VARCHAR(255) UNIQUE NOT NULL,
    descripcion TEXT,
);

ALTER TABLE tareas ADD COLUMN usuario_id INTEGER REFERENCES usuarios(id);

--remove unique from titulo
ALTER TABLE tareas DROP CONSTRAINT tareas_titulo_key;


CREATE TABLE usuarios (
    id SERIAL PRIMARY KEY,
    name VARCHAR(255) NOT NULL,
    email VARCHAR(255) UNIQUE NOT NULL,
    password VARCHAR(255) NOT NULL,
    fecha_registro TIMESTAMP NOT NULL DEFAULT CURRENT_TIMESTAMP,
    fecha_actualizacion TIMESTAMP NOT NULL DEFAULT CURRENT_TIMESTAMP,
);

ALTER TABLE usuarios ADD COLUMN gravatar VARCHAR(255)
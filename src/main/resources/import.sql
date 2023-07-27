INSERT INTO ACUDIENTE (nombre, apellido, email, direccion, telefono) VALUES ('Carlos', 'Gómez', 'carlos.gomez@email.com', 'Calle 456', '111222333');
INSERT INTO ACUDIENTE (nombre, apellido, email, direccion, telefono) VALUES ('Luisa', 'Martínez', 'luisa.martinez@email.com', 'Avenida Y', '444555666');
INSERT INTO ACUDIENTE (nombre, apellido, email, direccion, telefono) VALUES ('Ana', 'Rodríguez', 'ana.rodriguez@email.com', 'Carrera 789', '777888999');
INSERT INTO ACUDIENTE (nombre, apellido, email, direccion, telefono) VALUES ('Diego', 'Pérez', 'diego.perez@email.com', 'Calle Z', '000111222');
INSERT INTO ACUDIENTE (nombre, apellido, email, direccion, telefono) VALUES ('Marcela', 'López', 'marcela.lopez@email.com', 'Avenida 456', '333444555');
INSERT INTO ACUDIENTE (nombre, apellido, email, direccion, telefono) VALUES ('Andrés', 'García', 'andres.garcia@email.com', 'Carrera 789', '666777888');
INSERT INTO ACUDIENTE (nombre, apellido, email, direccion, telefono) VALUES ('Sofía', 'Hernández', 'sofia.hernandez@email.com', 'Calle XYZ', '999000111');
INSERT INTO ACUDIENTE (nombre, apellido, email, direccion, telefono) VALUES ('Martín', 'González', 'martin.gonzalez@email.com', 'Avenida ABC', '222333444');
INSERT INTO ACUDIENTE (nombre, apellido, email, direccion, telefono) VALUES ('Laura', 'Suárez', 'laura.suarez@email.com', 'Calle 123', '555666777');
INSERT INTO ACUDIENTE (nombre, apellido, email, direccion, telefono) VALUES ('Pedro', 'Ramírez', 'pedro.ramirez@email.com', 'Avenida DEF', '888999000');

INSERT INTO PROFESOR (nombre, apellido, profesion, id_calendario) VALUES ('Ana', 'Gómez', 'Biología', 1);
INSERT INTO PROFESOR (nombre, apellido, profesion, id_calendario) VALUES ('Luis', 'Martínez', 'Física', 2);
INSERT INTO PROFESOR (nombre, apellido, profesion, id_calendario) VALUES ('María', 'Pérez', 'Química', 1);
INSERT INTO PROFESOR (nombre, apellido, profesion, id_calendario) VALUES ('Carlos', 'López', 'Historia', 2);
INSERT INTO PROFESOR (nombre, apellido, profesion, id_calendario) VALUES ('Laura', 'García', 'Matemáticas', 1);
INSERT INTO PROFESOR (nombre, apellido, profesion, id_calendario) VALUES ('Andrés', 'Hernández', 'Literatura', 2);
INSERT INTO PROFESOR (nombre, apellido, profesion, id_calendario) VALUES ('Sofía', 'González', 'Inglés', 1);
INSERT INTO PROFESOR (nombre, apellido, profesion, id_calendario) VALUES ('Martín', 'Suárez', 'Música', 2);
INSERT INTO PROFESOR (nombre, apellido, profesion, id_calendario) VALUES ('Diego', 'Ramírez', 'Arte', 1);
INSERT INTO PROFESOR (nombre, apellido, profesion, id_calendario) VALUES ('Pedro', 'Gómez', 'Educación Física', 2);

INSERT INTO CALENDARIO (dia, horario) VALUES ('Lunes', '08:00 - 12:00');
INSERT INTO CALENDARIO (dia, horario) VALUES ('Martes', '14:00 - 18:00');
INSERT INTO CALENDARIO (dia, horario) VALUES ('Miércoles', '10:00 - 14:00');
INSERT INTO CALENDARIO (dia, horario) VALUES ('Jueves', '16:00 - 20:00');
INSERT INTO CALENDARIO (dia, horario) VALUES ('Viernes', '09:00 - 13:00');
INSERT INTO CALENDARIO (dia, horario) VALUES ('Sábado', '11:00 - 15:00');
INSERT INTO CALENDARIO (dia, horario) VALUES ('Domingo', 'Descanso');
INSERT INTO CALENDARIO (dia, horario) VALUES ('Lunes', '14:00 - 18:00');
INSERT INTO CALENDARIO (dia, horario) VALUES ('Martes', '08:00 - 12:00');
INSERT INTO CALENDARIO (dia, horario) VALUES ('Miércoles', '16:00 - 20:00');

INSERT INTO ALUMNOS (nombre, apellido, edad, id_acudiente, id_profesor) VALUES ('Jorge', 'Pérez', 16, 1, 1);
INSERT INTO ALUMNOS (nombre, apellido, edad, id_acudiente, id_profesor) VALUES ('Carolina', 'González', 15, 2, 2);
INSERT INTO ALUMNOS (nombre, apellido, edad, id_acudiente, id_profesor) VALUES ('Mateo', 'López', 14, 1, 3);
INSERT INTO ALUMNOS (nombre, apellido, edad, id_acudiente, id_profesor) VALUES ('Isabela', 'Ramírez', 17, 2, 4);
INSERT INTO ALUMNOS (nombre, apellido, edad, id_acudiente, id_profesor) VALUES ('Andrea', 'Suárez', 15, 1, 5);
INSERT INTO ALUMNOS (nombre, apellido, edad, id_acudiente, id_profesor) VALUES ('Felipe', 'Hernández', 16, 2, 6);
INSERT INTO ALUMNOS (nombre, apellido, edad, id_acudiente, id_profesor) VALUES ('Manuel', 'Martínez', 14, 1, 7);
INSERT INTO ALUMNOS (nombre, apellido, edad, id_acudiente, id_profesor) VALUES ('Camila', 'Gómez', 17, 2, 8);
INSERT INTO ALUMNOS (nombre, apellido, edad, id_acudiente, id_profesor) VALUES ('Valentina', 'Pérez', 15, 1, 9);
INSERT INTO ALUMNOS (nombre, apellido, edad, id_acudiente, id_profesor) VALUES ('Daniel', 'González', 14, 2, 10);




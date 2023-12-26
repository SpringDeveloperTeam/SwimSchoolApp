INSERT INTO acudientes(nombre, apellido, documento, email, direccion, telefono) VALUES ('Carlos', 'Gómez', '123456', 'carlos.gomez@email.com', 'Calle 456', '111222333');
INSERT INTO acudientes(nombre, apellido, documento, email, direccion, telefono) VALUES ('Diego', 'Pérez', '123456', 'diego.perez@email.com', 'Calle Z', '000111222');
INSERT INTO acudientes(nombre, apellido, documento, email, direccion, telefono) VALUES ('Marcela', 'López', '123456', 'marcela.lopez@email.com', 'Avenida 456', '333444555');
INSERT INTO acudientes(nombre, apellido, documento, email, direccion, telefono) VALUES ('Andrés', 'García', '123456', 'andres.garcia@email.com', 'Carrera 789', '666777888');
INSERT INTO acudientes(nombre, apellido, documento, email, direccion, telefono) VALUES ('Luisa', 'Martínez', '123456', 'luisa.martinez@email.com', 'Avenida Y', '444555666');
INSERT INTO acudientes(nombre, apellido, documento, email, direccion, telefono) VALUES ('Ana', 'Rodríguez', '123456', 'ana.rodriguez@email.com', 'Carrera 789', '777888999');
INSERT INTO acudientes(nombre, apellido, documento, email, direccion, telefono) VALUES ('Sofía', 'Hernández', '123456', 'sofia.hernandez@email.com', 'Calle XYZ', '999000111');
INSERT INTO acudientes(nombre, apellido, documento, email, direccion, telefono) VALUES ('Martín', 'González', '123456', 'martin.gonzalez@email.com', 'Avenida ABC', '222333444');
INSERT INTO acudientes(nombre, apellido, documento,  email, direccion, telefono) VALUES ('Laura', 'Suárez', '123456', 'laura.suarez@email.com', 'Calle 123', '555666777');
INSERT INTO acudientes(nombre, apellido, documento, email, direccion, telefono) VALUES ('Pedro', 'Ramírez', '123456', 'pedro.ramirez@email.com', 'Avenida DEF', '888999000');


INSERT INTO profesores(nombre, apellido, profesion) VALUES ('Ana', 'Gómez', 'Biología');
INSERT INTO profesores(nombre, apellido, profesion) VALUES ('Luis', 'Martínez', 'Física');
INSERT INTO profesores(nombre, apellido, profesion) VALUES ('María', 'Pérez', 'Química');
INSERT INTO profesores(nombre, apellido, profesion) VALUES ('Carlos', 'López', 'Historia');
INSERT INTO profesores(nombre, apellido, profesion) VALUES ('Laura', 'García', 'Matemáticas');
INSERT INTO profesores(nombre, apellido, profesion) VALUES ('Andrés', 'Hernández', 'Literatura');
INSERT INTO profesores(nombre, apellido, profesion) VALUES ('Sofía', 'González', 'Inglés');
INSERT INTO profesores(nombre, apellido, profesion) VALUES ('Martín', 'Suárez', 'Música');
INSERT INTO profesores(nombre, apellido, profesion) VALUES ('Diego', 'Ramírez', 'Arte');
INSERT INTO profesores(nombre, apellido, profesion) VALUES ('Pedro', 'Gómez', 'Educación Física');


INSERT INTO calendarios(dia, horario, id_profesor) VALUES ('Lunes', '08:00 - 12:00', 1);
INSERT INTO calendarios(dia, horario, id_profesor) VALUES ('Martes', '14:00 - 18:00', 2);
INSERT INTO calendarios(dia, horario, id_profesor) VALUES ('Miércoles', '10:00 - 14:00', 3);
INSERT INTO calendarios(dia, horario, id_profesor) VALUES ('Jueves', '16:00 - 20:00', 4);
INSERT INTO calendarios(dia, horario, id_profesor) VALUES ('Viernes', '09:00 - 13:00ES', 5);
INSERT INTO calendarios(dia, horario, id_profesor) VALUES ('Sábado', '11:00 - 15:00', 3);
INSERT INTO calendarios(dia, horario, id_profesor) VALUES ('Domingo', 'Descanso', 4);
INSERT INTO calendarios(dia, horario, id_profesor) VALUES ('Lunes', '14:00 - 18:00', 1);
INSERT INTO calendarios(dia, horario, id_profesor) VALUES ('Martes', '08:00 - 12:00', 6);
INSERT INTO calendarios(dia, horario, id_profesor) VALUES ('Miércoles', '16:00 - 20:00', 2);


INSERT INTO alumnos(nombre, apellido, edad, id_acudiente, id_profesor) VALUES ('Jorge', 'Perez', 16, 1, 1);
INSERT INTO alumnos(nombre, apellido, edad, id_acudiente, id_profesor) VALUES ('Carolina', 'Gonzalez', 15, 2, 2);
INSERT INTO alumnos(nombre, apellido, edad, id_acudiente, id_profesor) VALUES ('Mateo', 'Lopez', 14, 3, 3);
INSERT INTO alumnos(nombre, apellido, edad, id_acudiente, id_profesor) VALUES ('Isabela', 'Ramirez', 17, 4, 4);
INSERT INTO alumnos(nombre, apellido, edad, id_acudiente, id_profesor) VALUES ('Andrea', 'Suarez', 15, 5, 5);
INSERT INTO alumnos(nombre, apellido, edad, id_acudiente, id_profesor) VALUES ('Felipe', 'Hernandez', 16, 6, 6);
INSERT INTO alumnos(nombre, apellido, edad, id_acudiente, id_profesor) VALUES ('Manuel', 'Martinez', 14, 7, 7);
INSERT INTO alumnos(nombre, apellido, edad, id_acudiente, id_profesor) VALUES ('Camila', 'Gomez', 17, 8, 8);
INSERT INTO alumnos(nombre, apellido, edad, id_acudiente, id_profesor) VALUES ('Valentina', 'Perez', 15, 9, 9);
INSERT INTO alumnos(nombre, apellido, edad, id_acudiente, id_profesor) VALUES ('Daniel', 'Gonzalez', 14, 10, 10);


INSERT INTO facturas (monto_pagado, modo_pago, fecha_pago, id_acudiente) VALUES (100.00, 'Efectivo', '2023-01-01', 1);
INSERT INTO facturas (monto_pagado, modo_pago, fecha_pago, id_acudiente) VALUES (75.50, 'Tarjeta', '2023-01-02', 2);
INSERT INTO facturas (monto_pagado, modo_pago, fecha_pago, id_acudiente) VALUES (120.25, 'Cheque', '2023-01-03', 3);
INSERT INTO facturas (monto_pagado, modo_pago, fecha_pago, id_acudiente) VALUES (50.75, 'Transferencia', '2023-01-04', 4);
INSERT INTO facturas (monto_pagado, modo_pago, fecha_pago, id_acudiente) VALUES (90.60, 'Efectivo', '2023-01-04', 4);
INSERT INTO facturas (monto_pagado, modo_pago, fecha_pago, id_acudiente) VALUES (65.20, 'Tarjeta', '2023-01-06', 6);
INSERT INTO facturas (monto_pagado, modo_pago, fecha_pago, id_acudiente) VALUES (110.30, 'Cheque', '2023-01-07', 7);
INSERT INTO facturas (monto_pagado, modo_pago, fecha_pago, id_acudiente) VALUES (40.90, 'Transferencia', '2023-01-08', 8);
INSERT INTO facturas (monto_pagado, modo_pago, fecha_pago, id_acudiente) VALUES (85.75, 'Efectivo', '2023-01-09', 9);
INSERT INTO facturas (monto_pagado, modo_pago, fecha_pago, id_acudiente) VALUES (70.40, 'Tarjeta', '2023-01-10', 10);

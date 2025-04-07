DROP TABLE IF EXISTS usuario;

CREATE TABLE usuario (
    id INTEGER PRIMARY KEY AUTOINCREMENT,
    nombre TEXT NOT NULL,
    contrasenia TEXT NOT NULL,
    email TEXT UNIQUE NOT NULL
);

DROP TABLE IF EXISTS palabra;

CREATE TABLE palabra (
    id INTEGER PRIMARY KEY AUTOINCREMENT,
    palabra TEXT NOT NULL
);

-- Dificultad Fácil (Palabras de 5 o menos letras)
INSERT INTO palabra (palabra) VALUES ('gato');
INSERT INTO palabra (palabra) VALUES ('sol');
INSERT INTO palabra (palabra) VALUES ('luna');
INSERT INTO palabra (palabra) VALUES ('pan');
INSERT INTO palabra (palabra) VALUES ('mesa');
INSERT INTO palabra (palabra) VALUES ('vaca');
INSERT INTO palabra (palabra) VALUES ('rojo');
INSERT INTO palabra (palabra) VALUES ('agua');
INSERT INTO palabra (palabra) VALUES ('flor');
INSERT INTO palabra (palabra) VALUES ('piedra');

-- Dificultad Media (Palabras de 6 a 10 letras)
INSERT INTO palabra (palabra) VALUES ('manzana');
INSERT INTO palabra (palabra) VALUES ('elefante');
INSERT INTO palabra (palabra) VALUES ('ratonera');
INSERT INTO palabra (palabra) VALUES ('pelota');
INSERT INTO palabra (palabra) VALUES ('correr');
INSERT INTO palabra (palabra) VALUES ('ciclismo');
INSERT INTO palabra (palabra) VALUES ('camino');
INSERT INTO palabra (palabra) VALUES ('florero');
INSERT INTO palabra (palabra) VALUES ('libreria');
INSERT INTO palabra (palabra) VALUES ('reptil');

-- Dificultad Difícil (Palabras de más de 10 letras)
INSERT INTO palabra (palabra) VALUES ('computadora');
INSERT INTO palabra (palabra) VALUES ('electricidad');
INSERT INTO palabra (palabra) VALUES ('matematicas');
INSERT INTO palabra (palabra) VALUES ('biblioteca');
INSERT INTO palabra (palabra) VALUES ('desarrollador');
INSERT INTO palabra (palabra) VALUES ('inmortal');
INSERT INTO palabra (palabra) VALUES ('jurisprudencia');
INSERT INTO palabra (palabra) VALUES ('hipopotamo');
INSERT INTO palabra (palabra) VALUES ('microorganismo');
INSERT INTO palabra (palabra) VALUES ('revolucion');
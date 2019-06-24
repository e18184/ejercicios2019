CREATE TABLE Madre (
  Ci       varchar(255) NOT NULL, 
  Nombre   varchar(255), 
  Apellido varchar(255), 
  PRIMARY KEY (Ci));
CREATE TABLE Hijo (
  Ci      varchar(255) NOT NULL, 
  MadreCi varchar(255) NOT NULL, 
  Nombre  varchar(255), 
  PRIMARY KEY (Ci));
CREATE TABLE Mascota (
  Nombre   varchar(255) NOT NULL, 
  Registro varchar(255) NOT NULL, 
  PRIMARY KEY (Nombre));
CREATE TABLE saludmascota (
  Registroveterinaria varchar(255) NOT NULL, 
  Nombreveterinaria   varchar(255), 
  MascotaNombre       varchar(255), 
  HijoCi              varchar(255) NOT NULL, 
  PRIMARY KEY (Registroveterinaria));
ALTER TABLE Hijo ADD CONSTRAINT madrehijo FOREIGN KEY (MadreCi) REFERENCES Madre (Ci);
ALTER TABLE saludmascota ADD CONSTRAINT saludmascota FOREIGN KEY (MascotaNombre) REFERENCES Mascota (Nombre);
ALTER TABLE saludmascota ADD CONSTRAINT saludmascota2 FOREIGN KEY (HijoCi) REFERENCES Hijo (Ci);
INSERT INTO Madre(Ci, Nombre, Apellido) VALUES ('1', 'maria', 'perez');
INSERT INTO Madre(Ci, Nombre, Apellido) VALUES ('2', 'carla', 'suarez');
INSERT INTO Madre(Ci, Nombre, Apellido) VALUES ('3', 'daniela', 'rios');
INSERT INTO Hijo(Ci, MadreCi, Nombre) VALUES ('1', '1', 'filemon');
INSERT INTO Hijo(Ci, MadreCi, Nombre) VALUES ('2', '1', 'ricardo');
INSERT INTO Hijo(Ci, MadreCi, Nombre) VALUES ('3', '2', 'manuel');
INSERT INTO Hijo(Ci, MadreCi, Nombre) VALUES ('4', '2', 'carlos');
INSERT INTO Hijo(Ci, MadreCi, Nombre) VALUES ('5', '2', 'gonzalo');
INSERT INTO Mascota(Nombre, Registro) VALUES ('doki', '112');
INSERT INTO Mascota(Nombre, Registro) VALUES ('rambo', '113');
INSERT INTO Mascota(Nombre, Registro) VALUES ('', null);
INSERT INTO saludmascota(Registroveterinaria, Nombreveterinaria, MascotaNombre, HijoCi) VALUES ('221', 'la roca', 'doki', '2');
INSERT INTO saludmascota(Registroveterinaria, Nombreveterinaria, MascotaNombre, HijoCi) VALUES ('222', 'el paso', 'rambo', '1');

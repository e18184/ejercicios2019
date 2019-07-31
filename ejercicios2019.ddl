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
  Registro varchar(255), 
  PRIMARY KEY (Nombre));
CREATE TABLE saludmascota (
  Registroveterinaria varchar(255) NOT NULL, 
  Nombreveterinaria   varchar(255) NOT NULL, 
  MascotaNombre       varchar(255) NOT NULL, 
  HijoCi              varchar(255) NOT NULL, 
  PRIMARY KEY (Registroveterinaria, 
  Nombreveterinaria));
ALTER TABLE Hijo ADD CONSTRAINT FKHijo435143 FOREIGN KEY (MadreCi) REFERENCES Madre (Ci);
ALTER TABLE saludmascota ADD CONSTRAINT saludmascota FOREIGN KEY (MascotaNombre) REFERENCES Mascota (Nombre);
ALTER TABLE saludmascota ADD CONSTRAINT saludmascota2 FOREIGN KEY (HijoCi) REFERENCES Hijo (Ci);
INSERT INTO Madre(Ci, Nombre, Apellido) VALUES ('1', 'maria', 'paz');
INSERT INTO Madre(Ci, Nombre, Apellido) VALUES ('2', 'daniela', 'perez');
INSERT INTO Hijo(Ci, MadreCi, Nombre) VALUES ('1', '1', 'marcos');
INSERT INTO Hijo(Ci, MadreCi, Nombre) VALUES ('2', '1', 'julian');
INSERT INTO Hijo(Ci, MadreCi, Nombre) VALUES ('3', '2', 'manuela');
INSERT INTO Hijo(Ci, MadreCi, Nombre) VALUES ('4', '2', 'maria');
INSERT INTO Mascota(Nombre, Registro) VALUES ('doki', '1');
INSERT INTO Mascota(Nombre, Registro) VALUES ('rambo', '2');
INSERT INTO Mascota(Nombre, Registro) VALUES ('duque', '3');
INSERT INTO saludmascota(Registroveterinaria, Nombreveterinaria, MascotaNombre, HijoCi) VALUES ('111', 'dsfaf', 'doki', '1');
INSERT INTO saludmascota(Registroveterinaria, Nombreveterinaria, MascotaNombre, HijoCi) VALUES ('2222', 'sdfad', 'rambo', '2');

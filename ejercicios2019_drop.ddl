ALTER TABLE Hijo DROP CONSTRAINT FKHijo435143;
ALTER TABLE saludmascota DROP CONSTRAINT saludmascota;
ALTER TABLE saludmascota DROP CONSTRAINT saludmascota2;
DROP TABLE IF EXISTS Madre CASCADE;
DROP TABLE IF EXISTS Hijo CASCADE;
DROP TABLE IF EXISTS Mascota CASCADE;
DROP TABLE IF EXISTS saludmascota CASCADE;

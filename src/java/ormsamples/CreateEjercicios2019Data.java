/**
 * Licensee: 
 * License Type: Evaluation
 */
package ormsamples;

import org.orm.*;
public class CreateEjercicios2019Data {
	public void createTestData() throws PersistentException {
		// Insert sample data
		PersistentSession session = modelo.Ejercicios2019PersistentManager.instance().getSession();
		PersistentTransaction transaction = session.beginTransaction();
		try {
			session.doWork(new org.hibernate.jdbc.Work() {
				public void execute(java.sql.Connection conn) throws java.sql.SQLException {
					java.sql.Statement statement = conn.createStatement();
					statement.executeUpdate("INSERT INTO Madre(Ci, Nombre, Apellido) VALUES ('1', 'maria', 'paz')");
					statement.executeUpdate("INSERT INTO Madre(Ci, Nombre, Apellido) VALUES ('2', 'daniela', 'perez')");
					statement.executeUpdate("INSERT INTO Hijo(Ci, MadreCi, Nombre) VALUES ('1', '1', 'marcos')");
					statement.executeUpdate("INSERT INTO Hijo(Ci, MadreCi, Nombre) VALUES ('2', '1', 'julian')");
					statement.executeUpdate("INSERT INTO Hijo(Ci, MadreCi, Nombre) VALUES ('3', '2', 'manuela')");
					statement.executeUpdate("INSERT INTO Hijo(Ci, MadreCi, Nombre) VALUES ('4', '2', 'maria')");
					statement.executeUpdate("INSERT INTO Mascota(Nombre, Registro) VALUES ('doki', '1')");
					statement.executeUpdate("INSERT INTO Mascota(Nombre, Registro) VALUES ('rambo', '2')");
					statement.executeUpdate("INSERT INTO Mascota(Nombre, Registro) VALUES ('duque', '3')");
					statement.executeUpdate("INSERT INTO saludmascota(Registroveterinaria, Nombreveterinaria, MascotaNombre, HijoCi) VALUES ('111', 'dsfaf', 'doki', '1')");
					statement.executeUpdate("INSERT INTO saludmascota(Registroveterinaria, Nombreveterinaria, MascotaNombre, HijoCi) VALUES ('2222', 'sdfad', 'rambo', '2')");
					statement.close();
				}
			});
			transaction.commit();
		}
		catch (Exception e) {
			try {
				transaction.rollback();
			}
			catch (PersistentException e1) {
				e.printStackTrace();
			}
			e.printStackTrace();
		}
		
		PersistentTransaction t = modelo.Ejercicios2019PersistentManager.instance().getSession().beginTransaction();
		try {
			modelo.Madre lmodeloMadre = modelo.MadreDAO.createMadre();
			// TODO Initialize the properties of the persistent object here, the following properties must be initialized before saving : hijos, ci
			modelo.MadreDAO.save(lmodeloMadre);
			modelo.Hijo lmodeloHijo = modelo.HijoDAO.createHijo();
			// TODO Initialize the properties of the persistent object here, the following properties must be initialized before saving : saludmascotas, madre, ci
			modelo.HijoDAO.save(lmodeloHijo);
			modelo.Mascota lmodeloMascota = modelo.MascotaDAO.createMascota();
			// TODO Initialize the properties of the persistent object here, the following properties must be initialized before saving : saludmascotas, nombre
			modelo.MascotaDAO.save(lmodeloMascota);
			modelo.saludmascota lmodelosaludmascota = modelo.saludmascotaDAO.createSaludmascota();
			// TODO Initialize the properties of the persistent object here, the following properties must be initialized before saving : hijo, mascota, registroveterinaria
			modelo.saludmascotaDAO.save(lmodelosaludmascota);
			t.commit();
		}
		catch (Exception e) {
			t.rollback();
		}
		
	}
	
	public static void main(String[] args) {
		try {
			CreateEjercicios2019Data createEjercicios2019Data = new CreateEjercicios2019Data();
			try {
				createEjercicios2019Data.createTestData();
			}
			finally {
				modelo.Ejercicios2019PersistentManager.instance().disposePersistentManager();
			}
		}
		catch (Exception e) {
			e.printStackTrace();
		}
	}
}

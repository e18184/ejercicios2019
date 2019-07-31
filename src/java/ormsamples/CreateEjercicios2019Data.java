/**
 * Licensee: 
 * License Type: Evaluation
 */
package ormsamples;

import org.orm.*;
public class CreateEjercicios2019Data {
	public void createTestData() throws PersistentException {
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

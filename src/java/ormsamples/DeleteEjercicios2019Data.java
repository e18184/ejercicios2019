/**
 * Licensee: 
 * License Type: Evaluation
 */
package ormsamples;

import org.orm.*;
public class DeleteEjercicios2019Data {
	public void deleteTestData() throws PersistentException {
		PersistentTransaction t = modelo.Ejercicios2019PersistentManager.instance().getSession().beginTransaction();
		try {
			modelo.Madre lmodeloMadre = modelo.MadreDAO.loadMadreByQuery(null, null);
			// Delete the persistent object
			modelo.MadreDAO.delete(lmodeloMadre);
			modelo.Hijo lmodeloHijo = modelo.HijoDAO.loadHijoByQuery(null, null);
			// Delete the persistent object
			modelo.HijoDAO.delete(lmodeloHijo);
			modelo.Mascota lmodeloMascota = modelo.MascotaDAO.loadMascotaByQuery(null, null);
			// Delete the persistent object
			modelo.MascotaDAO.delete(lmodeloMascota);
			modelo.saludmascota lmodelosaludmascota = modelo.saludmascotaDAO.loadSaludmascotaByQuery(null, null);
			// Delete the persistent object
			modelo.saludmascotaDAO.delete(lmodelosaludmascota);
			t.commit();
		}
		catch (Exception e) {
			t.rollback();
		}
		
	}
	
	public static void main(String[] args) {
		try {
			DeleteEjercicios2019Data deleteEjercicios2019Data = new DeleteEjercicios2019Data();
			try {
				deleteEjercicios2019Data.deleteTestData();
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

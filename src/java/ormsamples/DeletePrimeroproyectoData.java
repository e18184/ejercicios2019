/**
 * Licensee: 
 * License Type: Evaluation
 */
package ormsamples;

import org.orm.*;
public class DeletePrimeroproyectoData {
	public void deleteTestData() throws PersistentException {
		PersistentTransaction t = modelo.PrimeroproyectoPersistentManager.instance().getSession().beginTransaction();
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
			DeletePrimeroproyectoData deletePrimeroproyectoData = new DeletePrimeroproyectoData();
			try {
				deletePrimeroproyectoData.deleteTestData();
			}
			finally {
				modelo.PrimeroproyectoPersistentManager.instance().disposePersistentManager();
			}
		}
		catch (Exception e) {
			e.printStackTrace();
		}
	}
}

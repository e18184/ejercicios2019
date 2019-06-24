/**
 * Licensee: 
 * License Type: Evaluation
 */
package ormsamples;

import org.orm.*;
public class RetrieveAndUpdatePrimeroproyectoData {
	public void retrieveAndUpdateTestData() throws PersistentException {
		PersistentTransaction t = modelo.PrimeroproyectoPersistentManager.instance().getSession().beginTransaction();
		try {
			modelo.Madre lmodeloMadre = modelo.MadreDAO.loadMadreByQuery(null, null);
			// Update the properties of the persistent object
			modelo.MadreDAO.save(lmodeloMadre);
			modelo.Hijo lmodeloHijo = modelo.HijoDAO.loadHijoByQuery(null, null);
			// Update the properties of the persistent object
			modelo.HijoDAO.save(lmodeloHijo);
			modelo.Mascota lmodeloMascota = modelo.MascotaDAO.loadMascotaByQuery(null, null);
			// Update the properties of the persistent object
			modelo.MascotaDAO.save(lmodeloMascota);
			modelo.saludmascota lmodelosaludmascota = modelo.saludmascotaDAO.loadSaludmascotaByQuery(null, null);
			// Update the properties of the persistent object
			modelo.saludmascotaDAO.save(lmodelosaludmascota);
			t.commit();
		}
		catch (Exception e) {
			t.rollback();
		}
		
	}
	
	public void retrieveByCriteria() throws PersistentException {
		System.out.println("Retrieving Madre by MadreCriteria");
		modelo.MadreCriteria lmodeloMadreCriteria = new modelo.MadreCriteria();
		// Please uncomment the follow line and fill in parameter(s)
		//lmodeloMadreCriteria.ci.eq();
		System.out.println(lmodeloMadreCriteria.uniqueMadre());
		
		System.out.println("Retrieving Hijo by HijoCriteria");
		modelo.HijoCriteria lmodeloHijoCriteria = new modelo.HijoCriteria();
		// Please uncomment the follow line and fill in parameter(s)
		//lmodeloHijoCriteria.ci.eq();
		System.out.println(lmodeloHijoCriteria.uniqueHijo());
		
		System.out.println("Retrieving Mascota by MascotaCriteria");
		modelo.MascotaCriteria lmodeloMascotaCriteria = new modelo.MascotaCriteria();
		// Please uncomment the follow line and fill in parameter(s)
		//lmodeloMascotaCriteria.nombre.eq();
		System.out.println(lmodeloMascotaCriteria.uniqueMascota());
		
		System.out.println("Retrieving saludmascota by saludmascotaCriteria");
		modelo.saludmascotaCriteria lmodelosaludmascotaCriteria = new modelo.saludmascotaCriteria();
		// Please uncomment the follow line and fill in parameter(s)
		//lmodelosaludmascotaCriteria.registroveterinaria.eq();
		System.out.println(lmodelosaludmascotaCriteria.uniqueSaludmascota());
		
	}
	
	
	public static void main(String[] args) {
		try {
			RetrieveAndUpdatePrimeroproyectoData retrieveAndUpdatePrimeroproyectoData = new RetrieveAndUpdatePrimeroproyectoData();
			try {
				retrieveAndUpdatePrimeroproyectoData.retrieveAndUpdateTestData();
				//retrieveAndUpdatePrimeroproyectoData.retrieveByCriteria();
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

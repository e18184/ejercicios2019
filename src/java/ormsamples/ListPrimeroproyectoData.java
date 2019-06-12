/**
 * Licensee: 
 * License Type: Evaluation
 */
package ormsamples;

import org.orm.*;
public class ListPrimeroproyectoData {
	private static final int ROW_COUNT = 100;
	
	public void listTestData() throws PersistentException {
		System.out.println("Listing Madre...");
		modelo.Madre[] modeloMadres = modelo.MadreDAO.listMadreByQuery(null, null);
		int length = Math.min(modeloMadres.length, ROW_COUNT);
		for (int i = 0; i < length; i++) {
			System.out.println(modeloMadres[i]);
		}
		System.out.println(length + " record(s) retrieved.");
		
		System.out.println("Listing Hijo...");
		modelo.Hijo[] modeloHijos = modelo.HijoDAO.listHijoByQuery(null, null);
		length = Math.min(modeloHijos.length, ROW_COUNT);
		for (int i = 0; i < length; i++) {
			System.out.println(modeloHijos[i]);
		}
		System.out.println(length + " record(s) retrieved.");
		
	}
	
	public void listByCriteria() throws PersistentException {
		System.out.println("Listing Madre by Criteria...");
		modelo.MadreCriteria lmodeloMadreCriteria = new modelo.MadreCriteria();
		// Please uncomment the follow line and fill in parameter(s) 
		//lmodeloMadreCriteria.ci.eq();
		lmodeloMadreCriteria.setMaxResults(ROW_COUNT);
		modelo.Madre[] modeloMadres = lmodeloMadreCriteria.listMadre();
		int length =modeloMadres== null ? 0 : Math.min(modeloMadres.length, ROW_COUNT); 
		for (int i = 0; i < length; i++) {
			 System.out.println(modeloMadres[i]);
		}
		System.out.println(length + " Madre record(s) retrieved."); 
		
		System.out.println("Listing Hijo by Criteria...");
		modelo.HijoCriteria lmodeloHijoCriteria = new modelo.HijoCriteria();
		// Please uncomment the follow line and fill in parameter(s) 
		//lmodeloHijoCriteria.ci.eq();
		lmodeloHijoCriteria.setMaxResults(ROW_COUNT);
		modelo.Hijo[] modeloHijos = lmodeloHijoCriteria.listHijo();
		length =modeloHijos== null ? 0 : Math.min(modeloHijos.length, ROW_COUNT); 
		for (int i = 0; i < length; i++) {
			 System.out.println(modeloHijos[i]);
		}
		System.out.println(length + " Hijo record(s) retrieved."); 
		
	}
	
	public static void main(String[] args) {
		try {
			ListPrimeroproyectoData listPrimeroproyectoData = new ListPrimeroproyectoData();
			try {
				listPrimeroproyectoData.listTestData();
				//listPrimeroproyectoData.listByCriteria();
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

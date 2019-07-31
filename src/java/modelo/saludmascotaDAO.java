/**
 * "Visual Paradigm: DO NOT MODIFY THIS FILE!"
 * 
 * This is an automatic generated file. It will be regenerated every time 
 * you generate persistence class.
 * 
 * Modifying its content may cause the program not work, or your work may lost.
 */

/**
 * Licensee: 
 * License Type: Evaluation
 */
package modelo;

import org.orm.*;
import org.hibernate.Query;
import org.hibernate.LockMode;
import java.util.List;

public class saludmascotaDAO {
	public static saludmascota loadSaludmascotaByORMID(String registroveterinaria, String nombreveterinaria) throws PersistentException {
		try {
			PersistentSession session = Ejercicios2019PersistentManager.instance().getSession();
			return loadSaludmascotaByORMID(session, registroveterinaria, nombreveterinaria);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static saludmascota getSaludmascotaByORMID(String registroveterinaria, String nombreveterinaria) throws PersistentException {
		try {
			PersistentSession session = Ejercicios2019PersistentManager.instance().getSession();
			return getSaludmascotaByORMID(session, registroveterinaria, nombreveterinaria);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static saludmascota loadSaludmascotaByORMID(String registroveterinaria, String nombreveterinaria, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = Ejercicios2019PersistentManager.instance().getSession();
			return loadSaludmascotaByORMID(session, registroveterinaria, nombreveterinaria, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static saludmascota getSaludmascotaByORMID(String registroveterinaria, String nombreveterinaria, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = Ejercicios2019PersistentManager.instance().getSession();
			return getSaludmascotaByORMID(session, registroveterinaria, nombreveterinaria, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static saludmascota loadSaludmascotaByORMID(PersistentSession session, String registroveterinaria, String nombreveterinaria) throws PersistentException {
		try {
			saludmascota saludmascota = new modelo.saludmascota();
			saludmascota.setRegistroveterinaria(registroveterinaria);
			saludmascota.setNombreveterinaria(nombreveterinaria);
			
			return (saludmascota) session.load(modelo.saludmascota.class, saludmascota);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static saludmascota getSaludmascotaByORMID(PersistentSession session, String registroveterinaria, String nombreveterinaria) throws PersistentException {
		try {
			saludmascota saludmascota = new modelo.saludmascota();
			saludmascota.setRegistroveterinaria(registroveterinaria);
			saludmascota.setNombreveterinaria(nombreveterinaria);
			
			return (saludmascota) session.get(modelo.saludmascota.class, saludmascota);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static saludmascota loadSaludmascotaByORMID(PersistentSession session, String registroveterinaria, String nombreveterinaria, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			saludmascota saludmascota = new modelo.saludmascota();
			saludmascota.setRegistroveterinaria(registroveterinaria);
			saludmascota.setNombreveterinaria(nombreveterinaria);
			
			return (saludmascota) session.load(modelo.saludmascota.class, saludmascota, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static saludmascota getSaludmascotaByORMID(PersistentSession session, String registroveterinaria, String nombreveterinaria, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			saludmascota saludmascota = new modelo.saludmascota();
			saludmascota.setRegistroveterinaria(registroveterinaria);
			saludmascota.setNombreveterinaria(nombreveterinaria);
			
			return (saludmascota) session.get(modelo.saludmascota.class, saludmascota, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static List querySaludmascota(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = Ejercicios2019PersistentManager.instance().getSession();
			return querySaludmascota(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static List querySaludmascota(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = Ejercicios2019PersistentManager.instance().getSession();
			return querySaludmascota(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static saludmascota[] listSaludmascotaByQuery(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = Ejercicios2019PersistentManager.instance().getSession();
			return listSaludmascotaByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static saludmascota[] listSaludmascotaByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = Ejercicios2019PersistentManager.instance().getSession();
			return listSaludmascotaByQuery(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static List querySaludmascota(PersistentSession session, String condition, String orderBy) throws PersistentException {
		StringBuffer sb = new StringBuffer("From modelo.saludmascota as saludmascota");
		if (condition != null)
			sb.append(" Where ").append(condition);
		if (orderBy != null)
			sb.append(" Order By ").append(orderBy);
		try {
			Query query = session.createQuery(sb.toString());
			return query.list();
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static List querySaludmascota(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		StringBuffer sb = new StringBuffer("From modelo.saludmascota as saludmascota");
		if (condition != null)
			sb.append(" Where ").append(condition);
		if (orderBy != null)
			sb.append(" Order By ").append(orderBy);
		try {
			Query query = session.createQuery(sb.toString());
			query.setLockMode("saludmascota", lockMode);
			return query.list();
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static saludmascota[] listSaludmascotaByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException {
		try {
			List list = querySaludmascota(session, condition, orderBy);
			return (saludmascota[]) list.toArray(new saludmascota[list.size()]);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static saludmascota[] listSaludmascotaByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			List list = querySaludmascota(session, condition, orderBy, lockMode);
			return (saludmascota[]) list.toArray(new saludmascota[list.size()]);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static saludmascota loadSaludmascotaByQuery(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = Ejercicios2019PersistentManager.instance().getSession();
			return loadSaludmascotaByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static saludmascota loadSaludmascotaByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = Ejercicios2019PersistentManager.instance().getSession();
			return loadSaludmascotaByQuery(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static saludmascota loadSaludmascotaByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException {
		saludmascota[] saludmascotas = listSaludmascotaByQuery(session, condition, orderBy);
		if (saludmascotas != null && saludmascotas.length > 0)
			return saludmascotas[0];
		else
			return null;
	}
	
	public static saludmascota loadSaludmascotaByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		saludmascota[] saludmascotas = listSaludmascotaByQuery(session, condition, orderBy, lockMode);
		if (saludmascotas != null && saludmascotas.length > 0)
			return saludmascotas[0];
		else
			return null;
	}
	
	public static java.util.Iterator iterateSaludmascotaByQuery(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = Ejercicios2019PersistentManager.instance().getSession();
			return iterateSaludmascotaByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static java.util.Iterator iterateSaludmascotaByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = Ejercicios2019PersistentManager.instance().getSession();
			return iterateSaludmascotaByQuery(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static java.util.Iterator iterateSaludmascotaByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException {
		StringBuffer sb = new StringBuffer("From modelo.saludmascota as saludmascota");
		if (condition != null)
			sb.append(" Where ").append(condition);
		if (orderBy != null)
			sb.append(" Order By ").append(orderBy);
		try {
			Query query = session.createQuery(sb.toString());
			return query.iterate();
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static java.util.Iterator iterateSaludmascotaByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		StringBuffer sb = new StringBuffer("From modelo.saludmascota as saludmascota");
		if (condition != null)
			sb.append(" Where ").append(condition);
		if (orderBy != null)
			sb.append(" Order By ").append(orderBy);
		try {
			Query query = session.createQuery(sb.toString());
			query.setLockMode("saludmascota", lockMode);
			return query.iterate();
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static saludmascota createSaludmascota() {
		return new modelo.saludmascota();
	}
	
	public static boolean save(modelo.saludmascota lsaludmascota) throws PersistentException {
		try {
			Ejercicios2019PersistentManager.instance().saveObject(lsaludmascota);
			return true;
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static boolean delete(modelo.saludmascota lsaludmascota) throws PersistentException {
		try {
			Ejercicios2019PersistentManager.instance().deleteObject(lsaludmascota);
			return true;
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static boolean deleteAndDissociate(modelo.saludmascota lsaludmascota)throws PersistentException {
		try {
			if (lsaludmascota.getMascota() != null) {
				lsaludmascota.getMascota().saludmascotas.remove(lsaludmascota);
			}
			
			if (lsaludmascota.getHijo() != null) {
				lsaludmascota.getHijo().saludmascotas.remove(lsaludmascota);
			}
			
			return delete(lsaludmascota);
		}
		catch(Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static boolean deleteAndDissociate(modelo.saludmascota lsaludmascota, org.orm.PersistentSession session)throws PersistentException {
		try {
			if (lsaludmascota.getMascota() != null) {
				lsaludmascota.getMascota().saludmascotas.remove(lsaludmascota);
			}
			
			if (lsaludmascota.getHijo() != null) {
				lsaludmascota.getHijo().saludmascotas.remove(lsaludmascota);
			}
			
			try {
				session.delete(lsaludmascota);
				return true;
			} catch (Exception e) {
				return false;
			}
		}
		catch(Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static boolean refresh(modelo.saludmascota lsaludmascota) throws PersistentException {
		try {
			Ejercicios2019PersistentManager.instance().getSession().refresh(lsaludmascota);
			return true;
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static boolean evict(modelo.saludmascota lsaludmascota) throws PersistentException {
		try {
			Ejercicios2019PersistentManager.instance().getSession().evict(lsaludmascota);
			return true;
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static saludmascota loadSaludmascotaByCriteria(saludmascotaCriteria saludmascotaCriteria) {
		saludmascota[] saludmascotas = listSaludmascotaByCriteria(saludmascotaCriteria);
		if(saludmascotas == null || saludmascotas.length == 0) {
			return null;
		}
		return saludmascotas[0];
	}
	
	public static saludmascota[] listSaludmascotaByCriteria(saludmascotaCriteria saludmascotaCriteria) {
		return saludmascotaCriteria.listSaludmascota();
	}
}

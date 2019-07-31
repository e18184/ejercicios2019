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

public class HijoDAO {
	public static Hijo loadHijoByORMID(String ci) throws PersistentException {
		try {
			PersistentSession session = Ejercicios2019PersistentManager.instance().getSession();
			return loadHijoByORMID(session, ci);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Hijo getHijoByORMID(String ci) throws PersistentException {
		try {
			PersistentSession session = Ejercicios2019PersistentManager.instance().getSession();
			return getHijoByORMID(session, ci);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Hijo loadHijoByORMID(String ci, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = Ejercicios2019PersistentManager.instance().getSession();
			return loadHijoByORMID(session, ci, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Hijo getHijoByORMID(String ci, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = Ejercicios2019PersistentManager.instance().getSession();
			return getHijoByORMID(session, ci, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Hijo loadHijoByORMID(PersistentSession session, String ci) throws PersistentException {
		try {
			return (Hijo) session.load(modelo.Hijo.class, ci);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Hijo getHijoByORMID(PersistentSession session, String ci) throws PersistentException {
		try {
			return (Hijo) session.get(modelo.Hijo.class, ci);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Hijo loadHijoByORMID(PersistentSession session, String ci, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			return (Hijo) session.load(modelo.Hijo.class, ci, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Hijo getHijoByORMID(PersistentSession session, String ci, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			return (Hijo) session.get(modelo.Hijo.class, ci, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static List queryHijo(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = Ejercicios2019PersistentManager.instance().getSession();
			return queryHijo(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static List queryHijo(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = Ejercicios2019PersistentManager.instance().getSession();
			return queryHijo(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Hijo[] listHijoByQuery(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = Ejercicios2019PersistentManager.instance().getSession();
			return listHijoByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Hijo[] listHijoByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = Ejercicios2019PersistentManager.instance().getSession();
			return listHijoByQuery(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static List queryHijo(PersistentSession session, String condition, String orderBy) throws PersistentException {
		StringBuffer sb = new StringBuffer("From modelo.Hijo as Hijo");
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
	
	public static List queryHijo(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		StringBuffer sb = new StringBuffer("From modelo.Hijo as Hijo");
		if (condition != null)
			sb.append(" Where ").append(condition);
		if (orderBy != null)
			sb.append(" Order By ").append(orderBy);
		try {
			Query query = session.createQuery(sb.toString());
			query.setLockMode("Hijo", lockMode);
			return query.list();
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Hijo[] listHijoByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException {
		try {
			List list = queryHijo(session, condition, orderBy);
			return (Hijo[]) list.toArray(new Hijo[list.size()]);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Hijo[] listHijoByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			List list = queryHijo(session, condition, orderBy, lockMode);
			return (Hijo[]) list.toArray(new Hijo[list.size()]);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Hijo loadHijoByQuery(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = Ejercicios2019PersistentManager.instance().getSession();
			return loadHijoByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Hijo loadHijoByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = Ejercicios2019PersistentManager.instance().getSession();
			return loadHijoByQuery(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Hijo loadHijoByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException {
		Hijo[] hijos = listHijoByQuery(session, condition, orderBy);
		if (hijos != null && hijos.length > 0)
			return hijos[0];
		else
			return null;
	}
	
	public static Hijo loadHijoByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		Hijo[] hijos = listHijoByQuery(session, condition, orderBy, lockMode);
		if (hijos != null && hijos.length > 0)
			return hijos[0];
		else
			return null;
	}
	
	public static java.util.Iterator iterateHijoByQuery(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = Ejercicios2019PersistentManager.instance().getSession();
			return iterateHijoByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static java.util.Iterator iterateHijoByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = Ejercicios2019PersistentManager.instance().getSession();
			return iterateHijoByQuery(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static java.util.Iterator iterateHijoByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException {
		StringBuffer sb = new StringBuffer("From modelo.Hijo as Hijo");
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
	
	public static java.util.Iterator iterateHijoByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		StringBuffer sb = new StringBuffer("From modelo.Hijo as Hijo");
		if (condition != null)
			sb.append(" Where ").append(condition);
		if (orderBy != null)
			sb.append(" Order By ").append(orderBy);
		try {
			Query query = session.createQuery(sb.toString());
			query.setLockMode("Hijo", lockMode);
			return query.iterate();
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Hijo createHijo() {
		return new modelo.Hijo();
	}
	
	public static boolean save(modelo.Hijo hijo) throws PersistentException {
		try {
			Ejercicios2019PersistentManager.instance().saveObject(hijo);
			return true;
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static boolean delete(modelo.Hijo hijo) throws PersistentException {
		try {
			Ejercicios2019PersistentManager.instance().deleteObject(hijo);
			return true;
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static boolean deleteAndDissociate(modelo.Hijo hijo)throws PersistentException {
		try {
			if (hijo.getMadre() != null) {
				hijo.getMadre().hijos.remove(hijo);
			}
			
			modelo.saludmascota[] lSaludmascotass = hijo.saludmascotas.toArray();
			for(int i = 0; i < lSaludmascotass.length; i++) {
				lSaludmascotass[i].setHijo(null);
			}
			return delete(hijo);
		}
		catch(Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static boolean deleteAndDissociate(modelo.Hijo hijo, org.orm.PersistentSession session)throws PersistentException {
		try {
			if (hijo.getMadre() != null) {
				hijo.getMadre().hijos.remove(hijo);
			}
			
			modelo.saludmascota[] lSaludmascotass = hijo.saludmascotas.toArray();
			for(int i = 0; i < lSaludmascotass.length; i++) {
				lSaludmascotass[i].setHijo(null);
			}
			try {
				session.delete(hijo);
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
	
	public static boolean refresh(modelo.Hijo hijo) throws PersistentException {
		try {
			Ejercicios2019PersistentManager.instance().getSession().refresh(hijo);
			return true;
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static boolean evict(modelo.Hijo hijo) throws PersistentException {
		try {
			Ejercicios2019PersistentManager.instance().getSession().evict(hijo);
			return true;
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Hijo loadHijoByCriteria(HijoCriteria hijoCriteria) {
		Hijo[] hijos = listHijoByCriteria(hijoCriteria);
		if(hijos == null || hijos.length == 0) {
			return null;
		}
		return hijos[0];
	}
	
	public static Hijo[] listHijoByCriteria(HijoCriteria hijoCriteria) {
		return hijoCriteria.listHijo();
	}
}

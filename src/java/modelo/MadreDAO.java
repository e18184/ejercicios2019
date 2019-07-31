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

public class MadreDAO {
	public static Madre loadMadreByORMID(String ci) throws PersistentException {
		try {
			PersistentSession session = Ejercicios2019PersistentManager.instance().getSession();
			return loadMadreByORMID(session, ci);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Madre getMadreByORMID(String ci) throws PersistentException {
		try {
			PersistentSession session = Ejercicios2019PersistentManager.instance().getSession();
			return getMadreByORMID(session, ci);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Madre loadMadreByORMID(String ci, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = Ejercicios2019PersistentManager.instance().getSession();
			return loadMadreByORMID(session, ci, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Madre getMadreByORMID(String ci, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = Ejercicios2019PersistentManager.instance().getSession();
			return getMadreByORMID(session, ci, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Madre loadMadreByORMID(PersistentSession session, String ci) throws PersistentException {
		try {
			return (Madre) session.load(modelo.Madre.class, ci);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Madre getMadreByORMID(PersistentSession session, String ci) throws PersistentException {
		try {
			return (Madre) session.get(modelo.Madre.class, ci);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Madre loadMadreByORMID(PersistentSession session, String ci, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			return (Madre) session.load(modelo.Madre.class, ci, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Madre getMadreByORMID(PersistentSession session, String ci, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			return (Madre) session.get(modelo.Madre.class, ci, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static List queryMadre(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = Ejercicios2019PersistentManager.instance().getSession();
			return queryMadre(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static List queryMadre(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = Ejercicios2019PersistentManager.instance().getSession();
			return queryMadre(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Madre[] listMadreByQuery(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = Ejercicios2019PersistentManager.instance().getSession();
			return listMadreByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Madre[] listMadreByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = Ejercicios2019PersistentManager.instance().getSession();
			return listMadreByQuery(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static List queryMadre(PersistentSession session, String condition, String orderBy) throws PersistentException {
		StringBuffer sb = new StringBuffer("From modelo.Madre as Madre");
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
	
	public static List queryMadre(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		StringBuffer sb = new StringBuffer("From modelo.Madre as Madre");
		if (condition != null)
			sb.append(" Where ").append(condition);
		if (orderBy != null)
			sb.append(" Order By ").append(orderBy);
		try {
			Query query = session.createQuery(sb.toString());
			query.setLockMode("Madre", lockMode);
			return query.list();
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Madre[] listMadreByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException {
		try {
			List list = queryMadre(session, condition, orderBy);
			return (Madre[]) list.toArray(new Madre[list.size()]);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Madre[] listMadreByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			List list = queryMadre(session, condition, orderBy, lockMode);
			return (Madre[]) list.toArray(new Madre[list.size()]);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Madre loadMadreByQuery(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = Ejercicios2019PersistentManager.instance().getSession();
			return loadMadreByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Madre loadMadreByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = Ejercicios2019PersistentManager.instance().getSession();
			return loadMadreByQuery(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Madre loadMadreByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException {
		Madre[] madres = listMadreByQuery(session, condition, orderBy);
		if (madres != null && madres.length > 0)
			return madres[0];
		else
			return null;
	}
	
	public static Madre loadMadreByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		Madre[] madres = listMadreByQuery(session, condition, orderBy, lockMode);
		if (madres != null && madres.length > 0)
			return madres[0];
		else
			return null;
	}
	
	public static java.util.Iterator iterateMadreByQuery(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = Ejercicios2019PersistentManager.instance().getSession();
			return iterateMadreByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static java.util.Iterator iterateMadreByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = Ejercicios2019PersistentManager.instance().getSession();
			return iterateMadreByQuery(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static java.util.Iterator iterateMadreByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException {
		StringBuffer sb = new StringBuffer("From modelo.Madre as Madre");
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
	
	public static java.util.Iterator iterateMadreByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		StringBuffer sb = new StringBuffer("From modelo.Madre as Madre");
		if (condition != null)
			sb.append(" Where ").append(condition);
		if (orderBy != null)
			sb.append(" Order By ").append(orderBy);
		try {
			Query query = session.createQuery(sb.toString());
			query.setLockMode("Madre", lockMode);
			return query.iterate();
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Madre createMadre() {
		return new modelo.Madre();
	}
	
	public static boolean save(modelo.Madre madre) throws PersistentException {
		try {
			Ejercicios2019PersistentManager.instance().saveObject(madre);
			return true;
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static boolean delete(modelo.Madre madre) throws PersistentException {
		try {
			Ejercicios2019PersistentManager.instance().deleteObject(madre);
			return true;
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static boolean deleteAndDissociate(modelo.Madre madre)throws PersistentException {
		try {
			modelo.Hijo[] lHijoss = madre.hijos.toArray();
			for(int i = 0; i < lHijoss.length; i++) {
				lHijoss[i].setMadre(null);
			}
			return delete(madre);
		}
		catch(Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static boolean deleteAndDissociate(modelo.Madre madre, org.orm.PersistentSession session)throws PersistentException {
		try {
			modelo.Hijo[] lHijoss = madre.hijos.toArray();
			for(int i = 0; i < lHijoss.length; i++) {
				lHijoss[i].setMadre(null);
			}
			try {
				session.delete(madre);
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
	
	public static boolean refresh(modelo.Madre madre) throws PersistentException {
		try {
			Ejercicios2019PersistentManager.instance().getSession().refresh(madre);
			return true;
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static boolean evict(modelo.Madre madre) throws PersistentException {
		try {
			Ejercicios2019PersistentManager.instance().getSession().evict(madre);
			return true;
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Madre loadMadreByCriteria(MadreCriteria madreCriteria) {
		Madre[] madres = listMadreByCriteria(madreCriteria);
		if(madres == null || madres.length == 0) {
			return null;
		}
		return madres[0];
	}
	
	public static Madre[] listMadreByCriteria(MadreCriteria madreCriteria) {
		return madreCriteria.listMadre();
	}
}

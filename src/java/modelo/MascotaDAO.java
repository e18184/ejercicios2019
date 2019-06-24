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

public class MascotaDAO {
	public static Mascota loadMascotaByORMID(String nombre) throws PersistentException {
		try {
			PersistentSession session = PrimeroproyectoPersistentManager.instance().getSession();
			return loadMascotaByORMID(session, nombre);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Mascota getMascotaByORMID(String nombre) throws PersistentException {
		try {
			PersistentSession session = PrimeroproyectoPersistentManager.instance().getSession();
			return getMascotaByORMID(session, nombre);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Mascota loadMascotaByORMID(String nombre, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = PrimeroproyectoPersistentManager.instance().getSession();
			return loadMascotaByORMID(session, nombre, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Mascota getMascotaByORMID(String nombre, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = PrimeroproyectoPersistentManager.instance().getSession();
			return getMascotaByORMID(session, nombre, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Mascota loadMascotaByORMID(PersistentSession session, String nombre) throws PersistentException {
		try {
			return (Mascota) session.load(modelo.Mascota.class, nombre);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Mascota getMascotaByORMID(PersistentSession session, String nombre) throws PersistentException {
		try {
			return (Mascota) session.get(modelo.Mascota.class, nombre);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Mascota loadMascotaByORMID(PersistentSession session, String nombre, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			return (Mascota) session.load(modelo.Mascota.class, nombre, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Mascota getMascotaByORMID(PersistentSession session, String nombre, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			return (Mascota) session.get(modelo.Mascota.class, nombre, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static List queryMascota(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = PrimeroproyectoPersistentManager.instance().getSession();
			return queryMascota(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static List queryMascota(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = PrimeroproyectoPersistentManager.instance().getSession();
			return queryMascota(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Mascota[] listMascotaByQuery(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = PrimeroproyectoPersistentManager.instance().getSession();
			return listMascotaByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Mascota[] listMascotaByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = PrimeroproyectoPersistentManager.instance().getSession();
			return listMascotaByQuery(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static List queryMascota(PersistentSession session, String condition, String orderBy) throws PersistentException {
		StringBuffer sb = new StringBuffer("From modelo.Mascota as Mascota");
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
	
	public static List queryMascota(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		StringBuffer sb = new StringBuffer("From modelo.Mascota as Mascota");
		if (condition != null)
			sb.append(" Where ").append(condition);
		if (orderBy != null)
			sb.append(" Order By ").append(orderBy);
		try {
			Query query = session.createQuery(sb.toString());
			query.setLockMode("Mascota", lockMode);
			return query.list();
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Mascota[] listMascotaByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException {
		try {
			List list = queryMascota(session, condition, orderBy);
			return (Mascota[]) list.toArray(new Mascota[list.size()]);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Mascota[] listMascotaByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			List list = queryMascota(session, condition, orderBy, lockMode);
			return (Mascota[]) list.toArray(new Mascota[list.size()]);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Mascota loadMascotaByQuery(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = PrimeroproyectoPersistentManager.instance().getSession();
			return loadMascotaByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Mascota loadMascotaByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = PrimeroproyectoPersistentManager.instance().getSession();
			return loadMascotaByQuery(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Mascota loadMascotaByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException {
		Mascota[] mascotas = listMascotaByQuery(session, condition, orderBy);
		if (mascotas != null && mascotas.length > 0)
			return mascotas[0];
		else
			return null;
	}
	
	public static Mascota loadMascotaByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		Mascota[] mascotas = listMascotaByQuery(session, condition, orderBy, lockMode);
		if (mascotas != null && mascotas.length > 0)
			return mascotas[0];
		else
			return null;
	}
	
	public static java.util.Iterator iterateMascotaByQuery(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = PrimeroproyectoPersistentManager.instance().getSession();
			return iterateMascotaByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static java.util.Iterator iterateMascotaByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = PrimeroproyectoPersistentManager.instance().getSession();
			return iterateMascotaByQuery(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static java.util.Iterator iterateMascotaByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException {
		StringBuffer sb = new StringBuffer("From modelo.Mascota as Mascota");
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
	
	public static java.util.Iterator iterateMascotaByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		StringBuffer sb = new StringBuffer("From modelo.Mascota as Mascota");
		if (condition != null)
			sb.append(" Where ").append(condition);
		if (orderBy != null)
			sb.append(" Order By ").append(orderBy);
		try {
			Query query = session.createQuery(sb.toString());
			query.setLockMode("Mascota", lockMode);
			return query.iterate();
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Mascota createMascota() {
		return new modelo.Mascota();
	}
	
	public static boolean save(modelo.Mascota mascota) throws PersistentException {
		try {
			PrimeroproyectoPersistentManager.instance().saveObject(mascota);
			return true;
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static boolean delete(modelo.Mascota mascota) throws PersistentException {
		try {
			PrimeroproyectoPersistentManager.instance().deleteObject(mascota);
			return true;
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static boolean deleteAndDissociate(modelo.Mascota mascota)throws PersistentException {
		try {
			modelo.saludmascota[] lSaludmascotass = mascota.saludmascotas.toArray();
			for(int i = 0; i < lSaludmascotass.length; i++) {
				lSaludmascotass[i].setMascota(null);
			}
			return delete(mascota);
		}
		catch(Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static boolean deleteAndDissociate(modelo.Mascota mascota, org.orm.PersistentSession session)throws PersistentException {
		try {
			modelo.saludmascota[] lSaludmascotass = mascota.saludmascotas.toArray();
			for(int i = 0; i < lSaludmascotass.length; i++) {
				lSaludmascotass[i].setMascota(null);
			}
			try {
				session.delete(mascota);
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
	
	public static boolean refresh(modelo.Mascota mascota) throws PersistentException {
		try {
			PrimeroproyectoPersistentManager.instance().getSession().refresh(mascota);
			return true;
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static boolean evict(modelo.Mascota mascota) throws PersistentException {
		try {
			PrimeroproyectoPersistentManager.instance().getSession().evict(mascota);
			return true;
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Mascota loadMascotaByCriteria(MascotaCriteria mascotaCriteria) {
		Mascota[] mascotas = listMascotaByCriteria(mascotaCriteria);
		if(mascotas == null || mascotas.length == 0) {
			return null;
		}
		return mascotas[0];
	}
	
	public static Mascota[] listMascotaByCriteria(MascotaCriteria mascotaCriteria) {
		return mascotaCriteria.listMascota();
	}
}

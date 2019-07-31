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

import org.hibernate.Criteria;
import org.orm.PersistentException;
import org.orm.PersistentSession;
import org.orm.criteria.*;

public class MascotaCriteria extends AbstractORMCriteria {
	public final StringExpression nombre;
	public final StringExpression registro;
	public final CollectionExpression saludmascotas;
	
	public MascotaCriteria(Criteria criteria) {
		super(criteria);
		nombre = new StringExpression("nombre", this);
		registro = new StringExpression("registro", this);
		saludmascotas = new CollectionExpression("ORM_Saludmascotas", this);
	}
	
	public MascotaCriteria(PersistentSession session) {
		this(session.createCriteria(Mascota.class));
	}
	
	public MascotaCriteria() throws PersistentException {
		this(Ejercicios2019PersistentManager.instance().getSession());
	}
	
	public saludmascotaCriteria createSaludmascotasCriteria() {
		return new saludmascotaCriteria(createCriteria("ORM_Saludmascotas"));
	}
	
	public Mascota uniqueMascota() {
		return (Mascota) super.uniqueResult();
	}
	
	public Mascota[] listMascota() {
		java.util.List list = super.list();
		return (Mascota[]) list.toArray(new Mascota[list.size()]);
	}
}


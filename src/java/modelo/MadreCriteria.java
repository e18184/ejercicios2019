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

public class MadreCriteria extends AbstractORMCriteria {
	public final StringExpression ci;
	public final StringExpression nombre;
	public final StringExpression apellido;
	public final CollectionExpression hijos;
	
	public MadreCriteria(Criteria criteria) {
		super(criteria);
		ci = new StringExpression("ci", this);
		nombre = new StringExpression("nombre", this);
		apellido = new StringExpression("apellido", this);
		hijos = new CollectionExpression("ORM_Hijos", this);
	}
	
	public MadreCriteria(PersistentSession session) {
		this(session.createCriteria(Madre.class));
	}
	
	public MadreCriteria() throws PersistentException {
		this(Ejercicios2019PersistentManager.instance().getSession());
	}
	
	public HijoCriteria createHijosCriteria() {
		return new HijoCriteria(createCriteria("ORM_Hijos"));
	}
	
	public Madre uniqueMadre() {
		return (Madre) super.uniqueResult();
	}
	
	public Madre[] listMadre() {
		java.util.List list = super.list();
		return (Madre[]) list.toArray(new Madre[list.size()]);
	}
}


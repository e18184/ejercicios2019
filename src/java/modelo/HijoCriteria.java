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

public class HijoCriteria extends AbstractORMCriteria {
	public final StringExpression ci;
	public final StringExpression madreId;
	public final AssociationExpression madre;
	public final StringExpression nombre;
	public final CollectionExpression saludmascotas;
	
	public HijoCriteria(Criteria criteria) {
		super(criteria);
		ci = new StringExpression("ci", this);
		madreId = new StringExpression("madre.ci", this);
		madre = new AssociationExpression("madre", this);
		nombre = new StringExpression("nombre", this);
		saludmascotas = new CollectionExpression("ORM_Saludmascotas", this);
	}
	
	public HijoCriteria(PersistentSession session) {
		this(session.createCriteria(Hijo.class));
	}
	
	public HijoCriteria() throws PersistentException {
		this(Ejercicios2019PersistentManager.instance().getSession());
	}
	
	public MadreCriteria createMadreCriteria() {
		return new MadreCriteria(createCriteria("madre"));
	}
	
	public saludmascotaCriteria createSaludmascotasCriteria() {
		return new saludmascotaCriteria(createCriteria("ORM_Saludmascotas"));
	}
	
	public Hijo uniqueHijo() {
		return (Hijo) super.uniqueResult();
	}
	
	public Hijo[] listHijo() {
		java.util.List list = super.list();
		return (Hijo[]) list.toArray(new Hijo[list.size()]);
	}
}


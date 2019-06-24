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

import java.util.List;
import org.hibernate.criterion.DetachedCriteria;
import org.orm.PersistentSession;
import org.orm.criteria.*;

public class HijoDetachedCriteria extends AbstractORMDetachedCriteria {
	public final StringExpression ci;
	public final StringExpression madreId;
	public final AssociationExpression madre;
	public final StringExpression nombre;
	public final CollectionExpression saludmascotas;
	
	public HijoDetachedCriteria() {
		super(modelo.Hijo.class, modelo.HijoCriteria.class);
		ci = new StringExpression("ci", this.getDetachedCriteria());
		madreId = new StringExpression("madre.ci", this.getDetachedCriteria());
		madre = new AssociationExpression("madre", this.getDetachedCriteria());
		nombre = new StringExpression("nombre", this.getDetachedCriteria());
		saludmascotas = new CollectionExpression("ORM_Saludmascotas", this.getDetachedCriteria());
	}
	
	public HijoDetachedCriteria(DetachedCriteria aDetachedCriteria) {
		super(aDetachedCriteria, modelo.HijoCriteria.class);
		ci = new StringExpression("ci", this.getDetachedCriteria());
		madreId = new StringExpression("madre.ci", this.getDetachedCriteria());
		madre = new AssociationExpression("madre", this.getDetachedCriteria());
		nombre = new StringExpression("nombre", this.getDetachedCriteria());
		saludmascotas = new CollectionExpression("ORM_Saludmascotas", this.getDetachedCriteria());
	}
	
	public MadreDetachedCriteria createMadreCriteria() {
		return new MadreDetachedCriteria(createCriteria("madre"));
	}
	
	public saludmascotaDetachedCriteria createSaludmascotasCriteria() {
		return new saludmascotaDetachedCriteria(createCriteria("ORM_Saludmascotas"));
	}
	
	public Hijo uniqueHijo(PersistentSession session) {
		return (Hijo) super.createExecutableCriteria(session).uniqueResult();
	}
	
	public Hijo[] listHijo(PersistentSession session) {
		List list = super.createExecutableCriteria(session).list();
		return (Hijo[]) list.toArray(new Hijo[list.size()]);
	}
}


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

public class MascotaDetachedCriteria extends AbstractORMDetachedCriteria {
	public final StringExpression nombre;
	public final StringExpression registro;
	public final CollectionExpression saludmascotas;
	
	public MascotaDetachedCriteria() {
		super(modelo.Mascota.class, modelo.MascotaCriteria.class);
		nombre = new StringExpression("nombre", this.getDetachedCriteria());
		registro = new StringExpression("registro", this.getDetachedCriteria());
		saludmascotas = new CollectionExpression("ORM_Saludmascotas", this.getDetachedCriteria());
	}
	
	public MascotaDetachedCriteria(DetachedCriteria aDetachedCriteria) {
		super(aDetachedCriteria, modelo.MascotaCriteria.class);
		nombre = new StringExpression("nombre", this.getDetachedCriteria());
		registro = new StringExpression("registro", this.getDetachedCriteria());
		saludmascotas = new CollectionExpression("ORM_Saludmascotas", this.getDetachedCriteria());
	}
	
	public saludmascotaDetachedCriteria createSaludmascotasCriteria() {
		return new saludmascotaDetachedCriteria(createCriteria("ORM_Saludmascotas"));
	}
	
	public Mascota uniqueMascota(PersistentSession session) {
		return (Mascota) super.createExecutableCriteria(session).uniqueResult();
	}
	
	public Mascota[] listMascota(PersistentSession session) {
		List list = super.createExecutableCriteria(session).list();
		return (Mascota[]) list.toArray(new Mascota[list.size()]);
	}
}


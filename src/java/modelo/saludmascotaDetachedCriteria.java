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

public class saludmascotaDetachedCriteria extends AbstractORMDetachedCriteria {
	public final StringExpression registroveterinaria;
	public final StringExpression nombreveterinaria;
	public final StringExpression mascotaId;
	public final AssociationExpression mascota;
	public final StringExpression hijoId;
	public final AssociationExpression hijo;
	
	public saludmascotaDetachedCriteria() {
		super(modelo.saludmascota.class, modelo.saludmascotaCriteria.class);
		registroveterinaria = new StringExpression("registroveterinaria", this.getDetachedCriteria());
		nombreveterinaria = new StringExpression("nombreveterinaria", this.getDetachedCriteria());
		mascotaId = new StringExpression("ORM_Mascota.null", this.getDetachedCriteria());
		mascota = new AssociationExpression("ORM_Mascota", this.getDetachedCriteria());
		hijoId = new StringExpression("ORM_Hijo.null", this.getDetachedCriteria());
		hijo = new AssociationExpression("ORM_Hijo", this.getDetachedCriteria());
	}
	
	public saludmascotaDetachedCriteria(DetachedCriteria aDetachedCriteria) {
		super(aDetachedCriteria, modelo.saludmascotaCriteria.class);
		registroveterinaria = new StringExpression("registroveterinaria", this.getDetachedCriteria());
		nombreveterinaria = new StringExpression("nombreveterinaria", this.getDetachedCriteria());
		mascotaId = new StringExpression("ORM_Mascota.null", this.getDetachedCriteria());
		mascota = new AssociationExpression("ORM_Mascota", this.getDetachedCriteria());
		hijoId = new StringExpression("ORM_Hijo.null", this.getDetachedCriteria());
		hijo = new AssociationExpression("ORM_Hijo", this.getDetachedCriteria());
	}
	
	public MascotaDetachedCriteria createMascotaCriteria() {
		return new MascotaDetachedCriteria(createCriteria("mascota"));
	}
	
	public HijoDetachedCriteria createHijoCriteria() {
		return new HijoDetachedCriteria(createCriteria("hijo"));
	}
	
	public saludmascota uniqueSaludmascota(PersistentSession session) {
		return (saludmascota) super.createExecutableCriteria(session).uniqueResult();
	}
	
	public saludmascota[] listSaludmascota(PersistentSession session) {
		List list = super.createExecutableCriteria(session).list();
		return (saludmascota[]) list.toArray(new saludmascota[list.size()]);
	}
}


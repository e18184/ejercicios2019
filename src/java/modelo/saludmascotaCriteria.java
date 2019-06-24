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

public class saludmascotaCriteria extends AbstractORMCriteria {
	public final StringExpression registroveterinaria;
	public final StringExpression nombreveterinaria;
	public final StringExpression mascotaId;
	public final AssociationExpression mascota;
	public final StringExpression hijoId;
	public final AssociationExpression hijo;
	
	public saludmascotaCriteria(Criteria criteria) {
		super(criteria);
		registroveterinaria = new StringExpression("registroveterinaria", this);
		nombreveterinaria = new StringExpression("nombreveterinaria", this);
		mascotaId = new StringExpression("ORM_Mascota.null", this);
		mascota = new AssociationExpression("ORM_Mascota", this);
		hijoId = new StringExpression("ORM_Hijo.null", this);
		hijo = new AssociationExpression("ORM_Hijo", this);
	}
	
	public saludmascotaCriteria(PersistentSession session) {
		this(session.createCriteria(saludmascota.class));
	}
	
	public saludmascotaCriteria() throws PersistentException {
		this(PrimeroproyectoPersistentManager.instance().getSession());
	}
	
	public MascotaCriteria createMascotaCriteria() {
		return new MascotaCriteria(createCriteria("ORM_Mascota"));
	}
	
	public HijoCriteria createHijoCriteria() {
		return new HijoCriteria(createCriteria("ORM_Hijo"));
	}
	
	public saludmascota uniqueSaludmascota() {
		return (saludmascota) super.uniqueResult();
	}
	
	public saludmascota[] listSaludmascota() {
		java.util.List list = super.list();
		return (saludmascota[]) list.toArray(new saludmascota[list.size()]);
	}
}


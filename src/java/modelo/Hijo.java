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

public class Hijo {
	public Hijo() {
	}
	
	public boolean equals(Object aObj) {
		if (aObj == this)
			return true;
		if (!(aObj instanceof Hijo))
			return false;
		Hijo hijo = (Hijo)aObj;
		if ((getCi() != null && !getCi().equals(hijo.getCi())) || (getCi() == null && hijo.getCi() != null))
			return false;
		return true;
	}
	
	public int hashCode() {
		int hashcode = 0;
		hashcode = hashcode + (getCi() == null ? 0 : getCi().hashCode());
		return hashcode;
	}
	
	private java.util.Set this_getSet (int key) {
		if (key == ORMConstants.KEY_HIJO_SALUDMASCOTAS) {
			return ORM_saludmascotas;
		}
		
		return null;
	}
	
	private void this_setOwner(Object owner, int key) {
		if (key == ORMConstants.KEY_HIJO_MADRE) {
			this.madre = (modelo.Madre) owner;
		}
	}
	
	org.orm.util.ORMAdapter _ormAdapter = new org.orm.util.AbstractORMAdapter() {
		public java.util.Set getSet(int key) {
			return this_getSet(key);
		}
		
		public void setOwner(Object owner, int key) {
			this_setOwner(owner, key);
		}
		
	};
	
	private String ci;
	
	private modelo.Madre madre;
	
	private String nombre;
	
	private java.util.Set ORM_saludmascotas = new java.util.HashSet();
	
	public void setCi(String value) {
		this.ci = value;
	}
	
	public String getCi() {
		return ci;
	}
	
	public String getORMID() {
		return getCi();
	}
	
	public void setNombre(String value) {
		this.nombre = value;
	}
	
	public String getNombre() {
		return nombre;
	}
	
	public void setMadre(modelo.Madre value) {
		if (madre != null) {
			madre.hijos.remove(this);
		}
		if (value != null) {
			value.hijos.add(this);
		}
	}
	
	public modelo.Madre getMadre() {
		return madre;
	}
	
	/**
	 * This method is for internal use only.
	 */
	public void setORM_Madre(modelo.Madre value) {
		this.madre = value;
	}
	
	private modelo.Madre getORM_Madre() {
		return madre;
	}
	
	public modelo.Mascota[] getMascotas() {
		java.util.ArrayList lValues = new java.util.ArrayList(5);
		for(java.util.Iterator lIter = saludmascotas.getIterator();lIter.hasNext();) {
			lValues.add(((modelo.saludmascota)lIter.next()).getMascota());
		}
		return (modelo.Mascota[])lValues.toArray(new modelo.Mascota[lValues.size()]);
	}
	
	public void removeMascota(modelo.Mascota aMascota) {
		modelo.saludmascota[] lSaludmascotas = saludmascotas.toArray();
		for(int i = 0; i < lSaludmascotas.length; i++) {
			if(lSaludmascotas[i].getMascota().equals(aMascota)) {
				saludmascotas.remove(lSaludmascotas[i]);
			}
		}
	}
	
	public void addMascota(modelo.saludmascota aSaludmascota, modelo.Mascota aMascota) {
		aSaludmascota.setMascota(aMascota);
		saludmascotas.add(aSaludmascota);
	}
	
	public modelo.saludmascota getSaludmascotaByMascota(modelo.Mascota aMascota) {
		modelo.saludmascota[] lSaludmascotas = saludmascotas.toArray();
		for(int i = 0; i < lSaludmascotas.length; i++) {
			if(lSaludmascotas[i].getMascota().equals(aMascota)) {
				return lSaludmascotas[i];
			}
		}
		return null;
	}
	
	private void setORM_Saludmascotas(java.util.Set value) {
		this.ORM_saludmascotas = value;
	}
	
	private java.util.Set getORM_Saludmascotas() {
		return ORM_saludmascotas;
	}
	
	public final modelo.saludmascotaSetCollection saludmascotas = new modelo.saludmascotaSetCollection(this, _ormAdapter, ORMConstants.KEY_HIJO_SALUDMASCOTAS, ORMConstants.KEY_SALUDMASCOTA_HIJO, ORMConstants.KEY_MUL_ONE_TO_MANY);
	
	public String toString() {
		return String.valueOf(getCi());
	}
	
}

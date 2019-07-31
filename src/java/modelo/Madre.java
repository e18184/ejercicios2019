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

public class Madre {
	public Madre() {
	}
	
	public boolean equals(Object aObj) {
		if (aObj == this)
			return true;
		if (!(aObj instanceof Madre))
			return false;
		Madre madre = (Madre)aObj;
		if ((getCi() != null && !getCi().equals(madre.getCi())) || (getCi() == null && madre.getCi() != null))
			return false;
		return true;
	}
	
	public int hashCode() {
		int hashcode = 0;
		hashcode = hashcode + (getCi() == null ? 0 : getCi().hashCode());
		return hashcode;
	}
	
	private java.util.Set this_getSet (int key) {
		if (key == ORMConstants.KEY_MADRE_HIJOS) {
			return ORM_hijos;
		}
		
		return null;
	}
	
	org.orm.util.ORMAdapter _ormAdapter = new org.orm.util.AbstractORMAdapter() {
		public java.util.Set getSet(int key) {
			return this_getSet(key);
		}
		
	};
	
	private String ci;
	
	private String nombre;
	
	private String apellido;
	
	private java.util.Set ORM_hijos = new java.util.HashSet();
	
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
	
	public void setApellido(String value) {
		this.apellido = value;
	}
	
	public String getApellido() {
		return apellido;
	}
	
	private void setORM_Hijos(java.util.Set value) {
		this.ORM_hijos = value;
	}
	
	private java.util.Set getORM_Hijos() {
		return ORM_hijos;
	}
	
	public final modelo.HijoSetCollection hijos = new modelo.HijoSetCollection(this, _ormAdapter, ORMConstants.KEY_MADRE_HIJOS, ORMConstants.KEY_HIJO_MADRE, ORMConstants.KEY_MUL_ONE_TO_MANY);
	
	public String toString() {
		return String.valueOf(getCi());
	}
	
}

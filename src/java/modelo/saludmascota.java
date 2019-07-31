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

import java.io.Serializable;
public class saludmascota implements Serializable {
	public saludmascota() {
	}
	
	public boolean equals(Object aObj) {
		if (aObj == this)
			return true;
		if (!(aObj instanceof saludmascota))
			return false;
		saludmascota saludmascota = (saludmascota)aObj;
		if ((getRegistroveterinaria() != null && !getRegistroveterinaria().equals(saludmascota.getRegistroveterinaria())) || (getRegistroveterinaria() == null && saludmascota.getRegistroveterinaria() != null))
			return false;
		if ((getNombreveterinaria() != null && !getNombreveterinaria().equals(saludmascota.getNombreveterinaria())) || (getNombreveterinaria() == null && saludmascota.getNombreveterinaria() != null))
			return false;
		return true;
	}
	
	public int hashCode() {
		int hashcode = 0;
		hashcode = hashcode + (getRegistroveterinaria() == null ? 0 : getRegistroveterinaria().hashCode());
		hashcode = hashcode + (getNombreveterinaria() == null ? 0 : getNombreveterinaria().hashCode());
		return hashcode;
	}
	
	private void this_setOwner(Object owner, int key) {
		if (key == ORMConstants.KEY_SALUDMASCOTA_HIJO) {
			this.hijo = (modelo.Hijo) owner;
		}
		
		else if (key == ORMConstants.KEY_SALUDMASCOTA_MASCOTA) {
			this.mascota = (modelo.Mascota) owner;
		}
	}
	
	org.orm.util.ORMAdapter _ormAdapter = new org.orm.util.AbstractORMAdapter() {
		public void setOwner(Object owner, int key) {
			this_setOwner(owner, key);
		}
		
	};
	
	private String registroveterinaria;
	
	private String nombreveterinaria;
	
	private modelo.Mascota mascota;
	
	private modelo.Hijo hijo;
	
	public void setRegistroveterinaria(String value) {
		this.registroveterinaria = value;
	}
	
	public String getRegistroveterinaria() {
		return registroveterinaria;
	}
	
	public void setNombreveterinaria(String value) {
		this.nombreveterinaria = value;
	}
	
	public String getNombreveterinaria() {
		return nombreveterinaria;
	}
	
	public void setHijo(modelo.Hijo value) {
		if (hijo != null) {
			hijo.saludmascotas.remove(this);
		}
		if (value != null) {
			value.saludmascotas.add(this);
		}
	}
	
	public modelo.Hijo getHijo() {
		return hijo;
	}
	
	/**
	 * This method is for internal use only.
	 */
	public void setORM_Hijo(modelo.Hijo value) {
		this.hijo = value;
	}
	
	private modelo.Hijo getORM_Hijo() {
		return hijo;
	}
	
	public void setMascota(modelo.Mascota value) {
		if (mascota != null) {
			mascota.saludmascotas.remove(this);
		}
		if (value != null) {
			value.saludmascotas.add(this);
		}
	}
	
	public modelo.Mascota getMascota() {
		return mascota;
	}
	
	/**
	 * This method is for internal use only.
	 */
	public void setORM_Mascota(modelo.Mascota value) {
		this.mascota = value;
	}
	
	private modelo.Mascota getORM_Mascota() {
		return mascota;
	}
	
	public String toString() {
		return String.valueOf(getRegistroveterinaria() + " " + getNombreveterinaria());
	}
	
}

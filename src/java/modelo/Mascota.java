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
public class Mascota implements Serializable {
	public Mascota() {
	}
	
	public boolean equals(Object aObj) {
		if (aObj == this)
			return true;
		if (!(aObj instanceof Mascota))
			return false;
		Mascota mascota = (Mascota)aObj;
		if ((getNombre() != null && !getNombre().equals(mascota.getNombre())) || (getNombre() == null && mascota.getNombre() != null))
			return false;
		return true;
	}
	
	public int hashCode() {
		int hashcode = 0;
		hashcode = hashcode + (getNombre() == null ? 0 : getNombre().hashCode());
		return hashcode;
	}
	
	private java.util.Set this_getSet (int key) {
		if (key == ORMConstants.KEY_MASCOTA_SALUDMASCOTAS) {
			return ORM_saludmascotas;
		}
		
		return null;
	}
	
	org.orm.util.ORMAdapter _ormAdapter = new org.orm.util.AbstractORMAdapter() {
		public java.util.Set getSet(int key) {
			return this_getSet(key);
		}
		
	};
	
	private String nombre;
	
	private String registro;
	
	private java.util.Set ORM_saludmascotas = new java.util.HashSet();
	
	public void setNombre(String value) {
		this.nombre = value;
	}
	
	public String getNombre() {
		return nombre;
	}
	
	public String getORMID() {
		return getNombre();
	}
	
	public void setRegistro(String value) {
		this.registro = value;
	}
	
	public String getRegistro() {
		return registro;
	}
	
	public modelo.Hijo[] getHijos() {
		java.util.ArrayList lValues = new java.util.ArrayList(5);
		for(java.util.Iterator lIter = saludmascotas.getIterator();lIter.hasNext();) {
			lValues.add(((modelo.saludmascota)lIter.next()).getHijo());
		}
		return (modelo.Hijo[])lValues.toArray(new modelo.Hijo[lValues.size()]);
	}
	
	public void removeHijo(modelo.Hijo aHijo) {
		modelo.saludmascota[] lSaludmascotas = saludmascotas.toArray();
		for(int i = 0; i < lSaludmascotas.length; i++) {
			if(lSaludmascotas[i].getHijo().equals(aHijo)) {
				saludmascotas.remove(lSaludmascotas[i]);
			}
		}
	}
	
	public void addHijo(modelo.saludmascota aSaludmascota, modelo.Hijo aHijo) {
		aSaludmascota.setHijo(aHijo);
		saludmascotas.add(aSaludmascota);
	}
	
	public modelo.saludmascota getSaludmascotaByHijo(modelo.Hijo aHijo) {
		modelo.saludmascota[] lSaludmascotas = saludmascotas.toArray();
		for(int i = 0; i < lSaludmascotas.length; i++) {
			if(lSaludmascotas[i].getHijo().equals(aHijo)) {
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
	
	public final modelo.saludmascotaSetCollection saludmascotas = new modelo.saludmascotaSetCollection(this, _ormAdapter, ORMConstants.KEY_MASCOTA_SALUDMASCOTAS, ORMConstants.KEY_SALUDMASCOTA_MASCOTA, ORMConstants.KEY_MUL_ONE_TO_MANY);
	
	public String toString() {
		return String.valueOf(getNombre());
	}
	
}

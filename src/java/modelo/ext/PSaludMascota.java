/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo.ext;
import java.util.List;
import modelo.saludmascota;

/**
 *
 * @author alumno
 */
public class PSaludMascota {
  public String nombre;
  public String registro;
  public boolean esmascota;
  public List<PSaludMascota>  lista;

    public boolean isEsmascota() {
        return esmascota;
    }

    public String cadenaesmascota(){
        return Boolean.toString(esmascota);
    }
    
    public void setEsmascota(boolean esmascota) {
        this.esmascota = esmascota;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getRegistro() {
        return registro;
    }

    public void setRegistro(String registro) {
        this.registro = registro;
    }

    public List<PSaludMascota> getLista() {
        return lista;
    }

    public void setLista(List<PSaludMascota> lista) {
        this.lista = lista;
    }
}

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
       
  private List nombrea;

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
  private List registroa;

    public List getNombrea() {
        return nombrea;
    }

    public void setNombrea(List nombrea) {
        this.nombrea = nombrea;
    }

    public List getRegistroa() {
        return registroa;
    }

    public void setRegistroa(List registroa) {
        this.registroa = registroa;
    }
}

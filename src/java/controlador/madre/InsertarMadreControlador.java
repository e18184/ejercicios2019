/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlador.madre;

import java.util.logging.Level;
import java.util.logging.Logger;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;
import org.orm.PersistentException;
import org.springframework.stereotype.Controller;
import modelo.Madre;
import modelo.MadreDAO;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMethod;
/**
 *
 * @author alumno
 */
@Controller 
@RequestMapping("adicionarmadre.html")
public class InsertarMadreControlador {
    
  @RequestMapping(method=RequestMethod.GET)
  public ModelAndView adicionarmadre(){
      ModelAndView vista = new ModelAndView();
      vista.setViewName("adicionarmadre");
      Madre madre = new Madre();
      // asignamos al atributo ci un valor por defecto
      madre.setCi("introdusca carnet");
      // asigmos al atributo nombre un valor por defecto 
      madre.setNombre("introdusca nombre");
      madre.setApellido("introdusca apellido");
      vista.addObject("madre",madre);
      
      return vista;
  }
  @RequestMapping(method=RequestMethod.POST)
  public ModelAndView adicionarMadrePOST(@ModelAttribute("madre") Madre pmadre) {
      ModelAndView vista = new ModelAndView();
     
          
          System.out.println("ci de la madre:"+pmadre.getCi());
          System.out.println("nombre de la madre:"+pmadre.getNombre());
          System.out.println("apellido de la madre:"+pmadre.getApellido());
          // insert into madre (ci,nombre,apellido) values
          // :pmadre.get
          MadreDAO.save(pmadre);
          
      
      return vista;
  }
  
}

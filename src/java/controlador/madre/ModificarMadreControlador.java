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
import org.springframework.web.bind.annotation.RequestParam;
/**
 *
 * @author alumno
 */
@Controller 
@RequestMapping("modificarmadre.html")
public class ModificarMadreControlador {
    
  @RequestMapping(method=RequestMethod.GET)
  public ModelAndView modificarmadre(@RequestParam("ci") String ci ) throws PersistentException{
      ModelAndView vista = new ModelAndView();
      
          
          vista.setViewName("modificarmadre");
          Madre m = MadreDAO.getMadreByORMID(ci);
          
          vista.addObject("madre",m);
          
         
     
      return vista;
  }
  @RequestMapping(method=RequestMethod.POST)
  public ModelAndView modificarMadrePOST(@ModelAttribute("madre") Madre pmadre) {
      ModelAndView vista = new ModelAndView();
      
          
          System.out.println("ci de la madre:"+pmadre.getCi());
          System.out.println("nombre de la madre:"+pmadre.getNombre());
          System.out.println("apellido de la madre:"+pmadre.getApellido());
          // insert into madre (ci,nombre,apellido) values 
          // :pmadre.get
          System.out.println("Los datos se modificaron");
      try {
          MadreDAO.save(pmadre);
      } catch (PersistentException ex) {
          Logger.getLogger(ModificarMadreControlador.class.getName()).log(Level.SEVERE, null, ex);
      }
          
     
      return vista;
  }
  
}

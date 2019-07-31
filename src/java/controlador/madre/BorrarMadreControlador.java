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
@RequestMapping("borrarmadre.html")
public class BorrarMadreControlador {
    
  @RequestMapping(method=RequestMethod.GET)
  public ModelAndView borrarmadre(@RequestParam("ci") String ci ){
      ModelAndView vista = new ModelAndView();
      vista.setViewName("borrarmadre");
      Madre m=null;
      m = MadreDAO.getMadreByORMID(ci);
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
      MadreDAO.delete(pmadre);
      return vista;
  }
  
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlador.hijo;

import controlador.hijo.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;
import org.orm.PersistentException;
import org.springframework.stereotype.Controller;
import modelo.Hijo;
import modelo.HijoDAO;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
/**
 *
 * @author alumno
 */
@Controller 
@RequestMapping("modificarhijo.html")
public class ModificarHijoControlador {
    
  @RequestMapping(method=RequestMethod.GET)
  public ModelAndView modificarhijo(@RequestParam("ci") String ci ) throws PersistentException{
      // se modifico 19/06/2019 modificar
      ModelAndView vista = new ModelAndView();
      
          
          vista.setViewName("modificarhijo");
          Hijo m = HijoDAO.getHijoByORMID(ci);
          
          vista.addObject("hijo",m);
          
         
     
      return vista;
  }
  @RequestMapping(method=RequestMethod.POST)
  public ModelAndView modificarhijoPOST(@ModelAttribute("hijo") Hijo phijo) {
      ModelAndView vista = new ModelAndView();
      
          
          System.out.println("ci de la hijo:"+phijo.getCi());
          System.out.println("nombre de la hijo:"+phijo.getNombre());
          // insert into madre (ci,nombre,apellido) values 
          // :phijo.get
          System.out.println("Los datos se modificaron");
          HijoDAO.save(phijo);
          
     
      return vista;
  }
  
}

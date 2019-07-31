/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlador.madre;

import java.lang.reflect.Method;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.portlet.ModelAndView;
import modelo.MadreDAO;
import modelo.Madre;
import org.orm.PersistentException;
import org.springframework.ui.Model;
/**
 *
 * @author alumno
 */
@Controller 
// ASOCIA CON LA VISTA
@RequestMapping("listarmadre")
public class ListarMadreControlador {
  @RequestMapping(method=RequestMethod.GET)
  public ModelAndView listarGet(Model modelo){
          ModelAndView vista = new ModelAndView();
   
      try {
          
     
          Madre[] madres=null;
          madres = MadreDAO.listMadreByQuery(null,"nombre ASC");
          // select * from Madre
          // where 
          // ci = 3
          modelo.addAttribute("mivariable",madres);
          
      } catch (PersistentException ex) {
          Logger.getLogger(ListarMadreControlador.class.getName()).log(Level.SEVERE, null, ex);
      }
             return vista;
   
  }
}

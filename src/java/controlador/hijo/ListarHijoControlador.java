/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlador.hijo;

import java.util.Set;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.portlet.ModelAndView;
import modelo.HijoDAO;
import modelo.Hijo;
import modelo.Madre;
import modelo.MadreDAO;
import org.orm.PersistentException;
import org.springframework.web.bind.annotation.RequestParam;
/**
 *
 * @author alumno
 */
@Controller
@RequestMapping("listarhijo")

public class ListarHijoControlador {
      @RequestMapping(method=RequestMethod.GET)
      public ModelAndView listarhijo(Model modelo, @RequestParam("ci") String mci){
         // se modifico 19/06/2019
          ModelAndView model = new ModelAndView();
         System.out.println("carnet de identidad madre"+mci);
          Madre madre = null;
          try {
              // me devuelve una madre
              madre = MadreDAO.getMadreByORMID(mci);
          } catch (PersistentException ex) {
              Logger.getLogger(ListarHijoControlador.class.getName()).log(Level.SEVERE, null, ex);
          }
          // enviar todo en una sola variable
           modelo.addAttribute("mivariable",madre.hijos.toArray());
           
          modelo.addAttribute("lmadre",madre);
           
          
          
                 
      
         return model;
      }
      

}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlador.saludmascota;

import modelo.saludmascotaDAO;
import modelo.saludmascota;

import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.portlet.ModelAndView;
import org.orm.PersistentException;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import modelo.ext.PSaludMascotaCompleto;
import modelo.Mascota;

/**
 *
 * @author alumno
 */
@Controller 
// ASOCIA CON LA VISTA
@RequestMapping("cambiarduenomascotacompleto")
public class GuardarSaludMascotaControladorCompleto {
  @RequestMapping(method=RequestMethod.GET)
  public String listarGet(Model model){
      //ModelAndView vista = new ModelAndView("cambiarduenomascota");
      List <saludmascota> sm = null;
       
      try {
          sm = saludmascotaDAO.querySaludmascota(null,null);
          
          System.out.println("valor de sm:"+sm);
         
          
          
      } catch (PersistentException ex) {
          Logger.getLogger(GuardarSaludMascotaControladorCompleto.class.getName()).log(Level.SEVERE, null, ex);
      }
      // lista de mascotas
         List<modelo.Mascota> lmascotas = new ArrayList<Mascota>();
         
         
        for (Iterator iterator = sm.iterator(); iterator.hasNext();) {
          saludmascota  smasc = (saludmascota)iterator.next();
          Mascota m = new Mascota();
          
          lmascotas.add(smasc.getMascota());
          
      }
          PSaludMascotaCompleto ps = new PSaludMascotaCompleto();
          ps.setMascotas(lmascotas);
          Mascota m = new Mascota();
          //m.saludmascotas.toArray()
          
          
         
          
          
          //vista.addObject("mivariable",ps);
      model.addAttribute("lista",ps);
     
      return "cambiarduenomascotacompleto";
  }
 /** @ModelAttribute("lista") 
  public List<saludmascota> getListaMascotaSalud(){
   List sm = null;
      try {  
          sm = saludmascotaDAO.querySaludmascota(null,null);
      
       
          
          
      } catch (PersistentException ex) {
          Logger.getLogger(GuardarSaludMascotaControlador.class.getName()).log(Level.SEVERE, null, ex);
      }
      System.out.println("controlador.saludmascota.GuardarSaludMascotaControlador.getListaMascotaSalud()");
      for (Iterator iterator = sm.iterator(); iterator.hasNext();) {
          saludmascota next = (saludmascota)iterator.next();
         
          System.out.println("dato es"+next.getMascota().getNombre());
      }
   return sm;
  }
  **/
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlador.saludmascota;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import modelo.HijoDAO;
import modelo.Hijo;
import modelo.MascotaDAO;
import modelo.Mascota;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.orm.PersistentException;
import org.springframework.ui.Model;
import modelo.ext.PSaludMascota;
import modelo.saludmascota;

import org.springframework.web.bind.annotation.RequestParam;

/**
 *
 * @author alumno
 */
@Controller 
// ASOCIA CON LA VISTA
@RequestMapping("cambiarduenomascota")
public class GuardarSaludMascotaControlador {
  @RequestMapping(method=RequestMethod.GET)
  public String listarGet(Model model, @RequestParam("ci") String mci){
      //ModelAndView vista = new ModelAndView("cambiarduenomascota");
     
      List <PSaludMascota> lmascota =null;
       
      try {
          // devuelve los datos en base al ci pasado por la url
          Hijo lhijo = HijoDAO.getHijoByORMID(mci);
          
      
      lmascota = MascotaDAO.queryMascota(null,null);
      
         List<PSaludMascota> listainterna = new ArrayList<PSaludMascota>();
         
        for (Iterator iterator = lmascota.iterator(); iterator.hasNext();) {
          Mascota  masc = (Mascota)iterator.next();
          PSaludMascota psm = new PSaludMascota();
          psm.setNombre(masc.getNombre());
          psm.setRegistro(masc.getRegistro());
            
          // numero de animales que tiene el hijo 
          saludmascota[] sm2 = lhijo.saludmascotas.toArray();
            for (int i = 0; i < sm2.length; i++) {
                saludmascota ms = (saludmascota)sm2[i];
                psm.setEsmascota(masc.getNombre()==ms.getMascota().getNombre());
                //if (masc.getNombre()==ms.getMascota().getNombre())
                    System.out.println("mascotas del hijo"+psm.getNombre()+"  "+psm.isEsmascota());
            }
                  
          //psm.setEsmascota(lsmpreguntar!=null); 
         listainterna.add(psm);
      }
          PSaludMascota ps = new PSaludMascota();
          ps.setLista(listainterna);
          
          
          
          //vista.addObject("mivariable",ps);
      model.addAttribute("lista",ps);
     
      return "cambiarduenomascota";
      } catch (PersistentException ex) {
          Logger.getLogger(GuardarSaludMascotaControlador.class.getName()).log(Level.SEVERE, null, ex);
      }
      return "cambiarduenomascota";
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

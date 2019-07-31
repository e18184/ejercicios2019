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
import modelo.HijoDAO;
import modelo.Hijo;
import modelo.MascotaDAO;
import modelo.Mascota;
import modelo.saludmascotaCriteria;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.portlet.ModelAndView;
import org.orm.PersistentException;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import modelo.ext.PSaludMascota;

import org.orm.criteria.StringExpression;
import org.springframework.http.HttpStatus;
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
      } catch (PersistentException ex) {
          Logger.getLogger(GuardarSaludMascotaControlador.class.getName()).log(Level.SEVERE, null, ex);
      }
         List<PSaludMascota> listainterna = new ArrayList<PSaludMascota>();
         
        for (Iterator iterator = lmascota.iterator(); iterator.hasNext();) {
          Mascota  masc = (Mascota)iterator.next();
          // condicion    
          // ordenado
          //smpreguntar = saludmascotaDAO.loadSaludmascotaByQuery("", orderBy)
           
          saludmascota[] lsmpreguntar = null;
          saludmascotaCriteria smpreguntar = null;
          try {
              smpreguntar = new saludmascotaCriteria();
          } catch (PersistentException ex) {
              Logger.getLogger(GuardarSaludMascotaControlador.class.getName()).log(Level.SEVERE, null, ex);
          }
          smpreguntar.hijoId.eq(mci);
          lsmpreguntar = smpreguntar.listSaludmascota();
          for(int i=0;i<lsmpreguntar.length;i++){
              System.out.println("nombre la mascota:"+lsmpreguntar[i].getMascota());
          }
          
          
          PSaludMascota psm = new PSaludMascota();
          psm.setNombre(masc.getNombre());
          psm.setRegistro(masc.getRegistro());
          psm.setEsmascota(lsmpreguntar!=null); 
         listainterna.add(psm);
      }
          PSaludMascota ps = new PSaludMascota();
          ps.setLista(listainterna);
          
          
          
          //vista.addObject("mivariable",ps);
      model.addAttribute("lista",ps);
     
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

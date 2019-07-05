<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@taglib  prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Listar Completa Clase Completo</title>
    </head>
    <body>
        
        <h1> Listar las mascotas completo </h1>
        
        <table border="1">
        <tbody>
            <th>nombres</th><th>registro</th>
        </tbody>
        <form:form action="cambiarduenomascotacompleto.html" method="POST" commandName="lista">
         <c:forEach var="mascota" items="${lista.getMascotas()}">
            <tr>
                <td>
                    <form:checkbox path="nombre" value="${mascota.getNombre()}" label="${mascota.getNombre()}"/>
                      
                </td>
              
          
             
                 <td>
                     <form:label path="registro"><c:out value="${mascota.getRegistro()}"></c:out></form:label>
                 </td>
             </tr>
              </c:forEach>
           <form:button>Aceptar</form:button>
         </form:form>
        
             <a href="listarmadre.html">Volver</a>
             
        </table>  
            
    </body>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@taglib  prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Listar Madre</title>
    </head>
    <body>
        
        <h1> Listar las mascotas </h1>
        
        <table border="1">
        <tbody>
            <th>nombres</th><th>registro</th><th>es</th>
        </tbody>
        <form:form action="cambiarduenomascota.html" method="POST" commandName="lista">
         <c:forEach var="l" items="${lista.getLista()}">
            <tr>
                <td>
                    <form:checkboxes path="nombre" value="${l.getNombre()}" label="${l.getNombre()}" 
                                   checked="${l.isEsmascota()?'checked':''}"/>
                      
                </td>
                 <td>
                     <form:input path="registro" value="${l.getRegistro()}" 
                                 label="${l.getRegistro()}"/>
                     
                 </td>
                 <td>
                     <c:out value="${l.isEsmascota()}"></c:out>
                     
                 </td>
                 
             </tr>
          </c:forEach>
           <form:button>Aceptar</form:button>
         </form:form>
        
             <a href="listarmadre.html">Volver</a>
             
        </table>  
            
    </body>
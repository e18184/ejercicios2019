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
        <c:out value="'La madre es': ${lmadre.getCi()} ${lmadre.getNombre()} ${lmadre.getApellido()} "></c:out>
        <br>
        <h1> Listar los datos del hijo </h1>
        
        <table border="1">
            <tbody><th>ci</th><th>nombre</th><th>Mod</th><th>Borrar</th>
            <th>Listar Mascota</th><th>Cambiar Dueno</th>
            <th>Cambiar Dueno (listar con Clase)</th>
        </tbody>
        
        <c:forEach items="${mivariable}" var="dato" >
            <tr>
                <td>    
            <h1><c:out value="${dato.getCi()}"></c:out></h1>
                </td>
                
                <td>    
             <h1><c:out value="${dato.getNombre()}"></c:out></h1>
                </td>
                <td> 
                    <h1><a href="<c:url value="modificarhijo.html?ci=${dato.getCi()}"/>">Mod</a></h1>
                </td>
                <td> 
                    <h1><a href="<c:url value="borrarmadre.html?ci=${dato.getCi()}"/>">Borr</a></h1>
                </td>
                <td> 
                    <h1><a href="<c:url value="listarmascota.html?ci=${dato.getCi()}"/>">Ver Mascota</a></h1>
                </td>
                <td> 
                    <h1><a href="<c:url value="cambiarduenomascota.html?ci=${dato.getCi()}"/>">Cambiar</a></h1>
                </td>
                <td> 
                    <h1><a href="<c:url value="cambiarduenomascotacompleto.html?ci=${dato.getCi()}"/>">Cambiar</a></h1>
                </td>
             </tr>
        </c:forEach>
             <a href="listarmadre.html">Volver</a>
             
        </table>  
           
            
       
    </body>
</html>
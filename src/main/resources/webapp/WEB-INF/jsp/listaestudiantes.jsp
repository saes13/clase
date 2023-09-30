<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<h1>Listado de estudiantes</h1>
<table border="2" width="70%" cellpadding="2">
    <tr>
        <th>Id</th>
        <th>Nombre</th>
        <th>Matricula</th>
        <th>Teléfono</th>
        <th>Editar</th>
        <th>Eliminar</th>
    </tr>
    <c:forEach var="estudiante" items="${estudiantes}">
        <tr>
            <td>${estudiante.id}</td>
            <td>${estudiante.nombre}</td>
            <td>${estudiante.matricula}</td>
            <td>${estudiante.telefono}</td>
            <td><a href="/actualizarEstudiante/${estudiante.id}">Editar</a></td>
            <td><a href="/eliminarEstudiante/${estudiante.id}">Eliminar</a></td>
        </tr>
    </c:forEach>
</table>
<br/>
<a href="/crearEstudiante">Crear nuevo estudiante</a>
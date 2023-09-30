<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<h1>Crear estudiante</h1>
<form:form method="post" action="/crearEstudiante">
    <table>
        <tr>
            <td>Matricula: </td>
            <td><form:input path="matricula"/></td>
        </tr>
        <tr>
            <td>Nombre: </td>
            <td><form:input path="nombre"/></td>
        </tr>
        <tr>
            <td>Teléfono: </td>
            <td><form:input path="telefono"/></td>
        </tr>
        <tr>
            <td></td>
            <td><input type="submit" value="Crear estudiante"/></td>
        </tr>
    </table>
</form:form>
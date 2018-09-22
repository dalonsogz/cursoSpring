<%@page import="com.atsistemas.personadb.entidades.Persona"%>

${clave.edad} - ${clave.nombre}

<%=((Persona)request.getAttribute("persona")).getEdad() %>
<%=((Persona)request.getAttribute("persona")).getNombre() %>

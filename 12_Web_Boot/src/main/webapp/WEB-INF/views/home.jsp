<%@page import="com.atsistemas.webboot.core.dto.PersonaDto"%>

${clave.edad} - ${clave.nombre}

<%=((PersonaDto)request.getAttribute("clave")).getEdad() %>
<%=((PersonaDto)request.getAttribute("clave")).getNombre() %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html lang="en">
<head>
<meta charset="utf-8">
<meta http-equiv="X-UA-Compatible" content="IE=edge">
<meta name="viewport" content="width=device-width, initial-scale=1">

<title>Seguimiento de TP</title>
<link href="css/bootstrap.min.css" rel="stylesheet">
</head>
<body>
	<div class="container">

			<select class="form-control" title="Seleccione grupo:" id="listaGrupos" name="listaGrupos">
				<c:forEach var="grupo" items="${grupos}">
					<option value="${grupo.nroGrupo}">Grupo: ${grupo.nroGrupo}</option>
				</c:forEach>
			</select>
			<button class="btnVerLista">Ver</button>

		<div id="tablaLista"></div>


	</div>








	<script
		src="https://ajax.googleapis.com/ajax/libs/jquery/1.12.4/jquery.min.js"></script>
	<script src="js/bootstrap.min.js"></script>
	<script src="js/sEstructura.js"></script>

</body>


</html>
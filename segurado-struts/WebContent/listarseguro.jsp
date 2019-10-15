<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib prefix="s" uri="/struts-tags"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<link rel="stylesheet"
	href="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css"
	integrity="sha384-ggOyR0iXCbMQv3Xipma34MD+dH/1fQ784/j6cY/iJTQUOhcWr7x9JvoRxT2MZw1T"
	crossorigin="anonymous">
<link rel="stylesheet" href="./css/style.css">
<title>Listar Seguro</title>
</head>
<body>
	<div class="container">
		<div class="row">
			<div class="col-sm-9 col-md-8 col-lg-8 mx-auto">
				<div class="card card-signin my-5">
					<div class="card-body">
				
						<h5 class="card-title text-center">Listar Seguro</h5>

						<table class="table table-bordered">
							<tr class="table-info">
								<td></td>
								<td>Identificação</td>
								<td>Valor</td>
								<td>Ações</td>
							</tr>
							
							<s:iterator value="list">
								<tr>
									<td><s:property value="idseguro" /></td>
									<td><s:property value="identificacao" /></td>
									<td><s:property value="valor" /></td>
									<td><a class="btn btn-warning btn-sm"
										href="">Editar</a>
										<a class="btn btn-danger btn-sm"  href="">Excluir</a></td>		
								</tr>
							</s:iterator>
							
						</table>

					</div>
				</div>
			</div>
		</div>
	</div>
</body>
</html>
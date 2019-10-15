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
<title>Listar Segurado</title>
</head>
<body>
	<div class="container">
		<div class="row">
			<div class="col-sm-12 col-md-12 col-lg-7  mx-auto">
				<div class="card card-signin my-5  shadow-lg">
					<div class="card-body">
						<h5 class="card-title text-center">Listar Segurado</h5>

						<table class="table table-bordered">
							<tr class="table-info">
								<td></td>
								<td>Nome</td>
								<td>CPF</td>
								<td>RG</td>
								<td>Ações</td>

							</tr>

							<s:iterator value="list">
								<tr>
									<td><s:property value="idsegurado" /></td>
									<td><s:property value="nome" /></td>
									<td><s:property value="cpf" /></td>
									<td><s:property value="rg" /></td>
									<td><a class="btn btn-warning btn-sm" href="">Editar</a> <a
										class="btn btn-danger btn-sm" href="">Excluir</a></td>
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


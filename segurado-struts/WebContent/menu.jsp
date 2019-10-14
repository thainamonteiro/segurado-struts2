<!DOCTYPE html>
<html>
<head>
<title>Menu</title>
<link rel="stylesheet"
	href="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css"
	integrity="sha384-ggOyR0iXCbMQv3Xipma34MD+dH/1fQ784/j6cY/iJTQUOhcWr7x9JvoRxT2MZw1T"
	crossorigin="anonymous">
<link rel="stylesheet" href="./css/style.css">
</head>
<body>
	<div class="container">
		<div class="row">
			<div class="col-sm-4 col-md-12 col-lg-8 mx-auto">
				<div class="card card-signin my-5">
					${msg}
					<div class="card-body">
						<h5 class="card-title text-center">Menu</h5>
						<center>
							<a class="btn btn-primary" href="cadastrarsegurado.jsp" role="button">Cadastro Segurado</a> 
							<a class="btn btn-primary" href="listarsegurado.jsp" role="button">Listar Segurado</a> 
							<a class="btn btn-primary" href="cadastrarseguro.jsp" role="button">Cadastrar Seguro </a> 
							<a class="btn btn-primary" href="listarseguro.jsp" role="button">Listar Seguros</a>
						</center>
					</div>
				</div>
			</div>
		</div>
	</div>
</body>
</html>
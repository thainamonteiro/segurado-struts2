<%@ taglib prefix="s" uri="/struts-tags"%>
<html>
<head>
<title>Login Segurado</title>
<link rel="stylesheet"
	href="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css"
	integrity="sha384-ggOyR0iXCbMQv3Xipma34MD+dH/1fQ784/j6cY/iJTQUOhcWr7x9JvoRxT2MZw1T"
	crossorigin="anonymous">
<link rel="stylesheet" href="css/style.css">
</head>
<body>
	<div class="container">
		<div class="row">
			<div class="col-sm-9 col-md-7 col-lg-5 mx-auto">
				<div class="card card-signin my-5">
					<div class="card-body">

						<h5 class="card-title text-center">Login</h5>
						<s:actionerror /> 
						<s:form action="login.action" method="post">
							<div class="form-group">
								<s:textfield placeholder="Digite seu user" id="usuario"
									name="usuario" class="form-control" key="label.usuario"
									size="35px" />
							</div>

							<div class="form-group">
								<s:password placeholder="Digite sua senha" id="senha"
									name="senha" class="form-control" key="label.senha" size="35px" />
							</div>

							<div class="form-group">
								<s:submit class="btn btn-primary" method="execute"
									key="label.submit" />
							</div>
						</s:form>

					</div>
				</div>
			</div>
		</div>
	</div>
</body>
</html>
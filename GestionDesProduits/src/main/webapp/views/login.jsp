<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="ISO-8859-1">
		<title>Login page</title>
		<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.5.2/css/bootstrap.min.css">
		<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.5.1/jquery.min.js"></script>
		<script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.16.0/umd/popper.min.js"></script>
		<script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.5.2/js/bootstrap.min.js"></script>
	</head>
	<body>
		
		<div class="container">
			<div class="row">
				<div class="col-md-6 offset-md-3">
					<div class="card mt-5">
						<div class="card-header">Authentification</div>
						<div class="card-body">
							<form method="post" action="login">
								<div class="form-group">
									<label>Login:</label>
									<input type="text" name="login" class="form-control" placeholder="your_login@our_app.com" required="required"/>
								</div>
								<div class="form-group">
									<label>Password:</label>
									<input type="password" name="pswd" class="form-control" placeholder="**********" required="required"/>
								</div>
								<div class="form-group">
									<input type="submit" name="submit" class="form-control btn btn-info" />
								</div>
							</form>
						</div>
					</div>
				</div>
			</div>
		</div>
		
		
	</body>
</html>
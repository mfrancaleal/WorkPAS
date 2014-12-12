<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>UNEBImage.com :: Login</title>
 
<link rel="stylesheet" type="text/css"
    href="./resources/bootstrap/css/bootstrap.min.css" />
 
<link rel="stylesheet" type="text/css"
    href="./resources/bootstrap/css/bootstrap-theme.min.css" />
 
<script src="./resources/bootstrap/js/bootstrap.min.js"></script>
 
</head>
<body>
    <jsp:include page="barra_superior_criar_conta.jspf" />
 
    <div class="container" style="padding-top: 80px;">
        <div class="row">
            <div class="container">
                <div class="col-md-8">
                    <h1>Você fez Logout. Volte logo!</h1>
                    <p>Conecte-se e saia compartilhando imagens por ai</p>
                    <br />
                    <% session.invalidate();%>
                </div>
            </div>
        </div>
    </div>
</body>
</html>
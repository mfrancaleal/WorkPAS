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
                    <h1>Faça seu login no UNEBImage.com!</h1>
                    <p>Conecte-se e saia compartilhando imagens por ai</p>
                    <br />
                    <form class="form-horizontal" method="post"
                        action="UsuarioController?action=login" role="form">
                        <div class="form-group">
                            <label for="email" class="col-sm-3 control-label">Email</label>
                            <div class="col-sm-5">
                                <input type="text" class="form-control" id="email" name="email"
                                    placeholder="Digite aqui seu email" />
                            </div>
                        </div>
                        <div class="form-group">
                            <label for="senha" class="col-sm-3 control-label">Senha</label>
                            <div class="col-sm-5">
                                <input type="password" class="form-control" id="senha" name="senha"
                                    placeholder="Digite aqui sua senha" />
                            </div>
                        </div>
                        <div class="form-group">
                            <div class="col-sm-offset-3 col-sm-10">
                                <button type="submit" class="btn btn-default">Logar</button>
                            </div>
                        </div>
 						   <div id="mensagem_cad_ok">
                            <% 
                            String mensagem_erro = (String) session.getAttribute("msgBranco"); 
                            if(mensagem_erro != null){ 
                            %>
                            	<h3>${param.mensagem_erro}</h3>
                            <%
                            session.invalidate();
                            } %>
                            </div>
                    </form>
                </div>
            </div>
        </div>
    </div>
</body>
</html>
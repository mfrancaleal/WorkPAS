<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>UNEBImage.com :: Upload</title>
 
<link rel="stylesheet" type="text/css"
    href="./resources/bootstrap/css/bootstrap.min.css" />
 
<link rel="stylesheet" type="text/css"
    href="./resources/bootstrap/css/bootstrap-theme.min.css" />
 
<script src="./resources/bootstrap/js/bootstrap.min.js"></script>
 
</head>
<body>
    <jsp:include page="barra_superior_upload.jspf" />
 
    <div class="container" style="padding-top: 80px;">
        <div class="row">
            <div class="container">
                <div class="col-md-8">
                    <h1>Suba suas fotos!</h1>
                    <p>Suba suas fotos e compartilhe por ai</p>
                    <br />
                    <form class="form-horizontal" method="post"
                        action="ImagemController?action=upload" role="form">
                        <div class="form-group">
                            <label for="image1" class="col-sm-3 control-label">Imagem 1</label>
                            <div class="col-sm-5">
                                <input type="file" class="form-control" id="imagem1" name="imagem1" />
                            </div>
                        </div>
                        <div class="form-group">
                            <label for="image1" class="col-sm-3 control-label">Imagem 2</label>
                            <div class="col-sm-5">
                                <input type="file" class="form-control" id="imagem2" name="imagem2" />
                            </div>
                        </div>
                        <div class="form-group">
                           <label for="image1" class="col-sm-3 control-label">Imagem 3</label>
                            <div class="col-sm-5">
                                <input type="file" class="form-control" id="imagem3" name="imagem3" />
                            </div>
                        </div>
                        <div class="form-group">
                            <div class="col-sm-offset-3 col-sm-10">
                                <button type="submit" class="btn btn-default">Enviar</button>
                            </div>
                        </div>
 
                    </form>
                </div>
            </div>
        </div>
    </div>
</body>
</html>
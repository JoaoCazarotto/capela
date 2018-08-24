<html>
    <head>
       <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css" integrity="sha384-Gn5384xqQ1aoWXA+058RXPxPg6fy4IWvTNh0E263XmFcJlSAwiGgFAW/dAiS6JXm" crossorigin="anonymous">
        <title>Formulario de grupos</title>
    </head>
    <body>
    <nav class="navbar navbar-expand-lg navbar-light bg-light" role="navigation">
        
        <a class="nav-link active" href="index.jsp">Home</a>
        <a  class="nav-link"href="adicionarEvento.jsp"> Adicionar Evento</a>
        <a class="nav-link" href="adicionarGrupo.jsp">Adicionar Grupo</a>
        <a class="nav-link" href="listarEventos.jsp">Mostrar Eventos</a>
        <a class="nav-link" href="listarGrupos.jsp">Mostrar Grupos</a>
    </nav>
        <table>
            <form class="form-group" action="banco_evento.php" method="post">
                <tr>
                    <td>Nome Grupo:</td>
                    <td><input type="text" name="nomeGrupo" class="form-control"></td>
                </tr>
                <tr>
                    <td>L&iacute;der:</td>
                    <td><input type="text" name="liderGrupo" class="form-control"></td>
                </tr>
                <tr>
                    <td>Grupo:</td>
                    <td><input type="text" name="grupo" class="form-control"></td>
                </tr>
                <tr>
                    <td>Descri&ccedil;&atilde;o:</td>
                    <td><textarea class="form-control"></textarea></td>
                </tr>
                 
                 <tr>
                    <td>Imagem Evento:</td>
                    <td><input class="form" type="file" name="fotoEvento"></td>
                </tr>
                <tr>
                    <td><input type="submit" class="btn btn-primary"></td>
                </tr>
            </form>
        </table>
</body>
</html>
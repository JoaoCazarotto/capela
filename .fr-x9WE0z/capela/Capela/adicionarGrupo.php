<?php include "cabecalho.php"?>
    
<table>
            <form action="banco_evento.php" method="post">
                <tr>
                    <td>Nome Grupo:</td>
                    <td><input type="text" name="nomeGrupo"></td>
                </tr>
                <tr>
                    <td>Lider:</td>
                    <td><input type="text" name="liderGrupo"></td>
                </tr>
                <tr>
                    <td>Grupo:</td>
                    <td><input type="text" name="grupo"></td>
                </tr>
                 <tr>
                    <td>Tipo de Usuario:</td>
                    <td>
                        <input type="radio" value="Administrador "name="tipoUsuario">Admnistrador<br> 
                        <input type="radio" value="Normal" name="tipoUsuario">Normal
                     </td>
                </tr>
                 <tr>
                    <td>Imagem Evento:</td>
                    <td><input type="file" name="fotoEvento"></td>
                </tr>
                <tr>
                    <td><input type="submit"></td>
                </tr>
            </form>
        </table>
<?php include "rodape.php"?>
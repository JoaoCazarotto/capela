<?php include "cabecalho.php"?>
    
        <table>
            <form action="banco_evento.php" method="post">
                <tr>
                    <td>Nome Evento:</td>
                    <td><input type="text" name="nomeEvento"></td>
                </tr>
                <tr>
                    <td>Endereço:</td>
                    <td><input type="text" name="enderecoEvento"></td>
                </tr>
                <tr>
                    <td>Grupo:</td>
                    <td><input type="text" name="grupo"></td>
                </tr>
                <tr>
                    <td>Data:</td>
                    <td><input type="date" name="dataEvento"></td>
                </tr>
                <tr>
                    <td>Hora:</td>
                    <td><input type="time" name="horaEvento"></td>
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
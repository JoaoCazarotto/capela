<?php include "cabecalho.php"
       include "conexao.php"?>
<?php 
    $nomeEvento=$_POST["nomeEvento"];
    $endercoEvento=$_POST["enderecoEvento"];
    $grupo=$_POST["grupo"];
    $data=$_POST["dataEvento"];
    $hora=$_POST["horaEvento"];
?>
<p>O evento <?php echo $nomeEvento?>, foi adicionado com sucesso!</p>
<?php include "rodape.php"?>
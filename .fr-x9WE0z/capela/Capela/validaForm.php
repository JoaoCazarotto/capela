<?php 
include "conexao.php";
$email = $_POST["usuario"];
$senha=$_POST["senha"];



function buscaUsuario($conexao,$email, $senha){
    $query="select id from login where login='{$email}' and senha='{$senha}'";
    $resultado =mysqli_query($conexao,$query);
    $usuario=mysqli_fetch_assoc($resultado);
    return $usuario;
} 

    

//include "conexao.php";
    $usuario = buscaUsuario($conexao,$email,$senha);
    if($usuario==null){
        include "login.php";
        ?>
        <p>Usuario ou senha errados</p>
<?php
        
    }
    else if($usuario == "0"){
        header("Location: indexAdmin.php ");
        
    }
    else{
        echo "ainda nao rolo";
        
    }
        
?>
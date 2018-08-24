<%@page contentType="text/html" pageEncoding="UTF-8"%>
<html 	xmlns="http://www.w3.org/1999/xhtml" 
    	xmlns:th="http://www.thymeleaf.org" 
    	xmlns:sec="http://www.thymeleaf.org/thymeleaf-extras-springsecurity3"
    	xmlns:layout="http://www.ultraq.net.nz/thymeleaf/layout">
    <head>
        <meta http-equiv="Content-Type" content="text/html" charset="utf-8">
        <meta http-equiv="X-UA-Compatible" content="IE=edge" />
        <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css" integrity="sha384-Gn5384xqQ1aoWXA+058RXPxPg6fy4IWvTNh0E263XmFcJlSAwiGgFAW/dAiS6JXm" crossorigin="anonymous">
        <title>Home</title>
    </head>
    <body>
   <nav class="navbar navbar-expand-lg navbar-light bg-light" role="navigation">
        <a class="nav-link active" href="index.jsp">Home</a>
        <a  class="nav-link"href="adicionarEvento.jsp"> Adicionar Evento</a>
        <a class="nav-link" href="adicionarGrupo.jsp">Adicionar Grupo</a>
        <a class="nav-link" href="listarEventos.jsp">Mostrar Eventos</a>
       <a class="nav-link" href="listarGrupos.jsp">Mostrar Grupos</a>
    </nav>
        
</body>
</html>
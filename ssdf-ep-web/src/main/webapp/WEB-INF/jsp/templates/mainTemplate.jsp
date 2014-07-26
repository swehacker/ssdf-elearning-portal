<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1" %>
<%@ taglib uri="http://tiles.apache.org/tags-tiles" prefix="tiles" %>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html lang="sv">
<head>
    <meta charset="ISO-8859-1">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <meta name="description" content="Svenska Sportdykarf�rbundets Utbildningsportal">
    <meta name="keywords"
          content="Dyka, dykning, sportdykning, fridykning, apnea, uv-rugby, undervattens sport, t�vling, utbildning, kurser, cmas, SSDF">
    <meta name="author" content="Patrik Falk">
    <title>SSDF's Utbildningsportal - <tiles:getAsString name="title"/></title>
    <link href="css/bootstrap.min.css" rel="stylesheet">
    <link rel="apple-touch-icon-precomposed" sizes="144x144" href="../assets/ico/apple-touch-icon-144-precomposed.png">
    <link rel="shortcut icon" href="../assets/ico/favicon.ico">
    <![endif]-->
</head>
<body>
<tiles:insertAttribute name="topnavigation"/>
<tiles:insertAttribute name="jumbotron"/>
<tiles:insertAttribute name="body"/>
<tiles:insertAttribute name="footer"/>
<!-- Bootstrap core JavaScript
================================================== -->
<!-- Placed at the end of the document so the pages load faster -->
<script src="https://ajax.googleapis.com/ajax/libs/jquery/1.11.0/jquery.min.js"></script>
<script src="../../dist/js/bootstrap.min.js"></script>
</body>
</html>
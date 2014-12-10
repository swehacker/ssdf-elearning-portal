<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1" %>
<%@ taglib uri="http://tiles.apache.org/tags-tiles" prefix="tiles" %>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html lang="sv">
<head>
    <meta charset="ISO-8859-1">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <meta name="description" content="Svenska Sportdykarförbundets Utbildningsportal">
    <meta name="keywords"
          content="Dyka, dykning, sportdykning, fridykning, apnea, uv-rugby, undervattens sport, tävling, utbildning, kurser, cmas, SSDF">
    <meta name="author" content="Patrik Falk">
    <title>SSDF's Utbildningsportal - <tiles:getAsString name="title"/></title>
    <link href="/css/bootstrap.min.css" rel="stylesheet">
    <link href="/css/ssdf.css" rel="stylesheet">
    <link rel="apple-touch-icon-precomposed" sizes="144x144" href="../assets/ico/apple-touch-icon-144-precomposed.png">
    <link rel="shortcut icon" href="../assets/ico/favicon.ico">
    <link rel="stylesheet" type="text/css" href="http://code.jquery.com/ui/1.10.2/themes/smoothness/jquery-ui.min.css"/>
    <script type="text/javascript" src="http://code.jquery.com/jquery-1.9.1.min.js"></script>
    <script type="text/javascript" src="http://code.jquery.com/ui/1.10.2/jquery-ui.min.js"></script>
</head>
<body>
<tiles:insertAttribute name="topnavigation"/>
<tiles:insertAttribute name="body"/>
<tiles:insertAttribute name="footer"/>
<!-- Bootstrap core JavaScript
================================================== -->
<!-- Placed at the end of the document so the pages load faster -->
<script src="https://ajax.googleapis.com/ajax/libs/jquery/1.11.0/jquery.min.js"></script>
<script src="/js/bootstrap.min.js"></script>
</body>
</html>
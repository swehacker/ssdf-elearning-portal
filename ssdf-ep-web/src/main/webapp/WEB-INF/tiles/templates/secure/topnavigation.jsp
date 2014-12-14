<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<c:url value="/j_spring_security_logout" var="logoutUrl" />
<form action="${logoutUrl}" method="POST" id="logoutForm">
    <input type="hidden" name="${_csrf.parameterName}" value="${_csrf.token}" />
</form>
<script>
    function formSubmit() {
        document.getElementById("logoutForm").submit();
    }
</script>

<div class="navbar navbar-default" role="navigation">
    <div class="container">
        <div class="navbar-header">
            <a href="/index" class="navbar-brand" style="padding-bottom: 0px !important; padding-top: 0px !important;"><img src="../images/delfin_2r_4f.png"></a>
        </div>
        <div style="float: right; height: 50px;">
            <a href="javascript:formSubmit()" class="btn btn-primary btn-sm" role="button" style="margin-top: 10px;" >Log out</a>
            <a href="/secure/welcome" class="btn btn-primary btn-sm" role="button" style="margin-top: 10px;" >Dina sidor</a>
        </div>
    </div>
    <div class="container">
        <!--nav class="collapse navbar-collapse bs-navbar-collapse" role="navigation"-->
        <nav role="navigation">
            <ul class="nav navbar-nav">
                <li>
                    <a href="/secure/order-certificate">Registrera certifikat</a>
                </li>
            </ul>
        </nav>
    </div>
</div>
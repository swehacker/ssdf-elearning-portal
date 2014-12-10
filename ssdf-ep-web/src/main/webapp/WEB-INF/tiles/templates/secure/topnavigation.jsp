<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1" %>
<div class="navbar navbar-default" role="navigation">
    <div class="container">
        <div class="navbar-header">
            <s:a action="index" namespace="/" cssClass="navbar-brand" cssStyle="padding-bottom: 0px !important; padding-top: 0px !important;"><img src="../images/delfin_2r_4f.png"></s:a>
        </div>
        <div style="float: right; height: 50px;">
            <s:a href="j_spring_security_logout" cssClass="btn btn-primary btn-sm" role="button" style="margin-top: 10px;" >Log out</s:a>
            <s:a action="welcome" namespace="/secure" cssClass="btn btn-primary btn-sm" role="button" style="margin-top: 10px;" >Dina sidor</s:a>
        </div>
    </div>
    <div class="container">
        <!--nav class="collapse navbar-collapse bs-navbar-collapse" role="navigation"-->
        <nav role="navigation">
            <ul class="nav navbar-nav">
                <li>
                    <s:a action="order-certificate">Registrera certifikat</s:a>
                </li>
            </ul>
        </nav>
    </div>
</div>
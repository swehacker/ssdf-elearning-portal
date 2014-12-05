<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1" %>
<%@ taglib prefix="s" uri="/struts-tags" %>
<div class="navbar navbar-default" role="navigation">
    <div class="container">
        <div class="navbar-header">
            <s:a action="index" namespace="/" cssClass="navbar-brand">Utbildningsportalen</s:a>
        </div>
        <nav class="collapse navbar-collapse bs-navbar-collapse" role="navigation">
            <ul class="nav navbar-nav">
                <li>
                    <s:a action="order-certificate">Registrera certifikat</s:a>
                </li>
            </ul>
            <div class="navbar-right" style="margin-left: 10px;">
                <s:a action="secure/welcome" cssClass="btn btn-primary btn-sm" role="button" style="margin-top: 10px;" >Dina sidor</s:a>
            </div>
            <div class="navbar-right">
                <form class="form-inline" action="/logout" method="post">
                    <input class="btn btn-primary btn-sm" style="margin-top: 10px;" role="button" type="submit" value="Logga ut" />
                    <input type="hidden" name="${_csrf.parameterName}" value="${_csrf.token}"/>
                </form>
            </div>
        </nav>
    </div>
</div>
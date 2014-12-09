<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1" %>
<%@ taglib prefix="s" uri="/struts-tags" %>
<div class="navbar navbar-default" role="navigation">
    <div class="container">
        <div class="navbar-header">
            <s:a action="index" cssClass="navbar-brand" cssStyle="padding-bottom: 0px !important; padding-top: 0px !important;"><img src="images/delfin.png" style="padding-right: 10px;">Utbildningsportalen</s:a>
        </div>
        <nav class="collapse navbar-collapse bs-navbar-collapse" role="navigation">
            <ul class="nav navbar-nav">
                <!--li>
                    <s:a action="order-certificate">Registrera certifikat</s:a>
                </li>
                <li>
                    <s:a action="learn-to-dive">B�rja dyka!</s:a>
                </li>
                <li>
                    <s:a action="continue-your-journey">Vidarutbilda dig</s:a>
                </li>
                <li>
                    <s:a action="become-instructor">Utbilda andra</s:a>
                </li>
                <li>
                    <s:a action="start-a-club">Starta klubb</s:a>
                </li-->
            </ul>
            <div class="navbar-right">
                <s:a action="secure/welcome" cssClass="btn btn-primary btn-sm" role="button" style="margin-top: 10px;" >Dina sidor</s:a>
            </div>
        </nav>
    </div>
</div>
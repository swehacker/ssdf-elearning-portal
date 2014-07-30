<%@ taglib prefix="s" uri="/struts-tags" %>
<div class="navbar navbar-default" role="navigation">
    <div class="container">
        <div class="navbar-header">
            <s:a action="index" cssClass="navbar-brand">Utbildningsportalen</s:a>
        </div>
        <nav class="collapse navbar-collapse bs-navbar-collapse" role="navigation">
            <ul class="nav navbar-nav">
                <li>
                    <s:a action="learn-to-dive">Börja dyka!</s:a>
                </li>
                <li>
                    <s:a action="continue-your-journey">Vidarutbilda dig</s:a>
                </li>
                <li>
                    <s:a action="become-instructor">Utbilda andra</s:a>
                </li>
                <li>
                    <s:a action="start-a-club">Starta klubb</s:a>
                </li>
            </ul>
            <!--s:form cssClass="navbar-form navbar-right" role="form" action="login">
                <div class="form-group">
                    <input type="text" placeholder="Email/Certificatsnummer" class="form-control">
                </div>
                <div class="form-group">
                    <input type="password" placeholder="Lösenord" class="form-control">
                </div>
                <button type="submit" class="btn btn-success">Login</button>
            <!--/s:form-->
            <div class="navbar-right">
                <s:a action="secure/welcome" cssClass="btn btn-primary btn-sm" role="button" >Dina sidor</s:a>
            </div>
        </nav>
    </div>
</div>
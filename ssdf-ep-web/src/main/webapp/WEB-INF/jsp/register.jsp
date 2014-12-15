<%@ taglib prefix="s" uri="/struts-tags" %>
<%@ taglib uri="http://www.springframework.org/tags" prefix="spring"%>
<div class="container">
    <div>
        <% String error = request.getParameter("error");
            if (error != null) {
        %>
        <div class="errorblock form-signin">
            Det gick inte att skapa konto, anv�ndarnamnet finns redan.
        </div>
        <%} %>

        <form class="form-signin" action="<s:url value='/register'/>" method='POST' role="form">
            <h2 class="form-signin-heading">Skapa nytt konto</h2>
            <input type="hidden" name="${_csrf.parameterName}" value="${_csrf.token}"/>
            <input class="form-control" type='text' name='username' placeholder="Anv�ndarnamn" required autofocus>
            <input class="form-control" type='password' name='password' placeholder="L�senord" />
            <button class="btn btn-lg btn-primary btn-block" type="submit">Skapa konto</button>
        </form>
    </div>
</div>
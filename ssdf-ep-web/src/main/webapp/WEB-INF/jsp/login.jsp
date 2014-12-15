<%@ taglib uri="http://www.springframework.org/tags" prefix="spring"%>
<div class="container">
    <div>
        <% String error = request.getParameter("error");
            if (error != null) {
        %>
        <div class="errorblock form-signin">
            Det gick inte att logga in p� sidan, anv�ndarnamnet eller l�senordet matchar ingen anv�ndare i systemet.
        </div>
        <%} %>

        <% String logout = request.getParameter("logout");
            if (logout != null) {
        %>
        <div class="errorblock form-signin">
            Du �r nu utloggad.
        </div>
        <%} %>

        <form class="form-signin" action="<spring:url value="/login"/>" method='POST' role="form">
            <h2 class="form-signin-heading">Inloggning</h2>
            <input type="hidden" name="${_csrf.parameterName}" value="${_csrf.token}"/>
            <input class="form-control" type='text' name='username' placeholder="Anv�ndarnamn" required autofocus>
            <input class="form-control" type='password' name='password' placeholder="L�senord" />
            <button class="btn btn-lg btn-primary btn-block" type="submit">Logga in</button>
            <button class="btn btn-lg btn-block" type="button" onclick="window.location='<spring:url value="/register"/>'">Registrera dig</button>
        </form>
    </div>
</div>
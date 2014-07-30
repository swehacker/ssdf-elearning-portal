<%@ taglib prefix="s" uri="/struts-tags" %>
<div class="container">
    <div>
        <% String error = request.getParameter("error");
            if (error != null) {
        %>
        <div class="errorblock form-signin">
            Det gick inte att logga in på sidan, användarnamnet eller lösenordet matchar ingen användare i systemet.
        </div>
        <%} %>

        <form class="form-signin" action="<s:url value='/j_spring_security_check'/>" method='POST' role="form">
            <h2 class="form-signin-heading">Inloggning</h2>
            <input class="form-control" type='text' name='j_username' placeholder="Användarnamn" required autofocus>
            <input class="form-control" type='password' name='j_password' placeholder="Lösenord" />
            <button class="btn btn-lg btn-primary btn-block" type="submit">Logga in</button>
        </form>
    </div>
</div>
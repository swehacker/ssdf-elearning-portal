<div class="container">
    Hej, välkommen till dom säkra sidorna

    <p>
        Hello <b><s:out value="${pageContext.request.remoteUser}"/></b>
    </p>
    <form class="form-inline" action="/logout" method="post">
        <input type="submit" value="Log out" />
        <input type="hidden" name="${_csrf.parameterName}" value="${_csrf.token}"/>
    </form>
</div>

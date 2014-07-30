<%@ taglib prefix="s" uri="/struts-tags" %>
<body onload='document.f.j_username.focus();'>
<h3>Login with Username and Password (Custom Page)</h3>
<% String error=request.getParameter("error");

    if(error!=null){
%>

<div class="errorblock">
    Your login attempt was not successful, try again.<br /> Caused :

</div>

<%} %>
<form name='f' action="<s:url value='/j_spring_security_check'/>" method='POST'>
    <table>
        <tr>
            <td>User:</td>
            <td><input type='text' name='j_username' value=''>
            </td>
        </tr>
        <tr>
            <td>Password:</td>
            <td><input type='password' name='j_password' />
            </td>
        </tr>
        <tr>
            <td colspan='2'><input name="submit" type="submit" value="submit" />
            </td>
        </tr>
        <tr>
            <td colspan='2'><input name="reset" type="reset" />
            </td>
        </tr>
    </table>
</form>

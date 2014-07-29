package se.ssdf.elearning.web.portal;

import com.opensymphony.xwork2.ActionSupport;
import org.apache.struts2.ServletActionContext;

import javax.servlet.http.HttpServletRequest;

public class LoginAction extends ActionSupport {
    private String userName;
    private String message;

    @Override
    public String execute() throws Exception {
        /*to get the authenticated username*/
        HttpServletRequest request = ServletActionContext.getRequest();
        this.setUserName(request.getUserPrincipal().getName());
        this.setMessage("Successful Struts spring secuirty authentication");
        return "SUCCESS";
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}

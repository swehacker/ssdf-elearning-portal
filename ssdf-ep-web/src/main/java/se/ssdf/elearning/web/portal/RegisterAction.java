package se.ssdf.elearning.web.portal;

import com.opensymphony.xwork2.ActionSupport;
import se.ssdf.elearning.utils.logging.LogMethodCall;

public class RegisterAction extends ActionSupport {
    private String username;
    private String password;

    @Override
    public String execute() throws Exception {
        return SUCCESS;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}

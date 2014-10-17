package se.ssdf.elearning.web.portal;

import com.opensymphony.xwork2.ActionSupport;
import se.ssdf.elearning.utils.logging.LogMethodCall;

public class LoginAction extends ActionSupport {
    @Override
    @LogMethodCall
    public String execute() throws Exception {
        return SUCCESS;
    }

}

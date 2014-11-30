package se.ssdf.elearning.web.portal;

import com.opensymphony.xwork2.ActionSupport;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import se.ssdf.elearning.services.CertificateService;
import se.ssdf.elearning.services.UserService;

import java.util.Random;

public class LearnToDiveAction extends ActionSupport {
    private long test = new Random().nextLong();

    @Autowired(required = true)
    @Qualifier(value = "UserService")
    private UserService userService;

    @Override
    public String execute() throws Exception {
        System.out.println(userService);
        userService.createAccount("patrik" + Long.toString(test), "test");
        return SUCCESS;
    }

    public long getTest() {
        return test;
    }
}

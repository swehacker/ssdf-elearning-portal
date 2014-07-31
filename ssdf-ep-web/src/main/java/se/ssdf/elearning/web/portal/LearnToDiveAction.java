package se.ssdf.elearning.web.portal;

import com.opensymphony.xwork2.ActionSupport;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import se.ssdf.elearning.services.CertificateService;

import java.util.Random;

public class LearnToDiveAction extends ActionSupport {
    private long test = new Random().nextLong();

    @Autowired(required = true)
    @Qualifier(value = "CertificateService")
    private CertificateService certificateService;

    @Override
    public String execute() throws Exception {
        System.out.println(certificateService);
        certificateService.order(null, null, null, null);
        return SUCCESS;
    }

    public long getTest() {
        return test;
    }
}

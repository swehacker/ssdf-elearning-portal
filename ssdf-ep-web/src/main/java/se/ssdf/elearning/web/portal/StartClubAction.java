package se.ssdf.elearning.web.portal;

import com.opensymphony.xwork2.ActionSupport;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import se.ssdf.elearning.services.CertificateService;

import java.util.Random;

public class StartClubAction extends ActionSupport {
    private long test = new Random().nextLong();



    @Override
    public String execute() throws Exception {
        //certificateService.order(null, null, null, null);
        

        return SUCCESS;
    }

    public long getTest() {
        return test;
    }
}

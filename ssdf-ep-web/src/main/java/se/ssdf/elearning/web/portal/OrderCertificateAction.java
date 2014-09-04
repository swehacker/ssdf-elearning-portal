package se.ssdf.elearning.web.portal;

import com.opensymphony.xwork2.ActionSupport;

import java.util.Random;

public class OrderCertificateAction extends ActionSupport {
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

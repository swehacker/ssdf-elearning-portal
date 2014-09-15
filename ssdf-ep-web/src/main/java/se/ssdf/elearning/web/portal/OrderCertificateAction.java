package se.ssdf.elearning.web.portal;

import com.opensymphony.xwork2.ActionSupport;
import org.apache.logging.log4j.Logger;
import se.ssdf.elearning.services.CertificateService;
import se.ssdf.elearning.utils.logging.Log4j;
import se.ssdf.elearning.utils.logging.LogMethodCall;

import javax.annotation.Resource;
import java.util.Random;

public class OrderCertificateAction extends ActionSupport {
    @Log4j
    private static Logger LOGGER;
    private long test = new Random().nextLong();

    @Resource
    private CertificateService certificateService;

    @Override
    @LogMethodCall
    public String execute() throws Exception {
        //certificateService.order(null, null, null, null);
        LOGGER.debug("SAY HELLO TO MY LITTLE FRIEND");

        return SUCCESS;
    }

    public long getTest() {
        return test;
    }
}

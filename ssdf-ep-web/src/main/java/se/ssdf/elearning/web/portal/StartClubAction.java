package se.ssdf.elearning.web.portal;

import com.opensymphony.xwork2.ActionSupport;

import java.util.Random;

public class StartClubAction extends ActionSupport {
    private long test = new Random().nextLong();

    @Override
    public String execute() throws Exception {
        return SUCCESS;
    }

    public long getTest() {
        return test;
    }
}

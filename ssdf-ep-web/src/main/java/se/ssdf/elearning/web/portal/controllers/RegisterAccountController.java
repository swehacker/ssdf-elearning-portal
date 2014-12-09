package se.ssdf.elearning.web.portal.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping(value = "/account")
public class RegisterAccountController {

    @RequestMapping(value = "/register")
    public String register() throws Exception {
        return "register";
    }
}

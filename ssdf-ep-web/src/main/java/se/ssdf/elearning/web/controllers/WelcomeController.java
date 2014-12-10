package se.ssdf.elearning.web.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping(value = "/secure")
public class WelcomeController {
    @RequestMapping(value = "/welcome")
    public String sayHello(Model model) {
        return "secure/welcome";
    }

    @RequestMapping(value = "/order-certificate")
    public String registerCertificates(Model model) {
        return "secure/order-certificate";
    }
}

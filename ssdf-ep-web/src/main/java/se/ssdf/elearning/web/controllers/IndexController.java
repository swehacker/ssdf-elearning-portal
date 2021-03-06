package se.ssdf.elearning.web.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class IndexController {
    @RequestMapping(value = {"/", "/index**" }, method = RequestMethod.GET)
    public ModelAndView index() {
        ModelAndView mv = new ModelAndView();
        mv.addObject("title", "Hello World");
        mv.setViewName("index");
        return mv;
    }
}

package com.infosys.carRentalSystem.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class LoginController {

    @GetMapping("/index")
    public ModelAndView showIndexPage() {
        return new ModelAndView("index"); // This will resolve to /WEB-INF/jsp/index.jsp
    }
}

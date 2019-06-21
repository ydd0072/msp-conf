package com.msp.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.time.LocalDate;

@Controller
public class HomeController {

    @RequestMapping(value = "/", method = RequestMethod.GET)
    public String getHome(ModelMap model) {
        model.addAttribute("dateTime", LocalDate.now().toString());
        model.addAttribute("location", "Minneapolis Muse Event Center");
        return "index";
    }
}

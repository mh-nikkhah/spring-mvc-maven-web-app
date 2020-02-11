package com.mh.controllers;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HomeController {

    @RequestMapping(value = "/menu", method = RequestMethod.GET)
    public ModelAndView test(HttpServletResponse response, HttpServletRequest request) {
        ModelAndView mv = new ModelAndView("data/menu");
        mv.addObject("messege", "Hello world");
        return mv;
    }

}

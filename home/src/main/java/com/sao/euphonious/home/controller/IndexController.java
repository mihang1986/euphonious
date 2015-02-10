package com.sao.euphonious.home.controller;

import org.apache.log4j.Logger;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Created by navia on 2015/2/4.
 */
@Controller
public class IndexController {
    private static Logger logger = Logger.getLogger(IndexController.class);

    /**
     * ModelAttribute注解将在每个RequestMapping之前被调用
     * @param abc
     * @param model
     */
/*    @ModelAttribute
    public void populateModel(HttpServletRequest req, HttpServletResponse rsp, Model model) {
       logger.debug("populateModel");
    }*/


    @RequestMapping(value = "/index", method = RequestMethod.GET)
    public String index(HttpServletRequest req, HttpServletResponse rsp, Model model){
       logger.debug("fdsa");
       //req.setAttribute("test", "caonima");
        model.addAttribute("test", "caonima");
       return "index";
    }
}

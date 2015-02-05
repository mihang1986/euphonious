package com.sao.euphonious.home.controller;

import org.apache.log4j.Logger;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Created by navia on 2015/2/4.
 */
@Controller
public class IndexController {
    private static Logger logger = Logger.getLogger(IndexController.class);


   @RequestMapping(value = "/index", method = RequestMethod.GET)
    public String index(HttpServletRequest req, HttpServletResponse rsp){

        logger.debug("fdsa");
       req.setAttribute("test", "caonima");
        return "index";
    }
}

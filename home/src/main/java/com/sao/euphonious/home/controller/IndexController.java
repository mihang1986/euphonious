package com.sao.euphonious.home.controller;

import com.sao.euphonious.home.bean.Student;
import org.apache.log4j.Logger;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

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

    /**
     * springMVC会自动将返回的Student对象转换成JSON
     * 需要加入jackson-core, jackson-databind, jackson-annotations这3个依赖到POM
     * @return
     */
    @RequestMapping(value = "/json2", method = RequestMethod.GET)
    @ResponseBody
    public Student getJson2() {
        Student s = new Student(1, "几把9", 990);
        return s;
    }
}

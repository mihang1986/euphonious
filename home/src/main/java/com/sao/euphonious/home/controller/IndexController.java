package com.sao.euphonious.home.controller;

import com.sao.euphonious.home.bean.Student;
import org.apache.log4j.Logger;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
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

    /**
     *  @ModelAttribute注释于方法或者参数,那么在调用该类对象的任何方法之前都将调用此方法
     *  并且将返回值存储到模型中相当于request.setAttribute(),其键取注解中的value
     *  如果没有指定value那么就是返回类型的驼峰写法,但是对于基础类型则无效
     *  这样在页面中如果写${jiba.name}将得到bada
     * @return
     */
    @ModelAttribute(value = "jiba")
    public Student mv1(){
        return new Student(1, "bada", 999);
    }

    @RequestMapping(value = "/index", method = RequestMethod.GET)
    public String index(HttpServletRequest req, HttpServletResponse rsp, ModelMap model){
        /*logger.debug("fdsa");
        req.setAttribute("test", "caonima");*/

        // 在这里可以同样可以取到mv1方法所返回的model
        System.out.println(model.get("jiba"));
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

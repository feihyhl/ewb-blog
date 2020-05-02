package com.ebw.controller;

import com.ebw.bean.ShowData;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import java.util.*;

@Controller
@RequestMapping("/hello")
public class HelloController {
    private Logger logger = LoggerFactory.getLogger(HelloController.class);

//    @GetMapping("/{id}")
//    public String hello(@PathVariable("id") String id) {
//        logger.info("hello index param:{}", id);
//        return "hello";
//    }

    @GetMapping("/index")
    public ModelAndView index() {
        Map<String, String> map = new HashMap<>();
        map.put("name", "index name");
        return new ModelAndView("index", map);
    }

    @GetMapping("/page")
    public ModelAndView page(Model model) {
        List<ShowData> list = new ArrayList<>();
        list.add(new ShowData(1, new Date(), "从入门到放弃"));
        list.add(new ShowData(2, new Date(), "从入门到删库"));
        list.add(new ShowData(3, new Date(), "从入门到忘记"));
        list.add(new ShowData(4, new Date(), "从删库到跑路"));
        model.addAttribute("cont", list);
        model.addAttribute("name", "page name");
        return new ModelAndView("page");
    }

    @GetMapping("/login")
    public ModelAndView login(Model model) {
        model.addAttribute("name", "login name");
        return new ModelAndView("login");
    }

    @GetMapping("/edit")
    public ModelAndView edit(Model model) {
        model.addAttribute("name", "edit name");
        return new ModelAndView("pageEditor");
    }

}

package ru.spring.controllers;

import java.util.Map;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import ru.spring.controllers.dao.service.HomeService;

@Controller
public class HomeController {
    
    @Resource
    private HomeService homeService;
    
    @RequestMapping({ "/", "/home" })
    public String showHomePage(Map<String, Object> model) {
        model.put("testData", homeService.generateData());
        return "home";
    }
}

package com.wangyao.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * Created by dell--pc on 2017/11/29.
 */
@Controller
public class indexController {

    @RequestMapping(path = {"/","/user"})
    public String index(){
        return "index";
    }
    @RequestMapping(path = {"/index/{name}"})
    public String index2(@PathVariable("name") String name){
        System.out.println(name);
        return "index";
    }
}

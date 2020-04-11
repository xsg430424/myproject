package com.sfc.es.rest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @des TODO
 * @date 2019/7/7 14:51
 * @auther xiaoshuigeng
 */
@Controller
@RequestMapping("/message")
public class IndexController {
    @RequestMapping(value = "/mybook")
    public String mybook() {
        return "mybook";
    }
}

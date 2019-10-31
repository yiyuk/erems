package com.zrq.controller;

import org.springframework.boot.web.servlet.error.ErrorController;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("error")
public class BaseErrorController implements ErrorController{

    @Override
    public String getErrorPath() {
        return "common/error";
    }

    @RequestMapping
    public String error() {
        return getErrorPath();
    }
}

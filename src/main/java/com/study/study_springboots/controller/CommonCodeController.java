package com.study.study_springboots.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.study.study_springboots.dao.CommonCodeDao;

// @Controller
// @RequestMapping(value = "/commonCode")
public class CommonCodeController {
    @Autowired
    CommonCodeDao commonCodeDao;

    @RequestMapping(value = "/list")
    public ModelAndView commonCode() {
        ModelAndView modelAndView = new ModelAndView();
        Object list = commonCodeDao.getList();
        modelAndView.addObject("list", list);
        modelAndView.setViewName("/commonCode/list");
        return modelAndView;
    }

}

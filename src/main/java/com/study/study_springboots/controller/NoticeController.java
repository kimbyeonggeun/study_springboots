package com.study.study_springboots.controller;

import java.util.ArrayList;
import java.util.HashMap;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.study.study_springboots.beans.BoardBean;
import com.study.study_springboots.service.DataInfors;

// @Controller
// @RequestMapping(value = "/notice")
public class NoticeController {

    // @RequestMapping(value = "/save", method = RequestMethod.POST)
    public ModelAndView save(@RequestParam HashMap<String, String> params) {
        ModelAndView modelAndView = new ModelAndView();
        DataInfors dataInfors = new DataInfors();
        BoardBean boardBean = dataInfors.addData(params);
        modelAndView.addObject("boardBean", boardBean);
        modelAndView.setViewName("/notice/view");
        return modelAndView;
    }

    // @RequestMapping(value = { "/", "list" })
    public ModelAndView list(ModelAndView modelAndView) {
        DataInfors dataInfors = new DataInfors();
        ArrayList<BoardBean> data = dataInfors.getDataListWithBoardBean();
        modelAndView.addObject("data", data);
        modelAndView.setViewName("/notice/list");
        return modelAndView;
    }

    // @RequestMapping(value = "/edit/{title}", method = RequestMethod.GET)
    public ModelAndView edit(@PathVariable String title, ModelAndView modelAndView) {
        DataInfors dataInfors = new DataInfors();
        BoardBean boardBean = dataInfors.getDataWithMemberBean(title);
        modelAndView.addObject("boardBean", boardBean);
        modelAndView.setViewName("/notice/edit");
        return modelAndView;
    }
}

package com.study.study_springboots.controller;

import java.util.ArrayList;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.study.study_springboots.beans.BoardBean;
import com.study.study_springboots.service.DataInfors;

// @Controller
// @RequestMapping(value = "/board")
public class BoardController {

    // @RequestMapping(value = "/form", method = RequestMethod.GET) // get형식으로
    // 들어올때
    public ModelAndView form(ModelAndView modelAndView) {

        return modelAndView;
    }

    // @RequestMapping(value = "/form", method = RequestMethod.POST) //
    // post형식으로 들어올때
    public ModelAndView formPost(ModelAndView modelAndView) {
        modelAndView.setViewName("board/form");
        return modelAndView;
    }

    // @RequestMapping(value = "/list")
    public ModelAndView list() {
        ModelAndView modelAndView = new ModelAndView();
        DataInfors dataInfors = new DataInfors();
        ArrayList<BoardBean> boardList = dataInfors.getDataListWithBoardBean();
        modelAndView.addObject("boardList", boardList);
        modelAndView.setViewName("board/list");
        return modelAndView;
    }

    // @RequestMapping(value = "/view")
    public ModelAndView view(ModelAndView modelAndView, @RequestParam String uid) {
        DataInfors dataInfors = new DataInfors();
        BoardBean boardBean = dataInfors.getDataWithMemberBean(uid);
        modelAndView.addObject("boardBean", boardBean);
        modelAndView.setViewName("board/view");
        return modelAndView;
    }

    // @RequestMapping(value = "/edit", method = RequestMethod.GET)
    public ModelAndView edit(ModelAndView modelAndView) {
        modelAndView.setViewName("board/edit");
        return modelAndView;
    }

    // @RequestMapping(value = "/edit", method = RequestMethod.POST)
    public ModelAndView editPost(ModelAndView modelAndView) {
        modelAndView.setViewName("board/edit");
        return modelAndView;
    }
}

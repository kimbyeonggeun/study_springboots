package com.study.study_springboots.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

// @Controller
// @RequestMapping(value = "/board")
public class BoardController {

    // @RequestMapping(value = "/form", method = RequestMethod.GET) // get형식으로
    // 들어올때
    public String form() {
        return "/WEB-INF/views/board/form.jsp";
    }

    // @RequestMapping(value = "/form", method = RequestMethod.POST) //
    // post형식으로 들어올때
    public String formPost() {
        return "/WEB-INF/views/board/list.jsp";
    }

    // @RequestMapping(value = { "/list", "/board" })
    public String list() {
        return "/WEB-INF/views/board/list.jsp";
    }

    // @RequestMapping(value = "/view")
    public String view() {
        return "/WEB-INF/views/board/view.jsp";
    }

    // @RequestMapping(value = "/edit", method = RequestMethod.GET)
    public String edit() {
        return "/WEB-INF/views/board/edit.jsp";
    }

    // @RequestMapping(value = "/edit", method = RequestMethod.POST)
    public String editPost() {
        return "/WEB-INF/views/board/list.jsp";
    }
}

package com.study.study_springboots.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller // 서블렛의 프론트로 인식하는것 처럼 됨
public class HomeController {
    @RequestMapping(value = "/homejsp") // @urlpattern과 같은 역할
    public String homejsp() {
        int i = 0;
        return "home";
    }

    @RequestMapping(value = "/homehtml") // @urlpattern과 같은 역할
    public String homehtml() {
        int i = 0;
        return "home";
    }

    @RequestMapping(value = "/home") // @urlpattern과 같은 역할
    public void home() {
        int i = 0;
    }

    @RequestMapping(value = { "", "/", "/main" }) // url이 3개중에 하나라도 만족되면 이 함수 실행
    public String main() {
        int i = 0;
        return "main";
    }
}

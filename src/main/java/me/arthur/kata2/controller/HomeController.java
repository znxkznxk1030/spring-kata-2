package me.arthur.kata2.controller;

import java.util.Date;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class HomeController {
  
  @GetMapping("/")
  public String index() {
    return "index.html";
  }

  @GetMapping("/api/now")
  public @ResponseBody String now() {
    return "현재 서버시간은" + new Date() + "입니다.";
  }
}

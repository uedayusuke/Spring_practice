package com.example.demo;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

// @(アノテーション)をつけることでコントローラーを宣言
@Controller
public class HelloController {

// "/hello"でURLを指定
	@RequestMapping(value = "/hello")
	private String hello() {
// "/index.html"に遷移
		return "/index.html";
	}
}

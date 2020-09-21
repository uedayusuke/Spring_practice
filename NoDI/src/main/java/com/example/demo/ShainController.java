package com.example.demo;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

// "@Controller"でcontrollerを宣言
@Controller
public class ShainController {

	// "@RequestMapping"でURLを指定(今回は"/input")
	@RequestMapping("/input")
	public String index() {
		// returnで上記のURLを指定されたら表示するページを指定
		return "index.html";
	}

	@RequestMapping("/output")
	public String result(@RequestParam("number") String number, Model model) {
		String name = "コントローラー太郎";
		model.addAttribute("number", number);
		model.addAttribute("name", name);
		return "output.html";
	}
}
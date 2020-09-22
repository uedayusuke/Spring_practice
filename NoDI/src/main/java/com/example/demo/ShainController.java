package com.example.demo;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

// "@Controller"でcontrollerを宣言
@Controller
public class ShainController {
	
	// ShainFormクラスを呼び出して、初期化して使うという指示
	// "@RequestMapping"よりも先に実行される
	@ModelAttribute
	public ShainForm setUpForm() {
		return new ShainForm();
	}

// "@RequestMapping"でURLを指定(今回は"/input")
	@RequestMapping("/input")
	public String index() {
// returnで上記のURLを指定されたら表示するページを指定
		return "index.html";
	}

	// ShainFormに従って、入力チェックを行う
	@RequestMapping("/output")
	public String result(@Validated ShainForm shainForm, BindingResult bindingResult, Model model) {
		// もし結果がエラーの場合、"index.html"に戻る
		if (bindingResult.hasErrors()) {
			return "index.html";
		}

		String number = shainForm.getNumber();
		String name = "コントローラー太郎";
		model.addAttribute("number", number);
		model.addAttribute("name", name);
		return "output.html";
	}
	

}
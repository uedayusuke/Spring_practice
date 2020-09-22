package com.example.demo;

import javax.validation.constraints.NotEmpty;

public class ShainForm {

	// "@NotEmpty"で空出ないかをチェックする。
	// →もし空だったらmessageを表示
	@NotEmpty(message = " 社員Noを入れてください")
	// index.htmlの"number(引数)"を定義
	private String number;

	// numberを取得する
	public String getNumber() {
		return number;
	}

	// numberを設置する
	public void setNumber(String number) {
		this.number = number;
	}

}
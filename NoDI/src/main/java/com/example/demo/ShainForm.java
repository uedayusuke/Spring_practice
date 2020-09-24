package com.example.demo;

import javax.validation.constraints.NotNull;

public class ShainForm {

	// "@NotEmpty"で空ではないかをチェックする。
	// →もし空だったらmessageを表示
	@NotNull(message = " 社員Noを入れてください")
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


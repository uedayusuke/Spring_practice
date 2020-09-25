package com.example.demo;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;

public class ShainForm {

	// "@NotEmpty"で空ではないかをチェックする。
	// →もし空だったらmessageを表示
	@NotNull(message = " 社員Noを入れてください")
	
	// 下記のアノテーションで半角数字3桁のvalidationを設定
	@Pattern(regexp = "\\d{3}", message = "半角数字、3ケタでお願いいたします。")
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


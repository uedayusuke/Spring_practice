package com.example.demo;

import javax.validation.constraints.NotEmpty;

public class ShainForm {

	@NotEmpty(message = " 社員Noを入れてください")
	private String number;

	public String getNumber() {
		return number;
	}

	public void setNumber(String number) {
		this.number = number;
	}

}
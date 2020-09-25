package com.example.demo;

public class ShainServiceImpl implements ShainService {

	@Override
	// findByNoメソッド
	public String findByNo(String number) {
	// リポジトリから社員を選択
	// ShainRepositoryを初期化して、名前を取ってくる
	ShainRepository shainRepository = new ShainRepositoryImpl();
	String name = shainRepository.selectByNo(number);
	return name;
	}


}

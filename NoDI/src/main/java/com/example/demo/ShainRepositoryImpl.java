package com.example.demo;

public class ShainRepositoryImpl implements ShainRepository {

	@Override
	// 今回はDBに接続していないが、DBに接続したつもりで
	// selectByNoメソッド
	// numberを引数として、case文で条件分岐
	// "100","101"以外の時はdefaultで出力
	public String selectByNo(String number) {
	String name;
	switch (number) {
	case "100":
	name = "佐藤"; break;
	case "101":
	name = "鈴木"; break;
	default:
	name = "登録されていません"; break;
	}
	return name;
	}


}

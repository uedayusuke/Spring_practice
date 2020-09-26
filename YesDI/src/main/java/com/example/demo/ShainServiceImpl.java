package com.example.demo;

import org.springframework.stereotype.Service;

// "@Service"でserviceを宣言し、Bean化
@Service
public class ShainServiceImpl implements ShainService {

	private final ShainRepository shainRepository;

	//ShainRepositoryをDI化
	public ShainServiceImpl(ShainRepository shainRepository) {
		this.shainRepository = shainRepository;
	}

	@Override
	public String findByNo(String number) {
		//リポジトリから社員を選択
		String name = shainRepository.selectByNo(number);
		return name;
	}

}
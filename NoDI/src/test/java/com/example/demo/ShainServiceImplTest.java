package com.example.demo;

import static org.hamcrest.MatcherAssert.*;
import static org.hamcrest.Matchers.*;
import static org.mockito.Mockito.when;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

// "@RunWith"でJUnitテストを行う宣言
@RunWith(SpringJUnit4ClassRunner.class)
public class ShainServiceImplTest {

	// "@MockBean"で見せかけのBeanを定義→"shainRepository"をMock化
	@MockBean
	private ShainRepository shainRepository;

	@Test
	public void findByNoTest() throws Exception {
		// shainRepositoryをモックにして、findByNoが機能するか？のテスト
		// shainRepositoryのselectByNoに"100"が入った時、"佐藤"が帰ってくるように定義
		// 9/27 テストエラー 原因追及中
		when(shainRepository.selectByNo("101")).thenReturn("鈴木");
		ShainService shainService = new ShainServiceImpl();
		String employee = shainService.findByNo("101");
		assertThat(employee, is("鈴木"));
	}

}
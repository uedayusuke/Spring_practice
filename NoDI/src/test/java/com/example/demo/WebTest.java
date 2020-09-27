package com.example.demo;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.*;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;

// "@RunWith","@SpringBootTest"を宣言して、SpringBoot機能を用いてjunitテストを行う
@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest
public class WebTest {

	// "MocMvc"でwebサーバーを起動しなくても、似たような挙動を起こさせる
	private MockMvc mockMvc;

	// "@Autowired"でテストする対象を決める
	@Autowired
	ShainController target;

	@Before
	public void setup() {
		mockMvc = MockMvcBuilders.standaloneSetup(target).build();
	}

	@Test
	public void isStatusTest() throws Exception {
		// /inputでアクセスして、statusがOKになるかのテスト
		mockMvc.perform(get("/input")).andExpect(status().isOk());
	}

}
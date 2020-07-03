package com.mega.living;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class testController {
	
	@Autowired
	testDAO dao;
	
	@RequestMapping("insert.do")
	public void insert(testDTO testDTO) {
		dao.insert(testDTO);
		System.out.println(testDTO + "controller");
	}
}

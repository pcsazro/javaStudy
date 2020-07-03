package com.mega.living;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class testDAO {
	
	@Autowired
	SqlSessionTemplate my;
	
	public void insert(testDTO dto) {
		my.insert("test.insert", dto);
		System.out.println(dto + "DAO");
	}
	
}

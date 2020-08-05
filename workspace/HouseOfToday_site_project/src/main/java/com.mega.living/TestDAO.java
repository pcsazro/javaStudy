package com.mega.living;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class TestDAO {
	
	@Autowired
	SqlSessionTemplate my;
	
	public void insert(TestDTO testDTO) {
		my.insert("test.test_insert", testDTO);
	}
	
}

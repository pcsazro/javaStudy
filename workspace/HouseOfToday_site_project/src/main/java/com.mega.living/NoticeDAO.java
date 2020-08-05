package com.mega.living;

import java.util.List;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class NoticeDAO {
	
	@Autowired
	SqlSessionTemplate my;
	
	public void notice_insert(NoticeDTO noticeDTO) {
		my.insert("notice.notice_insert", noticeDTO);
	}
	
	public List<NoticeDTO> notice_select_all() {
		List<NoticeDTO> notice_list = my.selectList("notice.notice_list_all");
		return notice_list;
	}
	
	public NoticeDTO select(NoticeDTO dto) {
		NoticeDTO dto2 = my.selectOne("notice.notice_one", dto);
		return dto2;
	}
	
	public void notice_update(NoticeDTO noticeDTO) {
		my.update("notice.notice_update", noticeDTO);
	}
	
	public void notice_delete(NoticeDTO noticeDTO) {
		my.delete("notice.notice_delete", noticeDTO);
	}
	
}

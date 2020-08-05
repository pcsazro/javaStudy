package com.mega.living;

import java.io.File;
import java.io.IOException;
import java.util.List;

import javax.annotation.Resource;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.multipart.MultipartHttpServletRequest;

@Controller
public class NoticeController {
	
	@Resource(name="uploadPath")
	public String uploadPath;
	
	@Autowired
	NoticeDAO dao;
	
	 @RequestMapping(value = "notice_insert")
	    public String notice_insert(NoticeDTO noticeDTO, MultipartHttpServletRequest mtfRequest) {
	        MultipartFile mf = mtfRequest.getFile("file");
	        

	        String path = uploadPath;

	        String originFileName = mf.getOriginalFilename(); // 원본 파일 명
	        long fileSize = mf.getSize(); // 파일 사이즈

//	        System.out.println("originFileName : " + originFileName);
//	        System.out.println("fileSize : " + fileSize);

	        String saveFile = path + originFileName;

	        try {
	            mf.transferTo(new File(saveFile));
	        } catch (IllegalStateException e) {
	            e.printStackTrace();
	        } catch (IOException e) {
	            e.printStackTrace();
	        }
	        
	        noticeDTO.setFileName(originFileName);
	       
	        System.out.println(noticeDTO);
	         
	        dao.notice_insert(noticeDTO);

	        String a = "notice_complete";
	        
	        return a;
	    }

	
		
	@RequestMapping("notice_list_all.do")
	public void notice_list(Model model) {
		List<NoticeDTO> notice_list = dao.notice_select_all();
		model.addAttribute("nlist", notice_list);
	}
	
	@RequestMapping("notice_one.do")
	public String notice_one(NoticeDTO noticeDTO, Model model, HttpSession session) {
		session.setAttribute("mid", "a");
//		session.getAttribute("mid");
		NoticeDTO dto = dao.select(noticeDTO);
		model.addAttribute("ndto", dto);
		String title = "notice_one";
		return title;
	}
	
	@RequestMapping("notice_one2.do")
	public String notice_one2(NoticeDTO noticeDTO, Model model, HttpSession session) {
		session.setAttribute("mid", "a");
//		session.getAttribute("mid");
		NoticeDTO dto = dao.select(noticeDTO);
		model.addAttribute("ndto", dto);
		String title = "notice_update";
		return title;
	}
	
	@RequestMapping("notice_update.do")	 public String notice_update(NoticeDTO noticeDTO, MultipartHttpServletRequest mtfRequest) {
        MultipartFile mf = mtfRequest.getFile("file");
        
        String path = uploadPath;

        String originFileName = mf.getOriginalFilename(); // 원본 파일 명
        long fileSize = mf.getSize(); // 파일 사이즈

//        System.out.println("originFileName : " + originFileName);
//        System.out.println("fileSize : " + fileSize);

        String saveFile = path + originFileName;
        

        try {
            mf.transferTo(new File(saveFile));
        } catch (IllegalStateException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        
        noticeDTO.setFileName(originFileName);
        
        System.out.println(noticeDTO);
        
        dao.notice_update(noticeDTO);

        String a = "notice_complete";
        
        return a;
    }	
	
	@RequestMapping("notice_delete.do")
	public String notice_delete(NoticeDTO noticeDTO) {
		
		dao.notice_delete(noticeDTO);
		System.out.println(noticeDTO);
		String a = "notice_complete";
		return a;
	}
	
}

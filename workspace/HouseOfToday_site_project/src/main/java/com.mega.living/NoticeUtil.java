package com.mega.living;

import java.io.File;

import org.springframework.util.FileCopyUtils;

public class NoticeUtil {

	static final int THUMB_WIDTH = 300;
	static final int THUMB_HEIGHT = 300;

	public static String fileUpload(String uploadPath, String fileName, byte[] fileData) throws Exception {

		String newFileName = fileName;
		String imgPath = uploadPath;

		File target = new File(imgPath, newFileName);
		FileCopyUtils.copy(fileData, target);
		
		return newFileName;
	}

}
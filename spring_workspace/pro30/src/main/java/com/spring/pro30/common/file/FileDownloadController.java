package com.spring.pro30.common.file;

import java.io.File;
import java.io.FileInputStream;
import java.io.OutputStream;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class FileDownloadController {
	private static final String ARTICLE_IMAGE_REPO = "D:\\board\\article_image";
	//저장된 파일이 있는 경로 설정
	
	@RequestMapping("/download.do")
	public void download(@RequestParam("imageFileName") String imageFileName,
			@RequestParam("articleNO")String articleNO,
			HttpServletResponse response)throws Exception{
		OutputStream out = response.getOutputStream();
		String downFile = ARTICLE_IMAGE_REPO+"\\"+articleNO+"\\"+imageFileName;
		File file = new File(downFile);
		
		response.setHeader("Cache-Control", "no-cache");
		response.addHeader("Content-disposition","attachment;fileName="+imageFileName);
		FileInputStream in = new FileInputStream(file);
		byte[] buffer = new byte[1024*8];
		while(true) {
			int count = in.read(buffer);
			if(count == -1) 
				break;
				out.write(buffer,0,count);
		}
		in.close();
		out.close();
	}
}

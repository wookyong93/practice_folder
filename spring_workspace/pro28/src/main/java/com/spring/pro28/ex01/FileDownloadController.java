package com.spring.pro28.ex01;

import java.io.File;
import java.io.FileInputStream;
import java.io.OutputStream;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

/*@Controller*/
public class FileDownloadController {
	private static String CURR_IMAGE_REPO_PATH = "D:\\image_repo";
	
	/* @RequestMapping("/download") */
	public void download(@RequestParam("imageFileName")String imageFileName, HttpServletRequest request,HttpServletResponse response) throws Exception{
		OutputStream out = response.getOutputStream();
		
		String downFile = CURR_IMAGE_REPO_PATH + "\\"+imageFileName;
		
		File file = new File(downFile);
		
		response.setHeader("Cache-Control", "no-chace");
		response.addHeader("Content-disposition", "attachment;fileName="+imageFileName);
		
		FileInputStream in = new FileInputStream(file);
		
		byte[] buffer = new byte[1024 * 8];
		
		while(true) {
			int count = in.read(buffer);
			//버퍼에 8kb 읽어 들어온다.
			
			if(count == -1) {
				//버퍼에 파일이름이 없을경우
				break;
			}
			out.write(buffer,0,count);
		}
		in.close();
		out.close();
		
	}

}

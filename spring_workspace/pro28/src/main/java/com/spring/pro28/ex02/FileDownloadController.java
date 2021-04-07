package com.spring.pro28.ex02;

import java.io.File;
import java.io.FileInputStream;
import java.io.OutputStream;

import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import net.coobird.thumbnailator.Thumbnailator;
import net.coobird.thumbnailator.Thumbnails;

@Controller
public class FileDownloadController {
	public static String CURR_IMAGE_REPO_PATH ="D:\\image_repo";
	
	/*
	 * @RequestMapping("/download") public void
	 * download(@RequestParam("imageFileName") String imageFileName,
	 * HttpServletResponse response)throws Exception{ OutputStream out =
	 * response.getOutputStream(); String filePath= CURR_IMAGE_REPO_PATH
	 * +"\\"+imageFileName; File image = new File(filePath); int lastIndex =
	 * imageFileName.lastIndexOf("."); //확장자를 제외시킨다. String fileName =
	 * imageFileName.substring(0,lastIndex); File thumbnail = new
	 * File(CURR_IMAGE_REPO_PATH + "\\thumbnail\\"+fileName+".png");
	 * if(image.exists()) { thumbnail.getParentFile().mkdirs();
	 * Thumbnails.of(image).size(50,50).outputFormat("png").toFile(thumbnail); }
	 * 
	 * FileInputStream in = new FileInputStream(thumbnail); byte[] buffer = new
	 * byte[1024*8]; while(true) { int count = in.read(buffer); //버퍼에 읽어들인 문자 갯수
	 * if(count == -1) { break; } out.write(buffer,0,count); } in.close();
	 * out.close(); }
	 */
	
	@RequestMapping("/download")
	protected void download(@RequestParam("imageFileName") String imageFileName,
			                 HttpServletResponse response) throws Exception {
		OutputStream out = response.getOutputStream();
		String filePath = CURR_IMAGE_REPO_PATH + "\\" + imageFileName;
		File image = new File(filePath);
		int lastIndex = imageFileName.lastIndexOf(".");
		String fileName = imageFileName.substring(0,lastIndex);
		File thumbnail = new File(CURR_IMAGE_REPO_PATH+"\\"+"thumbnail"+"\\"+fileName+".png");
		if (image.exists()) { 
			Thumbnails.of(image).size(50,50).outputFormat("png").toOutputStream(out);
		}else {
			return;
		}
		byte[] buffer = new byte[1024 * 8];
		out.write(buffer);
		out.close();
	}
}

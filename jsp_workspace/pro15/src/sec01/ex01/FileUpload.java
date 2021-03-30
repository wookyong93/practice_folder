package sec01.ex01;


import java.io.File;
import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.commons.fileupload.FileItem;
import org.apache.commons.fileupload.FileUploadException;
import org.apache.commons.fileupload.disk.DiskFileItemFactory;
import org.apache.commons.fileupload.servlet.ServletFileUpload;


@WebServlet("/upload.do")
public class FileUpload extends HttpServlet {
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		doHandle(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		doHandle(request, response);
	}
	private void doHandle(HttpServletRequest request,HttpServletResponse response) throws ServletException, IOException{
		request.setCharacterEncoding("UTF-8");
			String encoding = "UTF-8";
			File currentDirPath = new File("E:\\JAVA\\file_repo");
			DiskFileItemFactory factory = new DiskFileItemFactory();
			factory.setRepository(currentDirPath);
			factory.setSizeThreshold(1024 * 1024);
			
			ServletFileUpload upload = new ServletFileUpload(factory);
			try {
				List items = upload.parseRequest(request);
				for (int i = 0; i < items.size(); i++) {
					FileItem fileItem = (FileItem) items.get(i);
					//파일명이 리스트로 들어가있따.
	
					if (fileItem.isFormField()) {
						//한글파일명이있으면 UTF-8로 인코딩하란뜻
						System.out.println(fileItem.getFieldName() + "=" + fileItem.getString(encoding));
					} else {
						System.out.println("파라미터명:" + fileItem.getFieldName());
						//파일의 파라미터명 
						System.out.println("파일명:" + fileItem.getName());
						//파일명
						System.out.println("파일크기:" + fileItem.getSize() + "bytes");
						//파일크기
	
						if (fileItem.getSize() > 0) {
							//파일리스트에 파일이잇나 
							int idx = fileItem.getName().lastIndexOf("\\");
							// \\뒤에 파일 명을 넣는다. 
							if (idx == -1) {
								idx = fileItem.getName().lastIndexOf("/");
								//리눅스 같은경우 / 를 사용하므로 예외로 처리해준다.
							}
							String fileName = fileItem.getName().substring(idx + 1);
							File uploadFile = new File(currentDirPath + "\\" + fileName);
							fileItem.write(uploadFile);
						} // end if
					} // end if
				} // end for
				
			}catch(Exception e) {
				e.printStackTrace();
			}
	}
}

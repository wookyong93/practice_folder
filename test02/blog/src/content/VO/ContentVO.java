package content.VO;

import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.sql.Date;

import javax.security.auth.message.callback.PrivateKeyCallback.Request;
import javax.servlet.http.HttpServletRequest;


public class ContentVO {
	private int aritcleNO;
	private String title;
	private String content;
	private String imageFileName;
	private Date writeDate;
	private String id;
	public int getAritcleNO() {
		return aritcleNO;
	}
	public void setAritcleNO(int aritcleNO) {
		this.aritcleNO = aritcleNO;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getContent() {
		return content;
	}
	public void setContent(String content) {
		this.content = content;
	}
	public String getImageFileName() {
		return imageFileName;
	}
	public void setImageFileName(String imageFileName) {
		try {
			if(imageFileName!=null && imageFileName.length()!=0) {
				this.imageFileName = URLEncoder.encode(imageFileName, "UTF-8");  //파일이름에 특수문자가 있을 경우 인코딩합니다.
			}
		} catch (UnsupportedEncodingException e) {
			e.printStackTrace();
		}

	}
	public Date getWriteDate() {
		return writeDate;
	}
	public void setWriteDate(Date writeDate) {
		this.writeDate = writeDate;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	
	
}

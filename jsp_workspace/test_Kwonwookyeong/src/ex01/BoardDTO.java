package ex01;

import java.sql.Date;

public class BoardDTO {
	private int articleNO;
	private int parentNO;
	private String title;
	private String content;
	private String id;
	private String imageFileName;
	private Date writeDate;
	public int getArticleNO() {
		return articleNO;
	}
	public void setArticleNO(int aticleNO) {
		this.articleNO = aticleNO;
	}
	public int getParentNO() {
		return parentNO;
	}
	public void setParentNO(int parentNO) {
		this.parentNO = parentNO;
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
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getImageFileName() {
		return imageFileName;
	}
	public void setImageFileName(String imageFileName) {
		if(imageFileName==null) {
			this.imageFileName ="이미지없음";
		}else {
		this.imageFileName = imageFileName;
		}
		
	}
	public Date getWriteDate() {
		return writeDate;
	}
	public void setWriteDate(Date writeDate) {
		this.writeDate = writeDate;
	}
	
	
}

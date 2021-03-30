package sec02.ex01;

import java.sql.Date;

public class MemberDTO {
	//VO 와 DTO 둘다 데이터의 관련된 내용임
	//하지만 VO 보다는 DTO 라는 말을 많이 사용함.
	private String id;
	private String pwd;
	private String name;
	private String email;
	private Date JoinDate;
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getPwd() {
		return pwd;
	}
	public void setPwd(String pwd) {
		this.pwd = pwd;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public Date getJoinDate() {
		return JoinDate;
	}
	public void setJoinDate(Date joinDate) {
		JoinDate = joinDate;
	}
	
}

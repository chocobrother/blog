package com.cafe24.jblog.vo;

public class userVo {
	
	private Long no;
	
	private String id;
	
	private String name;
	
	private String passwd;

	public Long getNo() {
		return no;
	}

	public void setNo(Long no) {
		this.no = no;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPasswd() {
		return passwd;
	}

	public void setPasswd(String passwd) {
		this.passwd = passwd;
	}

	
	@Override
	public String toString() {
		return "회원정보 [번호=" + no + ", id=" + id + ", name=" + name + ", passwd=" + passwd + "]";
	}
	
}

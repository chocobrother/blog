package com.cafe24.jblog.vo;

public class blogVo {

	private String user_id;

	private String title;
	
	private String image;

	public String getUser_id() {
		return user_id;
	}

	public void setUser_id(String user_id) {
		this.user_id = user_id;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getImage() {
		return image;
	}

	public void setImage(String image) {
		this.image = image;
	}

	@Override
	public String toString() {
		return "블로그 정보 [회원 아이디=" + user_id + ", 제목=" + title + ", image=" + image + "]";
	}
	
	
	
}

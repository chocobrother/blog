package com.cafe24.jblog.vo;

public class categoryVo {

	private String group;
	
	private Long no;
	
	private String user_id;

	public String getGroup() {
		return group;
	}

	public void setGroup(String group) {
		this.group = group;
	}

	public Long getNo() {
		return no;
	}

	public void setNo(Long no) {
		this.no = no;
	}

	public String getUser_id() {
		return user_id;
	}

	public void setUser_id(String user_id) {
		this.user_id = user_id;
	}

	
	@Override
	public String toString() {
		return "카테고리 [분류=" + group + ", 번호=" + no + ", 작성자=" + user_id + "]";
	}
	
	
	
	
}

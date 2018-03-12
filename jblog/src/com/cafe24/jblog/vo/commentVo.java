package com.cafe24.jblog.vo;

public class commentVo {

	private Long no;
	private Long postn;
	private String content;
	public Long getNo() {
		return no;
	}
	public void setNo(Long no) {
		this.no = no;
	}
	public Long getPostn() {
		return postn;
	}
	public void setPostn(Long postn) {
		this.postn = postn;
	}
	public String getContent() {
		return content;
	}
	public void setContent(String content) {
		this.content = content;
	}
	
	@Override
	public String toString() {
		return "댓글 [번호=" + no + ", 글 번호=" + postn + ", 댓글 내용=" + content + "]";
	}
	
	
}

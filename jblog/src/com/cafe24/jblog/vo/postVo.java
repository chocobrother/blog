package com.cafe24.jblog.vo;

public class postVo {

		private String title;
		private Long postn;
		private String content;
		private String postdate;
		private String posttype;
		public String getTitle() {
			return title;
		}
		public void setTitle(String title) {
			this.title = title;
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
		public String getPostdate() {
			return postdate;
		}
		public void setPostdate(String postdate) {
			this.postdate = postdate;
		}
		public String getPosttype() {
			return posttype;
		}
		public void setPosttype(String posttype) {
			this.posttype = posttype;
		}
		@Override
		public String toString() {
			return "글 작성 기록 [제목=" + title + ", 번호=" + postn + ", 내용=" + content + ", 날짜=" + postdate
					+ ", 카테고리=" + posttype + "]";
		}
		
		
	
	}

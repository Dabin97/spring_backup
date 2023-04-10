package com.board.dto;

import org.apache.ibatis.type.Alias;

@Alias("qna")
public class QnADTO {
	private int qno;
	private String title;
	private String content;
	private String writer;
	private String wdate;
	private String response;
	private int status;
	
	public QnADTO() {	}
	

	public QnADTO(int qno, String title, String content, String writer) {
		this.qno = qno;
		this.title = title;
		this.content = content;
		this.writer = writer;
	}


	public int getQno() {
		return qno;
	}

	public void setQno(int qno) {
		this.qno = qno;
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

	public String getWriter() {
		return writer;
	}

	public void setWriter(String writer) {
		this.writer = writer;
	}

	public String getWdate() {
		return wdate;
	}

	public void setWdate(String wdate) {
		this.wdate = wdate;
	}

	public int getStatus() {
		return status;
	}

	public void setStatus(int status) {
		this.status = status;
	}

	public String getResponse() {
		return response;
	}

	public void setResponse(String response) {
		this.response = response;
	}

	@Override
	public String toString() {
		return "QnADTO [qno=" + qno + ", title=" + title + ", content=" + content + ", writer=" + writer + ", wdate="
				+ wdate + ", status=" + status + ", response=" + response + "]";
	}
	
	
	
}

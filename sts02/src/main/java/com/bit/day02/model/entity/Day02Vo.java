package com.bit.day02.model.entity;

import java.sql.Date;

public class Day02Vo {
	//상세할때 alt 로 using field 호출


	private int num;
	private String sub,name,content;
	private Date nalja;
	
	public Day02Vo() {
		// TODO Auto-generated constructor stub
	}
	
	public Day02Vo(int num, String sub, String name, String content, Date nalja) {
		super();
		this.num = num;
		this.sub = sub;
		this.name = name;
		this.content = content;
		this.nalja = nalja;
	}
	
	public int getNum() {
		return num;
	}
	public void setNum(int num) {
		this.num = num;
	}
	public String getSub() {
		return sub;
	}
	public void setSub(String sub) {
		this.sub = sub;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getContent() {
		return content;
	}
	public void setContent(String content) {
		this.content = content;
	}
	public Date getNalja() {
		return nalja;
	}
	public void setNalja(Date nalja) {
		this.nalja = nalja;
	}

	@Override
	public String toString() {
		return "Day02Vo [num=" + num + ", sub=" + sub + ", name=" + name + ", content=" + content + ", nalja=" + nalja
				+ "]";
	}
	
}

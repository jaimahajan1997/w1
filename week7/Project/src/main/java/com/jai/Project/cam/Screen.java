package com.jai.Project.cam;

public class Screen {
	private int len;
	private int bre;
	
	public Screen(int len, int bre) {
		this.setLen(len);
		this.setBre(bre);
	}

	public int getBre() {
		return bre;
	}

	public void setBre(int bre) {
		this.bre = bre;
	}

	public int getLen() {
		return len;
	}

	public void setLen(int len) {
		this.len = len;
	}
	
}

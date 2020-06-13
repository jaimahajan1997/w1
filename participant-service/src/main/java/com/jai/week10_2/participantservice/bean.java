package com.jai.week10_2.participantservice;

public class bean {
	private int pId;

	private String pName;

	private int meetingId;

	public bean(int pId, String pName, int meetingId) {
		super();
		this.pId = pId;
		this.pName = pName;
		this.meetingId = meetingId;
	}

	public int getpId() {
		return pId;
	}

	public void setpId(int pId) {
		this.pId = pId;
	}

	public String getpName() {
		return pName;
	}

	public void setpName(String pName) {
		this.pName = pName;
	}

	public int getMeetingId() {
		return meetingId;
	}

	public void setMeetingId(int meetingId) {
		this.meetingId = meetingId;
	}
}

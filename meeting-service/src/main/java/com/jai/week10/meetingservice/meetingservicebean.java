package com.jai.week10.meetingservice;

public class meetingservicebean {
	private String meetingId;

	private String topic;

	private String startTime;

	private String endTime;

	public meetingservicebean(String meetingId, String topic, String startTime, String endTime) {
		super();
		this.meetingId = meetingId;
		this.topic = topic;
		this.startTime = startTime;
		this.endTime = endTime;
	}

	public String getMeetingId() {
		return meetingId;
	}

	public void setMeetingId(String meetingId) {
		this.meetingId = meetingId;
	}

	public String getTopic() {
		return topic;
	}

	public void setTopic(String topic) {
		this.topic = topic;
	}

	public String getStartTime() {
		return startTime;
	}

	public void setStartTime(String startTime) {
		this.startTime = startTime;
	}

	public String getEndTime() {
		return endTime;
	}

	public void setEndTime(String endTime) {
		this.endTime = endTime;
	}

	public meetingservicebean() {

	}

}

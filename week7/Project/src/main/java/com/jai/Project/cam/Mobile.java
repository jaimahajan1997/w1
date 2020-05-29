package com.jai.Project.cam;

public class Mobile {
	
	private Speaker speaker;
	private Screen screen;
	private Camera camera;
	
	public Speaker getSpeaker() {
		return speaker;
	}
	
	public void setSpeaker(Speaker speaker) {
		this.speaker = speaker;
	}
	
	public Mobile(Speaker speaker, Screen screen, Camera camera) {
		this.speaker = speaker;
		this.setScreen(screen);
		this.setCamera(camera);
	}
	public Mobile() {
		//nnnn
	}

	public Screen getScreen() {
		return screen;
	}

	public void setScreen(Screen screen) {
		this.screen = screen;
	}

	public Camera getCamera() {
		return camera;
	}

	public void setCamera(Camera camera) {
		this.camera = camera;
	}
	
	
	

}

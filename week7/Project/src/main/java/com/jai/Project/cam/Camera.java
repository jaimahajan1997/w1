package com.jai.Project.cam;

public class Camera {
	private int noofmgpixels;

	
	public void setNo_of_pixels(int noofmgpixels) {
		this.noofmgpixels = noofmgpixels;
	}

	public Camera(int noofmgpixels) {
		this.noofmgpixels = noofmgpixels;
	}

	public int pix() {
		return noofmgpixels;
	}



}

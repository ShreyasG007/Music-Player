package com.tka.musicSystem;

public class MultimediaFile {
	private String title;
	private double duration;
	private double fileSize;
	public MultimediaFile() {
		// TODO Auto-generated constructor stub
	}
	public MultimediaFile(String title, double duration, double fileSize) {
		super();
		this.title = title;
		this.duration = duration;
		this.fileSize = fileSize;
	}
	
	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public double getDuration() {
		return duration;
	}

	public void setDuration(double duration) {
		this.duration = duration;
	}

	public double getFileSize() {
		return fileSize;
	}

	public void setFileSize(double fileSize) {
		this.fileSize = fileSize;
	}

	public void play() {
		System.out.println("Play from multimedia");
	}
}

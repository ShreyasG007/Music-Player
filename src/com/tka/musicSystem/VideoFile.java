package com.tka.musicSystem;

public class VideoFile extends MultimediaFile{
	
	public String resoluiton;
	public String subtitle;
	
	public VideoFile() {
		// TODO Auto-generated constructor stub
	}
	public String getResoluiton() {
		return resoluiton;
	}
	public void setResoluiton(String resoluiton) {
		this.resoluiton = resoluiton;
	}
	public String getSubtitle() {
		return subtitle;
	}
	public void setSubtitle(String subtitle) {
		this.subtitle = subtitle;
	}
	public VideoFile(String title, double duration, double fileSize, String resoluiton, String subtitle) {
		super(title, duration, fileSize);
		this.resoluiton = resoluiton;
		this.subtitle = subtitle;
	}
	
	@Override
	public void play() {
		System.out.println("Play from Video File");
		System.out.println("Title : "+getTitle());
		System.out.println("Duration : "+getDuration());
		System.out.println("FileSize : "+getFileSize());
		System.out.println("Resolution : "+resoluiton);
		System.out.println("Subtitle : "+subtitle);
	}
}

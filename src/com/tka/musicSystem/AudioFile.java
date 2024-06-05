package com.tka.musicSystem;

public class AudioFile extends MultimediaFile {
	public String artist;
	public String album;
	public AudioFile() {
		// TODO Auto-generated constructor stub
	}
	public String getArtist() {
		return artist;
	}
	public void setArtist(String artist) {
		this.artist = artist;
	}
	public String getAlbum() {
		return album;
	}
	public void setAlbum(String album) {
		this.album = album;
	}
	public AudioFile(String title, double duration, double fileSize, String artist, String album) {
		super(title, duration, fileSize);
		this.artist = artist;
		this.album = album;
	}

	@Override
	public void play() {
		System.out.println("Play from Audio File");
		System.out.println("Title : "+getTitle());
		System.out.println("Duration : "+getDuration());
		System.out.println("FileSize : "+getFileSize());
		System.out.println("Artist : "+artist);
		System.out.println("Album : "+album);
	}
}

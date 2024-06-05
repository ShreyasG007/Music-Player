package com.tka.musicSystem;

public class TestMultimediaFile {
	public static void main(String[] args) {

		AudioFile audioFile = new AudioFile("Believer", 5.20, 8.28, "Imagine dragon", "Single");
		audioFile.play();

		System.out.println();
		VideoFile videoFile = new VideoFile("Ve Kamleya", 6.00, 7.29, "1440p", "English");
		videoFile.play();

	}
}

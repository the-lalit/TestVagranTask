package task;

import java.util.ArrayList;
import java.util.Scanner;

public class PlayList3 {

	private String[] songs;
	public Scanner scr = new Scanner(System.in);
	private ArrayList<String> playList;
	private ArrayList<String> albumSongs;

	public PlayList3() {

		this.songs = new String[5];
		this.playList = new ArrayList<>();
		this.albumSongs = new ArrayList<>();

	}

	public String[] addSong() {
     
		for (int i = 0; i < songs.length; i++) {

			System.out.println("--Enter Song to add to album--");
			this.songs[i] = scr.nextLine();

			albumSongs.add(this.songs[i]);

		}
		return songs;

	}

	public void printAlbumSongs() {

		for (int i = 0; i < albumSongs.size(); i++) {

			System.out.println("Song number" + " " + (i + 1) + " is " + albumSongs.get(i));

		}
		if(albumSongs.isEmpty()) {
	    	   
	    	   System.out.println("You have not added any song yet\n"
	    	   		+ "in the Album");
	       }
	}

	public void songPlayList() {
		System.out.println("Enter the song you want to play :");
		String choosenSong = scr.nextLine();
		if (playList.size() <= 3 && albumSongs.contains(choosenSong) ) {
            playList.add(choosenSong);
			System.out.println(choosenSong +" is Playing");
	    }
		 else if(albumSongs.contains(choosenSong)) {
			 System.out.println("New Song added to playlist");
			playList.set(0, choosenSong);
		}else {
			System.out.println("Song is not present in the album");
		}
       
		
	}

	public void printPlayList() {

		for (int i = 0; i < playList.size(); i++) {

			System.out.println("Song number " + (i + 1) + " is " + "["+playList.get(i)+"]\n"
					+ " in your Playlist"
					);
		}
		if(playList.isEmpty()) {
	    	   
	    	   System.out.println("You have not added any song yet\n"
	    	   		+ "in the playList");
	       }

	}
	
	

}

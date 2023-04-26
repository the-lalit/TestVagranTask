package task;

import java.util.Scanner;

public class Main {

	private static PlayList3 player = new PlayList3();

	private static Scanner scr = new Scanner(System.in);

	public static void main(String[] args) {

		printInstructions();

		boolean flag = false;

		while (!flag) {
			int choice = 0;
			try {
				System.out.println("Enter your choice :");
				choice = scr.nextInt();
				scr.nextLine();
			} catch (Exception e) {
				System.out.println("Invalid input");

			}

			switch (choice) {

			case 0:
				flag = true;
				shutting();
				break;
			case 1:
				playSong();
				break;
			case 2:
				
				addSong();
				break;
			case 3:
				playSong();
				break;
			case 4:
				getAlbumList();
				break;
			case 5:
				getPlayList();
				break;
			default:
				printInstructions();
			}

		}

	}

	private static void starting() {
		System.out.println("Starting the Phone......");
	}

	private static void shutting() {
		System.out.println("Music Player switched Off");
	}

	public static void printInstructions() {

		System.out.println(" Available actions");
		System.out.println(" Press");
		System.out.println("\t0 - to turn off player");
		System.out.println("\t1 - to play the song");
		System.out.println("\t2 - to add songs to album");
		System.out.println("\t3 - to play a song of your choice");
		System.out.println("\t4 - to get Songs in the\n\t    " + "Album");
		System.out.println("\t5 - to get Songs in the\n\t    " + "PlayList");

	}

	public static void addSong() {

		System.out.println("You can add maximum 5 songs\n" + "in the album");

		player.addSong();

	}

	public static void getPlayList() {

		player.printPlayList();

	}

	public static void getAlbumList() {

		player.printAlbumSongs();
	}

	public static void playSong() {
		player.songPlayList();
	}

}

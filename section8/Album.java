package section8;

import java.util.ArrayList;
import java.util.LinkedList;
public class Album {
	
	private String name;
	private String artist;
	private ArrayList<Song> songs;
	
	public Album(String name, String artist) {
		this.name = name;
		this.artist = artist;
	    songs = new ArrayList<Song>();	
		
	
	}
		public  boolean addSong(String title, double duration) {
			for(Song s : songs){
			    if(s.getTitle().equals(title)){
			        return false;
			    }
			}Song song = new Song(title, duration);
			songs.add(song);
			return true;
		}
		
		private Song findSong(String title) {
				for(int i = 0; i < songs.size(); i++){
				    if(songs.get(i).getTitle().equals(title)){
				        return songs.get(i);
				    }
				}
				    return null;
		}
		
		public  boolean addToPlayList(int track, LinkedList<Song> playlist) {
		    Song song = null;
		    if(track > 0){
		        song = songs.get(track-1);
		        playlist.add(song);
		        return true;
		    }return false;
		}
		
		public boolean addToPlayList(String title, LinkedList<Song> playlist) {
			for(Song s : songs) {
				if(s.getTitle().equals(title)) {
					playlist.add(s);
					return true;
				}
			}return false;
		}
}     
    
  

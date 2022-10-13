package hust.soict.ictglobal.aims.Media;

import java.util.ArrayList;

public class CompactDisc extends Disc implements Playable,Comparable<Object>{

	public CompactDisc(String title, String category) {
		super(title, category);
		// TODO Auto-generated constructor stub
	}

	CompactDisc(String title) {
		super(title);
		// TODO Auto-generated constructor stub
	}
	
	public String getArtist() {
		return artist;
	}

	public void setArtist(String artist) {
		this.artist = artist;
	}

	private String artist;
	private int length;
	private ArrayList<Track> tracks = new ArrayList<Track>();
    public void addTrack(Track a) {
    	for(int i=0;i<this.tracks.size();i++) {
    		if(tracks.get(i)==a) System.out.println("this track is already in the list of tracks!");
    		else tracks.add(a);
    	}    	
    }
    
    public void removeTrack(Track a) {
    	for(int i=0;i<this.tracks.size();i++) {
    		if(tracks.get(i)==a) {
    			System.out.println("Removing Track is done");
    			tracks.remove(a);
    			return ;
    		}
    	}
    	System.out.println("Didn't find this track in the lists ");
    }
    
    public int getLength() {
    	 length=0;
    	for(int i=0;i<tracks.size();i++) {
    		length += tracks.get(i).getLength();
    	}
    	return length;
    }
    public void play() {
    	for (int i=0;i<this.tracks.size();i++) {
    		tracks.get(i).play();	
    	}
    }
    public int compareTo(Object obj) {
 		if (this.cost > ((Media) obj).getCost()) return 1;
 		else if (this.cost == ((Media) obj).getCost()) return 0;
 		else return -1;
 	}
}

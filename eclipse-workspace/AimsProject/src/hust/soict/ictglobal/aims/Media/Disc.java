package hust.soict.ictglobal.aims.Media;

public class Disc extends Media {
	Disc(String title) {
		super(title);
		// TODO Auto-generated constructor stub
	}
	Disc(String title, String category){
		super(title,category);
	}
	private int length;
	private String director;
	public int getLength() {
		return length;
	}
	public void setLength(int length) {
		this.length = length;
	}
	public String getDirector() {
		return director;
	}
	public void setDirector(String director) {
		this.director = director;
	}
	
}

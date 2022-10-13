package hust.soict.ictglobal.aims.Media;

public class DigitalVideoDisc extends Disc implements Playable,Comparable<Object> {
	private String director;
	private int length;	
	/*public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getCategory() {
		return category;
	}
	public void setCategory(String category) {
		this.category = category;
	}*/
	public String getDirector() {
		return director;
	}
	public void setDirector(String director) {
		this.director = director;
	}
	public int getLength() {
		return length;
	}
	public void setLength(int length) {
		this.length = length;
	}
	/*public float getCost() {
		return cost;
	}
	public void setCost(float cost) {
		this.cost = cost;
	}*/
	public DigitalVideoDisc(String title) {
		super(title);		
	}
	public DigitalVideoDisc(String title, String category) {
		super(title, category);		
	}
	public DigitalVideoDisc(String title, String category, String director) {		
		super(title, category);
		this.director = director;
	}
	public DigitalVideoDisc(String title, String category, String director, int length, float cost) {
		super(title,category);		
		this.director = director;
		this.length = length;
		this.cost = cost;
	}
	public boolean search(String title) {

		String[] titleAfterSplit = title.trim().split("\\s+");
		for (String a : titleAfterSplit) 
			if (this.title.contains(a) == false ) return false;
		return true;
	}
	public void play() { 
		 System.out.println("Playing DVD: " + this.getTitle()); 
		 System.out.println("DVD length: " + this.getLength()); 
		}
	   public int compareTo(Object obj) {
			if (this.cost > ((Media) obj).getCost()) return 1;
			else if (this.cost == ((Media) obj).getCost()) return 0;
			else return -1;
		}
	 }

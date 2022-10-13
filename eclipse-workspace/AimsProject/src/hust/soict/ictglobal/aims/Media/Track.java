package hust.soict.ictglobal.aims.Media;

public class Track extends Media implements Playable,Comparable<Object> {
	Track(String title) {
		super(title);
		// TODO Auto-generated constructor stub
	}
	
	public Track(String title, String category) {
		super(title, category);
		// TODO Auto-generated constructor stub
	}

	private String title;
	private int length;
	
	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public int getLength() {
		return length;
	}

	public void setLength(int length) {
		this.length = length;
	}
	public void play() { 
		 System.out.println("Playing : " + this.getTitle()); 
		 System.out.println("Length: " + this.getLength()); 
		}

	   public int compareTo(Object obj) {
			if (this.cost > ((Media) obj).getCost()) return 1;
			else if (this.cost == ((Media) obj).getCost()) return 0;
			else return -1;
		}
}

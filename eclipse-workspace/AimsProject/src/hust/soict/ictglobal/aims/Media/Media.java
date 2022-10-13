package hust.soict.ictglobal.aims.Media;

public abstract class Media {
	public String title;
	public String category;
	public float cost;
	
	Media(String title){ 
		 this.title = title; 
		 } 
    Media(String title, String category){ 
		 this(title); 
		 this.category = category; 
    }
		
	public String getTitle() {
		   return this.title;
	}
	   
    public void setTitle(String title) {
		   this.title = title;
	}
	   
	public String getCategory() {
		   return this.category;
	}
	   
	public void setCategory(String category) {
		   this.category = category;
	}
	   
	public float getCost() {
		   return this.cost;
	}
	  
	public void setCost(float cost) {
		   this.cost = cost;
	}
}

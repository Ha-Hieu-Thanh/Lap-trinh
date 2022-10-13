package hust.soict.ictglobal.aims.Media;

import java.util.ArrayList;
import java.util.List;

public class Book extends Media implements Comparable<Object> {
   private List<String> authors = new ArrayList<String>();
   
   Book(String title){ 
	   super(title); 
   } 
   Book(String title, String category){ 
	   super(title, category); 
	   //… 
   } 
   Book(String title, String category, List<String> authors){ 
	   super(title, category); 
	   this.authors = authors; 
   }      
      
   public List<String> getAuthors(){
	   return this.authors;
   }
   
   public void setAuthors(List<String> authors) {
	   this.authors = authors;
   }
   
   public void removeAuthor(String author) {
	   int m=0;
	   int i;
	   for(i=0;i<this.authors.size();i++) {
		   if(authors.get(i).equals(author)) {
			   m=1;
			   break;
		   }
	   }
	   if(m==1) this.authors.remove(i);
	   else System.out.println("Khong tim thay ");     
   }

   public void addAuthor(String author) {
	   int m=0;
	   int i;
	   for(i=0;i<this.authors.size();i++) {
		   if(authors.get(i).equals(author)) {
			   m=1;
			   break;
		   }
	   }
	   if(m==0) this.authors.add(author);
	   else System.out.println("Da co trong danh sach");
   }
   public int compareTo(Object obj) {
		if (this.cost > ((Media) obj).getCost()) return 1;
		else if (this.cost == ((Media) obj).getCost()) return 0;
		else return -1;
	}
}
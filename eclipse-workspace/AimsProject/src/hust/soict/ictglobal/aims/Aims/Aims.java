package hust.soict.ictglobal.aims.Aims;
import hust.soict.ictglobal.aims.Media.Book;
import hust.soict.ictglobal.aims.Media.DigitalVideoDisc;
import hust.soict.ictglobal.aims.Media.MemoryDaemon;
import hust.soict.ictglobal.aims.order.Order.Order;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
public class Aims {
	public static void showMenu() { 
		 System.out.println("Order Management Application: "); 
		 System.out.println("--------------------------------"); 
		 System.out.println("1. Create new order"); 
		 System.out.println("2. Add item to the order"); 
		 System.out.println("3. Delete item by id"); 
		 System.out.println("4. Display the items list of order"); 
		 System.out.println("0. Exit"); 
		 System.out.println("--------------------------------"); 
		 System.out.println("Please choose a number: 0-1-2-3-4"); 
		}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Order anOrder = new Order("15-12-2022");
		// Creat a new dvd object and set the fields
		DigitalVideoDisc dvd1 = new DigitalVideoDisc("The Lion King");
		dvd1.setCategory("Animation");
		dvd1.setCost(19.95f);
		dvd1.setDirector("Roger Alleres");
		dvd1.setLength(87);
		// add the dvd to the order
		anOrder.addDisc(dvd1);
		System.out.println(dvd1.search("King  The Lion"));
		DigitalVideoDisc dvd2 = new DigitalVideoDisc("Star Wars");
		dvd2.setCategory("Science Fiction");
		dvd2.setCost(24.95f);
		dvd2.setDirector("George Lucas");
		dvd2.setLength(124);
		anOrder.addDisc(dvd2);
		
		DigitalVideoDisc dvd3 = new DigitalVideoDisc("Aladdin");
		dvd3.setCategory("Animation");
		dvd3.setCost(18.99f);
		dvd3.setDirector("John Musker");
		dvd3.setLength(90);
		anOrder.addDisc(dvd3);
		
		System.out.print("Total Cost is: ");
		System.out.println(anOrder.totalCost());
		
		anOrder.showList();
		
	//	MemoryDaemon  memory = new MemoryDaemon();
		List<DigitalVideoDisc> discs = new ArrayList<DigitalVideoDisc>();
		discs.add(dvd2);
		discs.add(dvd1);
		discs.add(dvd3);
		
		java.util.Iterator<DigitalVideoDisc> iterator = discs.iterator();
		System.out.println("---------------------------------");
		System.out.println("The DVDs currently in the order are: ");
		
		while (iterator.hasNext()) {
			System.out.println
			(((DigitalVideoDisc)iterator.next()).getTitle());
		}
		
		discs.sort(null);
		
		iterator = discs.iterator();
		System.out.println("---------------------------------");
		System.out.println("The DVDs in sorted order are: ");
		
		while (iterator.hasNext()) {
			System.out.println
			(((DigitalVideoDisc)iterator.next()).getTitle());
		}
		
		System.out.println("---------------------------------");
		
    }
}	

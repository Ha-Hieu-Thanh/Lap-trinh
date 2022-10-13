package hust.soict.ictglobal.aims.order.Order;
import hust.soict.ictglobal.aims.Media.Disc;
import hust.soict.ictglobal.aims.Media.Media;

import java.util.ArrayList;
public class Order {
	public static final int MAX_NUMBERS_ORDERED=10;
	public static final int MAX_LIMITTED_ORDERS = 5;
	private static int nbOrders = 0;
	private String dateOrdered;
	private int id;
	private ArrayList<Media> itemsOrdered = new ArrayList<Media>();
	public String getDateOrdered() {
		return dateOrdered;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getId() {
		return this.id;
	}
	public void setDateOrdered(String dateOrdered) {
		this.dateOrdered = dateOrdered;
	}
	
	public Order() {
		if (nbOrders < MAX_LIMITTED_ORDERS)
	nbOrders++;
		else System.out.println("The number of Orders > MAX LIMITTED ORDERS");
	}
	public Order(String date) {
		super();
		setDateOrdered(date);
	}
	public void addDisc(Disc disc) {
		if (this.itemsOrdered.size()<MAX_NUMBERS_ORDERED) {
			this.itemsOrdered.add(disc);			
			System.out.println("The disc has been added");
		}
		else System.out.println("The order is almost full");
	}
	public void removeDisc(Disc disc) {
		if (this.itemsOrdered.size()!=0) {
			for (int i=0;i<this.itemsOrdered.size();i++) {
				if (this.itemsOrdered.get(i) == disc) {
					this.itemsOrdered.remove(i);
				}
			}		
		System.out.println("The disc has been removed");
		}
		else System.out.println("Can't do");
	}
	public float totalCost() {
		float cost=0;
		for (int i=0;i<this.itemsOrdered.size();i++) {
			cost += this.itemsOrdered.get(i).getCost();
		}
		return cost;
	}
	
	public void showList() {
		System.out.println("*********************Order************************");
		System.out.println("Date: "+this.dateOrdered);
		System.out.println("Ordered Items:");
		for (int i=0;i < this.itemsOrdered.size();i++)
		System.out.println((i+1)+". "+"DVD - "+ this.itemsOrdered.get(i).getTitle() +"-"+ this.itemsOrdered.get(i).getCategory()
				+ "-"+ this.itemsOrdered.get(i).getCost() +" $");
		System.out.println("Total cost: " + this.totalCost());
		System.out.println("**************************************************");
	}
	/*public void getALuckyItem() {
		DigitalVideoDisc luckydisk = new DigitalVideoDisc("The Lucky Item","Lucky","Lucky",120,0);
		if (Math.random()>=0.5) addDigitalVideoDisc(luckydisk);

	}*/
}

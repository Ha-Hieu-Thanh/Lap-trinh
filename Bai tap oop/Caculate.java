import java.util.Scanner;

public class Caculate {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Nhap so thu nhat: ");
		double a = sc.nextDouble();
		System.out.println("Nhap so thu hai: ");
		double b = sc.nextDouble();
		System.out.println("Sum =  " + (a + b));
		System.out.println("Differencr = " + (a - b));
		System.out.println("Product = " + (a * b));
		if (b == 0)
			System.out.println("Khong the thuc hien phep chia");
		else
			System.out.println("Quotient = " + (a / b));
	}
}
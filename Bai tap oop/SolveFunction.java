import java.util.*;
import java.lang.Math;

public class SolveFunction {
    public void first_degree(double a, double b) {
        if (a == 0 && b == 0) {
            System.out.println("Phuong trinh co vo so nghiem");
        }
        if (a == 0 && b != 0) {
            System.out.println("Phuong trinh vo nghiem");
        }
        if (a != 0) {
            System.out.println("x_0 = " + (-b / a));
        }
    }

    public void system_of_first_degree(double a11, double a12, double a21, double a22, double b1, double b2) {
        double d = a11 * a22 - a21 * a12;
        double d1 = b1 * a22 - b2 * a12;
        double d2 = a11 * b2 - a21 * b1;
        if (d == 0) {
            if (d1 == 0 && d2 == 0) {
                System.out.println("He phuong trinh vo so nghiem");
            } else {
                System.out.println("He phuong trinh vo nghiem");
            }
        } else {
            System.out.println("x1 = " + d1 / d);
            System.out.println("x2 = " + d2 / d);
        }
    }

    public void second_degree(double a, double b, double c) {
        if (a == 0) {
            first_degree(b, c);
        } else {
            double delta = b * b - 4 * a * c;
            if (delta == 0) {
                System.out.println("x = " + (-b / (2 * a)));
            }
            if (delta < 0) {
                System.out.println("Phuong trinh vo nghiem");
            }
            if (delta > 0) {
                double value = Math.sqrt(delta);
                System.out.println("x1 = " + (-b + value) / (2 * a));
                System.out.println("x2 = " + (-b - value) / (2 * a));
            }
        }
    }

    public static void main(String[] args) {
        SolveFunction _solve = new SolveFunction();
        System.out.println("Example 1: ax + b = 0");
        Scanner sc = new Scanner(System.in);
        System.out.print("a = ");
        double a = sc.nextFloat();
        System.out.print("b = ");
        double b = sc.nextFloat();
        _solve.first_degree(a, b);
        System.out.println("A system of first-degree equations, two variables x1 and x2");
        System.out.print("a11 = ");
        double a11 = sc.nextDouble();
        System.out.print("a12 = ");
        double a12 = sc.nextDouble();
        System.out.print("a21 = ");
        double a21 = sc.nextDouble();
        System.out.print("a22 = ");
        double a22 = sc.nextDouble();
        System.out.print("b1 = ");
        double b1 = sc.nextDouble();
        System.out.print("b2 = ");
        double b2 = sc.nextDouble();
        _solve.system_of_first_degree(a11, a12, a21, a22, b1, b2);
        System.out.println("A second-degree equation ax^2 + bx + c = 0");
        System.out.print("a = ");
        double f1 = sc.nextDouble();
        System.out.print("b = ");
        double f2 = sc.nextDouble();
        System.out.print("c = ");
        double f3 = sc.nextDouble();
        _solve.second_degree(f1, f2, f3);
    }
}
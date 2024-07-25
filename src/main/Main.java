package main;

import java.util.Locale;
import java.util.Scanner;

import model.entities.AbstractShape;
import model.entities.Circle;
import model.entities.Rectangle;
import model.enums.Colors;

public class Main {

	public static void main(String[] args) {

//		Locale.setDefault(Locale.US);
//		Scanner sc = new Scanner(System.in);
		
		AbstractShape s1 = new Circle(Colors.BLACK, 2.0);
		AbstractShape s2 = new Rectangle(Colors.WHITE, 3.0, 4.0);
		
		System.out.println("Circle color: " + s1.getColor());
		System.out.println("Circle area: " + String.format("%.3f", s1.getArea()));
		System.out.println("Rectangle color: " + s2.getColor());
		System.out.println("Rectangle area: " + String.format("%.3f", s2.getArea()));
	}

}

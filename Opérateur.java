package functions;
import java.util.Scanner;

public class Opérateur {
	public static void addition (int x, int y, int t){
		if (y < 0){
			System.out.println(+ x + " + (" + y + ")");
			t = x + y;
		}
		else {
			System.out.println(+ x + "+" +y);
			t = x + y;
		}
		System.out.println(t);
		NouveauCalcul(x, y, t);
	}
	public static void soustraction (int x, int y, int t){
		if (y < 0){
			System.out.println(+ x + " - (" + y + ")");
		}
		else {
			System.out.println(+ x + "-" +y);
		}
		System.out.println(x - y);
		NouveauCalcul(x, y, t);
	}
	public static void multiplication (int x, int y, int t){
		if (y < 0){
			System.out.println(+ x + " * (" + y + ")");
		}
		else{
			System.out.println(+ x + "*" +y);
		}
		System.out.println(x * y);
		NouveauCalcul(x, y, t);
	}
	public static void division (int x, int y, int t){
		if (y < 0){
			System.out.println(+ x + " / (" + y + ")");
			t = x / y;
		}
		if (y == 0){
			System.out.println("Il est impossible de divisé par 0");
		}
		else {
			System.out.println(+ x + "/" +y);
			t = x / y;
		}
		System.out.println(t);
		NouveauCalcul(x, y, t);
	}
	@SuppressWarnings("resource")
	public static void NouveauCalcul (int x, int y, int t){
		int g;
		Scanner scan = new Scanner (System.in);
		g = scan.nextInt();
		x = t;
		y = g;
		t = 0;
		division(x, y, t);
	}
	@SuppressWarnings("resource")
	public static void main(String[] args){
		int a, b, c;
		Scanner sc = new Scanner (System.in);
		a = sc.nextInt();
		b = sc.nextInt();
		c = 0;
		addition(a , b, c);
	}
	
}

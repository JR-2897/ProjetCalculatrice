
public class Opérateur {
	public static int addition (int x, int y){
		System.out.println(x + y);
		return x + y;
	}
	public static int soustraction (int x, int y){
		System.out.println(x - y);
		return x - y;
	}
	public static int multiplication (int x, int y){
		System.out.println(x * y);
		return x * y;
	}
	public static int division (int x, int y){
		if (y == 0){
			System.out.println("Il est impossible de divisÃ© par 0");
			return 0;
		}
		else {
			System.out.println(x / y);
			return x/y;
		}
	}
	public static int modulo (int x, int y){
		return x%y;
	}
}

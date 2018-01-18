public class Opérateur {
	public static int addition (int x, int y){
		System.out.println(x + y);
	}
	public static int soustraction (int x, int y){
		System.out.println(x - y);
	}
	public static void multiplication (int x, int y){
		System.out.println(x * y);
	}
	public static void division (int x, int y){
		if (y == 0){
			System.out.println("Il est impossible de divisé par 0");
		}
		else {
			System.out.println(x / y);
		}
	}
}

public class Opérateur {
	public static int addition (int x, int y){
		System.out.println(x + y);
		return x + y;
	}
	public static int soustraction (int x, int y){
		System.out.println(x - y);
		retrun x - y;
	}
	public static int multiplication (int x, int y){
		System.out.println(x * y);
		return x * y;
	}
	public static int division (int x, int y){
		if (y == 0){
			System.out.println("Il est impossible de divisé par 0");
			return null;
		}
		else {
			System.out.println(x / y);
			return x/y;
		}
	}
}

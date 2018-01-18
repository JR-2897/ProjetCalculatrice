import java.util.Calendar;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;


public class CalculAge {

	public static void main(String[] args) {
		int annee = 0;
		Scanner scan = new Scanner(System.in);
		System.out.println("Année de naissance ? :");
		annee = scan.nextInt();
		
		int mois = 0;
		Scanner scan1 = new Scanner(System.in);
		System.out.println("Mois de naissance ? :");
		mois = scan.nextInt();
		
		int jour = 0;
		Scanner scan2 = new Scanner(System.in);
		System.out.println("Jour de naissance ? :");
		jour = scan.nextInt();
		
		Calendar donnee = Calendar.getInstance();
		donnee.set(annee, mois, jour);

		Calendar now = Calendar.getInstance(Locale.FRANCE);
		
		int diffAnnee = now.get(Calendar.YEAR) - donnee.get(Calendar.YEAR);
		now.add(Calendar.YEAR, -diffAnnee);
		if(donnee.after(now)){
			diffAnnee = diffAnnee - 1;
		}
		System.out.println("Votre âge actuel est : " + diffAnnee);
		System.out.print(now);
		   
	}

}



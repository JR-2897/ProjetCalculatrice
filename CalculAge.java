import java.util.Calendar;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;


public class CalculAge {

	/*public static void main(String[] args) {
		/*int annee = 0;
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
		
		my_Age("24082000");
		   
	}*/
	
	public static int my_Age(String date){
		int jour = 0;
		int mois = 0;
		int an = 0;
		int res = 0;
		int my_date = Integer.parseInt(date);
		switch(date.length()){
			case 8:
				jour = my_date/1000000;
				mois = (my_date/10000) - (jour * 100);
				an = my_date % 10000;
				break;
			case 7:
				jour = my_date/1000000;
				mois = (my_date/10000) - (jour * 10);
				an = my_date % 10000;
				break;
			case 6:
				jour = my_date/100000;
				mois = (my_date/10000) - (jour * 10);
				an = my_date % 10000;
				break;
			default:
				break;
		}
		if((an != 0) && (mois != 0) && (jour != 0)){
			Calendar donnee = Calendar.getInstance();
			donnee.set(an, mois, jour);

			Calendar now = Calendar.getInstance(Locale.FRANCE);
		
			int diffAnnee = now.get(Calendar.YEAR) - donnee.get(Calendar.YEAR);
			now.add(Calendar.YEAR, -diffAnnee);
			if(donnee.after(now)){
				diffAnnee = diffAnnee - 1;
			}
			res = diffAnnee;
		}
		//System.out.println(Integer.parseInt(date));
		return res;
	}
}



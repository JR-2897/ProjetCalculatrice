import java.util.Scanner;

public class SalaireNetBrut {

	public static void main(String[] args) {
	
		double  SalaireAnnuel, SalaireMensuel, SalaireJournalier, SalaireHeure, Salaire;
		@SuppressWarnings("resource")
		Scanner Saisie = new Scanner(System.in);
	
		System.out.println("Tapez votre salaire annuel net");
		
		Salaire = Saisie.nextInt();
		
		System.out.println("Pour un salaire annuel net de: " + Salaire + "\n");
		
		SalaireAnnuel = Salaire * 1.23;
		SalaireMensuel = SalaireAnnuel / 12;
		SalaireJournalier = SalaireMensuel / 20;
		SalaireHeure = SalaireJournalier / 7;
		
		System.out.println("Salaire Annuel: " + SalaireAnnuel + "\n");
		
		System.out.println("Salaire Mensuel: " + SalaireMensuel + "\n");
		
		System.out.println("Salaire Journalier: " + SalaireJournalier + "\n");
		
		System.out.println("Salaire Heure: " + SalaireHeure);
		

	}

}

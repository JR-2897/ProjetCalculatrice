import java.util.Scanner;

public class SalaireBrutNet {

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		
		
		double  SalaireAnnuel, SalaireMensuel, SalaireJournalier, SalaireHeure, Salaire;
		Scanner Saisie = new Scanner(System.in);
	
		System.out.println("Tapez votre salaire annuel brut");
		
		Salaire = Saisie.nextInt();
		
		System.out.println("Pour un salaire annuel brut de: " + Salaire + "\n");
		
		SalaireAnnuel = Salaire / 1.23;
		SalaireMensuel = SalaireAnnuel / 12;
		SalaireJournalier = SalaireMensuel / 20;
		SalaireHeure = SalaireJournalier / 7;
		
		System.out.println("Salaire Annuel: " + SalaireAnnuel + "\n");
		
		System.out.println("Salaire Mensuel: " + SalaireMensuel + "\n");
		
		System.out.println("Salaire Journalier: " + SalaireJournalier + "\n");
		
		System.out.println("Salaire Heure: " + SalaireHeure);
		
		
		
		
	}

}

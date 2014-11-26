package model;

public class Pg {

	public static void main(String[] args) {
		
		/*UnJeu d = new UnJeu();
		
		d.init();
		System.out.println(d.choixDuNombre());
		System.out.println(d.proposeUnNombre());
		d.jouer();
		
		Participant p = new Participant();
		
		p.nom = "Martin";
		p.score = 12;
		
		p.affiche();*/
		
		Tournoi t = new Tournoi();
		
		t.nomDuTournoi = "Roland Garros";
		
		System.out.println("Le tournoi se nomme : " + t.nomDuTournoi);
		
		t.inscrireUnParticipant("Jer");
		t.inscrireUnParticipant("Marjo");
		t.inscrireUnParticipant("Martin");
		t.inscrireUnParticipant("Cindy");
		t.inscrireUnParticipant("Emilie");
		t.inscrireUnParticipant("Saad");
		
		t.afficheParticipants();
		//t.jouerTournoi();
		//t.afficherVainqueur();

	}
	
}
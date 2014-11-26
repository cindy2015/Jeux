package model;

import javax.swing.JOptionPane;

public class Tournoi {
	
	String nomDuTournoi;
	
	Participant[] lesParticipants = new Participant[3];
	
	int nbParticipant = 0;
	
	void inscrireUnParticipant(String nom){
		if (nbParticipant > 2){
			System.out.println("Le tournoi est complet !");
			return;
		}
		Participant nouveauParticipant  = new Participant();
		nouveauParticipant.nom = nom;
		nouveauParticipant.score = 0;
		lesParticipants[nbParticipant] = nouveauParticipant;
		nbParticipant = nbParticipant + 1;
	}
	
	void afficheParticipants(){
		for(int i = 0; i < nbParticipant; i = i + 1)
			lesParticipants[i].affiche();
		
	}
	
	void afficheScore(String nomRecherche){
		for(int i = 0; i < nbParticipant; i = i +1){
			if (nomRecherche == lesParticipants[i].nom){
				System.out.println( nomRecherche + " a un score de : " + lesParticipants[i].score);
			}
		}
	}
	
	void afficherVainqueur(){
		
		System.out.println("Récapitulons les scores : ");
		for (int i = 0; i < nbParticipant; i = i +1)
			System.out.println(lesParticipants[i].nom + " a un score de : " + lesParticipants[i].score);
		
		int test = 6 ;
		String vainqueur = "";
		for (int i = 0; i < nbParticipant; i = i +1){
			if (lesParticipants[i].score < test){
				vainqueur = lesParticipants[i].nom;
				test = lesParticipants[i].score;
			}
		}
		System.out.println("Le vainqueur est " + vainqueur + ".");
	}
	
	void jouerTournoi(){
		String n;
		for (int i = 0; i < 3; i = i +1){
			n = JOptionPane.showInputDialog("Quel est le nom ? ");
			inscrireUnParticipant(n);
		}
		
		UnJeu jeu = new UnJeu();
		for (int i = 0; i < 3; i = i +1){
			lesParticipants[i].score = jeu.jouer();
			afficheScore(lesParticipants[i].nom);
		}		
		
	}

}

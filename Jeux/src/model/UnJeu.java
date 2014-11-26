package model;

import javax.swing.JOptionPane;

public class UnJeu {
	
	int init(){
		System.out.println("Bonjour, vous allez commencer à jouer !");
		String nbCoupsChoix = JOptionPane.showInputDialog("Quel est le nombre de coups maximum ? ");
		int nbCoupsChoixCompte = Integer.parseInt(nbCoupsChoix);
		return nbCoupsChoixCompte;
	}
	
	int choixDuNombre(){
		int a = (int)(Math.random() * 10);		
		return a;
	}
	
	int proposeUnNombre(){
		String choix = JOptionPane.showInputDialog("Quel nombre choisissez vous ? ");
		int choixConv = Integer.parseInt(choix);		
		return choixConv;
	}
	
	int jouer(){
		//int nbCoupsMax = init();
		System.out.println("Bonjour, vous allez commencer à jouer !");
		int nbRecherche = choixDuNombre();
		System.out.println(nbRecherche);
		int nbCoups = 1;
		boolean test = false;
		while (nbCoups <= 6 && test != true){
			int nb = proposeUnNombre();
			if (nb < nbRecherche){
				System.out.println("Le nombre est trop petit ! Continuez...");
				nbCoups = nbCoups + 1;}
			else if	(nb > nbRecherche){
				System.out.println("Le nombre est trop grand ! Continuez...");
				nbCoups = nbCoups + 1;}
			else{
				System.out.println("Bravo vous avez trouvé en " + nbCoups + " coups !");
				test = true;
			}
		}
		if (test == false){
			System.out.println("Vous avez perdu après " + (nbCoups - 1) + " coups !");}
				
		return nbCoups;
	}
}
package service;

import domaine.Rendezvous;

public class Traitement implements ITraitement {
// les differentes signatures de la classe traitement
	@Override
	public void afficherRendezvous(Rendezvous rv) {
		System.out.println("client à un nom: "  + rv.getNom());//affiche le nom du client
		System.out.println("l'heure du rendezvous est de ...a : " + rv.getHeure());//affiche lheure du rendez vous du client
		System.out.println("le rendezvous aura lieu de .. a: " + rv.getDate());//affiche la date du rendez vous
		System.out.println("le telephone du client du client est: " + rv.getTelephone());//affiche le telephone du client
		System.out.println("le type de soin du client: "+ rv.getSoins()); //affiche le type de soin du client
		// TODO Auto-generated method stub

	}

}

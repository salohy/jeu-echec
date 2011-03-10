package jeux;

import java.util.List;


public abstract class Piece {

	private Couleur couleur;
	//private Case casePiece;
	private boolean isCapturable;
	private Joueur proprietaire;
	//private String positionInit;


	public Piece() {
		
	}

	public Piece(Couleur couleur, boolean isCapturable, Joueur proprietaire/*, String positionInit*/) {
		super();
		this.couleur = couleur;
		this.isCapturable = isCapturable;
		this.proprietaire = proprietaire;
		//this.positionInit=positionInit;
	}

	public Couleur getCouleur() {
		return couleur;
	}

	public void setCouleur(Couleur couleur) {
		this.couleur = couleur;
	}

	public boolean isCapturable() {
		return isCapturable;
	}

	public void setCapturable(boolean isCapturable) {
		this.isCapturable = isCapturable;
	}


	public Joueur getProprietaire() {
		return proprietaire;
	}

	public void setProprietaire(Joueur proprietaire) {
		this.proprietaire = proprietaire;
	}

	public abstract List<Case> typeDeplacement(Case casePieceADeplacer);

	public abstract void capturable();
	
	

	/*public String getPositionInit() {
		return positionInit;
	}*/

	public String toString(){

		return  "piece";
	}


}

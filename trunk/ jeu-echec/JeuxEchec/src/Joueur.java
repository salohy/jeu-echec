import java.util.List;


public class Joueur {


	private String nom;
	private Couleur couleur;
	private List<Piece> pieces;


	public Joueur(String nom, Couleur couleur) {
		super();
		this.nom = nom;
		this.couleur = couleur;
	}


	public String getNom() {
		return nom;
	}


	public void setNom(String nom) {
		this.nom = nom;
	}


	public Couleur getCouleur() {
		return couleur;
	}


	public void setCouleur(Couleur couleur) {
		this.couleur = couleur;
	}


	public List<Piece> getPieces() {
		return pieces;
	}


	public void setPieces(List<Piece> pieces) {
		this.pieces = pieces;
	}

	public void removePiece(Piece piece) {
		this.pieces.remove(piece);
	}



	/**
	 * methode qui deplace la piece du joueur sur la case en paramètre
	 * @param pieceABouger
	 * @param caseChoisie
	 */
	public void deplacementPiece(Piece pieceABouger, Case caseChoisie){

		if(caseChoisie.isPrise()){
			if(caseChoisie.getPiece().isCapturable())
				Game.bouffePiece(caseChoisie.getPiece());
		}
		
		caseChoisie.setPiece(pieceABouger);
		System.out.println("case choisie: "+caseChoisie.toString()+" Piece a bouger : "+caseChoisie.getPiece().toString());

	}



}

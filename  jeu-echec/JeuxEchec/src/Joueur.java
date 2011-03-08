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
	
	
}

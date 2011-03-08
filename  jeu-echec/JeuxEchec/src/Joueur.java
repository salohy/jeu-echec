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
	
	
	public void addPiece(List<Piece> p){
		pieces=p;
		
	}
	
	

}

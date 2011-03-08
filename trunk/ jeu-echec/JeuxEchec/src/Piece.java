import java.util.List;


public abstract class Piece {
	
	private Couleur couleur;
	private Case casePiece;
	private boolean isCapturable;
	
	
	public Piece(Couleur couleur, Case casePiece,
			boolean isCapturable) {
		super();
		this.couleur = couleur;
		this.casePiece = casePiece;
		this.isCapturable = isCapturable;
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

	public abstract List<Position> typeDeplacement(Case c);
	
	public abstract void capturable();

	public Case getCasePiece() {
		return casePiece;
	}

	public void setCasePiece(Case casePiece) {
		this.casePiece = casePiece;
	}

	
	
	
}

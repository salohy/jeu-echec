package jeux;


public class Case {

	
	private Position position;
	private Couleur couleur;
	private boolean isPrise;
	private Piece piece;
	
	
	public Position getPosition() {
		return position;
	}

	public void setPosition(Position p) {
		this.position = p;
	}

	public void setCouleur(Couleur couleur) {
		this.couleur = couleur;
	}

	
	public Couleur getCouleur() {
		return couleur;
	}

	public boolean isPrise() {
		return isPrise;
	}

	public void setPrise(boolean isPrise) {
		this.isPrise = isPrise;
	}

	public Piece getPiece() {
		return piece;
	}

	public void setPiece(Piece estSurLaCase) {
		this.piece = estSurLaCase;
	}
	
	public Case(Position p,  Couleur color, boolean isPrise) {
		super();
		this.position = p;
		this.couleur=color;
		this.isPrise = isPrise;
	}

	
	public String toString(){
		
		return "je suis la case de couleur "+couleur+" position x: "+
		this.getPosition().getX()+" position y: "+this.getPosition().getY();
	}

	
	
	
	
	
	
	
}

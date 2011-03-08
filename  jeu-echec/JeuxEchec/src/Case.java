
public class Case {

	
	private Position position;
	private Couleur couleur;
	private boolean isPrise;
	
	
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

	
	public Case(Position p,  Couleur color, boolean isPrise) {
		super();
		this.position = p;
		this.couleur=color;
		this.isPrise = isPrise;
	}

	
	
	
	
	
}

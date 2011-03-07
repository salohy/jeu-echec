
public class Case {

	
	private Position position;
	private CouleurCase couleur;
	private boolean isPrise;
	
	
	public Position getPosition() {
		return position;
	}

	public void setPosition(Position p) {
		this.position = p;
	}

	public void setCouleur(CouleurCase couleur) {
		this.couleur = couleur;
	}

	
	public CouleurCase getCouleur() {
		return couleur;
	}

	public boolean isPrise() {
		return isPrise;
	}

	public void setPrise(boolean isPrise) {
		this.isPrise = isPrise;
	}

	
	public Case(Position p,  CouleurCase color, boolean isPrise) {
		super();
		this.position = p;
		this.couleur=color;
		this.isPrise = isPrise;
	}

	
	
	
	
	
}

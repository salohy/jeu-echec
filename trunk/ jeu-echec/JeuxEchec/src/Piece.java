import java.util.List;


public abstract class Piece {
	
	private Couleur couleur;
	private Position position;
	private boolean isCapturable;
	
	
	public Piece(Couleur couleur, Position position,
			boolean isCapturable) {
		super();
		this.couleur = couleur;
		this.position = position;
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

	public Position getPosition() {
		return position;
	}

	public void setPosition(Position position) {
		this.position = position;
	}
	
	
}

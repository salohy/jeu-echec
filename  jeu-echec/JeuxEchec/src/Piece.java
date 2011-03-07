import java.util.List;


public abstract class Piece {
	
	//private String nom;
	private String couleur;
	private Position position;
	private boolean isCapturable;
	
	
	public Piece(/*String nom, */String couleur, Position position,
			boolean isCapturable) {
		super();
		//this.nom = nom;
		this.couleur = couleur;
		this.position = position;
		this.isCapturable = isCapturable;
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

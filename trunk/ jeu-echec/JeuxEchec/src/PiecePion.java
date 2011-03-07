
public class PiecePion extends Piece implements Pion {

	

	public PiecePion(String nom, String couleur, String position) {
		super(nom, couleur, position);
	}

	@Override
	public boolean deplacementValide() {
	
		return false;
	}

}

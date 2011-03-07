import java.util.List;


public class PieceCavalier extends Piece{

	public PieceCavalier(String couleur, Position position, boolean isCapturable) {
		super(couleur, position, isCapturable);
	}

	@Override
	public void capturable() {
		
		
	}

	@Override
	public List<Position> typeDeplacement(Case c) {
		// TODO Auto-generated method stub
		return null;
	}

	

}


public class Cases {

	private static Case[][] tabCase;
	
	public void addCases() {
		Couleur color = Couleur.NOIR;
		
		for (int i=0;i<CONSTANTES.MAX_LIGNE;i++){
			for (int j=0;j<CONSTANTES.MAX_COL;j++){
				if (color == Couleur.NOIR){
					tabCase[i][j]=new Case(new Position(i, j), color, false);
					color = Couleur.BLANC;
				}else{
					tabCase[i][j]=new Case(new Position(i, j), color, false);
					color = Couleur.NOIR;
				}
				
				
			}
		}
		
	
	}
	
	/**
	 * methode qui retourne la case correspondante à la position passée en paramètre
	 * @param positionPiece
	 * @return Case
	 */
	public static Case getCase(Position positionPiece) {
		
		int xPositionPiece = positionPiece.getX();
		int yPositionPiece = positionPiece.getY();
		int xPositionCase;
		int yPositionCase;
		Position positionCase;
		Case caseCourante;
		
		for (int i=0;i<CONSTANTES.MAX_LIGNE;i++){
			for (int j=0;j<CONSTANTES.MAX_COL;j++){
				caseCourante = tabCase[i][j];
				positionCase = caseCourante.getPosition();
				xPositionCase = positionCase.getX();
				yPositionCase = positionCase.getY();
				
				if (xPositionCase == xPositionPiece && yPositionCase == yPositionPiece){
					return caseCourante; 
				}
			}
		}
		
		return null;
	}

	public static Case[][] getTabCase() {
		return tabCase;
	}
	
	
	
	
}

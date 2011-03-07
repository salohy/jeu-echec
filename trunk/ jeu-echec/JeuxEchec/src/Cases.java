
public class Cases {

	private Case[][] tabCase;
	
	public void addCases() {
		CouleurCase color = CouleurCase.CASE_NOIR;
		
		for (int i=0;i<CONSTANTES.MAX_LIGNE;i++){
			for (int j=0;j<CONSTANTES.MAX_COL;j++){
				if (color == CouleurCase.CASE_NOIR){
					tabCase[i][j]=new Case(new Position(i, j), color, false);
					color = CouleurCase.CASE_BLANCHE;
				}else{
					tabCase[i][j]=new Case(new Position(i, j), color, false);
					color = CouleurCase.CASE_NOIR;
				}
				
				
			}
		}
		
	
	}
	
	/**
	 * methode qui retourne la case correspondante à la position passée en paramètre
	 * @param positionPiece
	 * @return Case
	 */
	public Case getCase(Position positionPiece) {
		
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
	
	
	
	
}

package jeux;
import java.util.List;



public class Echiquier {

	private static Case[][] tabCase = new Case[CONSTANTES.MAX_LIGNE][CONSTANTES.MAX_COL];


	public Echiquier(){
		addCases();
	}

	public void addCases() {

		Couleur couleur1=Couleur.NOIR;
		Couleur couleur2=Couleur.BLANC;

		for (int i=0;i<CONSTANTES.MAX_LIGNE;i++){


			for (int j=0;j<CONSTANTES.MAX_COL;j++){
				if (j%2 == 0){
					tabCase[i][j]=new Case(new Position(i, j), couleur1);
				}else{
					tabCase[i][j]=new Case(new Position(i, j), couleur2);
				}
			}

			if(i%2 ==0){
				couleur1=Couleur.NOIR;
				couleur2=Couleur.BLANC;

			}else{
				couleur1=Couleur.BLANC;
				couleur2=Couleur.NOIR;
			}

		}
	}



	public void placerPieces(List<Piece> listePiecesTetes,Couleur couleur/*,Joueur joueur*/){
		int maxLigne=0;
		int caseDepart=0;
		//Couleur couleur = joueur.getCouleur();
		switch (couleur) {
		case NOIR:
			maxLigne = CONSTANTES.MAX_LIGNE/4;
			caseDepart = 0;
			break;

		case BLANC:
			maxLigne = CONSTANTES.MAX_LIGNE;
			caseDepart = 6;
			break;

		default:
			break;
		}

		for(int ligne=caseDepart;ligne<maxLigne;ligne++ ){
			for (int col=0;col<CONSTANTES.MAX_COL;col++ ){
				//placer les pions
				if (ligne == 1){
					this.tabCase[ligne][col].setPiece(listePiecesTetes.get(col+8)/*new PiecePion(couleur, false, joueur)*/);
				}else if (ligne == 6){
					this.tabCase[ligne][col].setPiece(listePiecesTetes.get(col+8)/*new PiecePion(couleur, false, joueur)*/);
				}else if(ligne == 0){
					//placer les tetes joueur1
					this.tabCase[ligne][col].setPiece(listePiecesTetes.get(col));
				}else if (ligne == 7){
					//placer les tetes joueur2
					this.tabCase[ligne][col].setPiece(listePiecesTetes.get(col));
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


	/**
	 * liste des positions jouables sur l'echiquier pour le joueur 
	 * @param joueur
	 * @param piece
	 * @return 
	 */
	public List<Case> positionJouable(Case casePieceAJouer){
		List<Case> listPositionsJouables;

		//piece du joueur
		Piece pieceDuJoueur = casePieceAJouer.getPiece();

		//liste des positions possibles pour cette pièce
		listPositionsJouables = pieceDuJoueur.typeDeplacement(casePieceAJouer);


		return listPositionsJouables; //TODO vérifier ds le main que le joueur a choisie une position incluse ds la liste
	}

	public static Case[][] getTabCase() {
		return tabCase;
	}

	public static void setTabCase(Case[][] tabCase) {
		Echiquier.tabCase = tabCase;
	}






}

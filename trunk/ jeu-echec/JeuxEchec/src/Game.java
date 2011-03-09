import java.util.List;


public class Game {


	private List<Joueur> joueurs;
	

	public Game(List<Joueur> joueurs) {
		super();
		this.joueurs = joueurs;
	}


	public void addPiece(Joueur joueur,List<Piece> p){
		joueur.setPieces(p);
	}


	/*public List<Position> isDeplacementPossible(Joueur joueur,List<Position> listPositionsJouables) {
		
		List<Position> positionPossible;
		List <Piece> piecesDuJoueur=joueur.getPieces();

		for(Iterator i = listPositionsJouables.iterator();i.hasNext();){

			Position posCourante= (Position) i.next();

			//récupération de la case grace a la position
			Case caseCourante=Cases.getCase(posCourante);

			//1 voir si la case courante est prise 
			if(caseCourante.isPrise()){

				//voir si la case prise contient une piece du joueur
				for(Iterator piece = piecesDuJoueur.iterator();piece.hasNext();){

					Piece pieceCourante= (Piece) piece.next();

					//on récupère la case sur laquelle est la piece courante
					Case caseDeLaPiece=pieceCourante.getCasePiece();

					/*vérif si la case de la piece est dans la liste des positions possibles, 
					si oui il ya une piece du joueur a cette pos*/
/*					if(caseCourante == caseDeLaPiece){
						listPositionsJouables.remove(caseCourante);
					}
				}

			}

		}

		positionPossible=listPositionsJouables;

		return positionPossible;
	}*/


	
	/**
	 * @param pieceABouffe
	 * methode pour la prise de piece
	 */
	public static void bouffePiece(Piece pieceABouffe){
		
		Joueur j= pieceABouffe.getProprietaire();
		j.removePiece(pieceABouffe);
	}
	
	
	
}

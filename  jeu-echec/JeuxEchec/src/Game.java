import java.util.Iterator;
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


	
	
/*	public void bouffePiece(Case caseChoisie){
		
		
		//2 Verifi si la case courante contient une piece du joueur, si ce n'est pas le cas c'est une piece du joueur adverse
		if(caseCourante != caseDeLaPiece && caseDeLaPiece.isPrise()){

			//remove la piece du joueur adverse
			for(Iterator listeJoueur = joueurs.iterator();listeJoueur.hasNext();){
				
				Joueur j=(Joueur)listeJoueur.next();
				
				if(j!=joueur){
					j.removePiece(pieceCourante);
				}
				
			}
			
		}
	}*/
	
	
	
}

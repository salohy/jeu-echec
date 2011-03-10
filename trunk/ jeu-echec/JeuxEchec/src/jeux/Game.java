package jeux;
import java.util.ArrayList;
import java.util.List;


public class Game {


	private List<Joueur> joueurs;
	private Echiquier echiquier;


	public Game(Echiquier echiquier,List<Joueur> joueurs) {
		super();
		this.joueurs = joueurs;
		this.echiquier=echiquier;
	}


	public void piecesDuJoueur(Joueur joueur,List<Piece> p){
		joueur.setPieces(p);
	}


	public List<Piece>createPieceDuJoueur(Joueur joueur, Couleur couleur){

		List<Piece> listePieceJoueur=new ArrayList<Piece>();

		Piece tour1= new PieceTour(couleur, false, joueur);
		Piece cavalier1= new PieceCavalier(couleur, false, joueur);
		Piece fou1= new PieceFou(couleur, false, joueur);
		Piece dame= new PieceReine(couleur, false, joueur);
		Piece roi= new PieceRoi(couleur, false, joueur);
		Piece fou2= new PieceFou(couleur, false, joueur);
		Piece cavalier2= new PieceCavalier(couleur, false, joueur);
		Piece tour2= new PieceTour(couleur, false, joueur);

		listePieceJoueur.add(tour1);
		listePieceJoueur.add(cavalier1);
		listePieceJoueur.add(fou1);
		listePieceJoueur.add(dame);
		listePieceJoueur.add(roi);
		listePieceJoueur.add(fou2);
		listePieceJoueur.add(cavalier2);
		listePieceJoueur.add(tour2);


		for (int compteurPion=0; compteurPion<8;compteurPion++){
			Piece pion= new PiecePion(couleur, false, joueur);
			listePieceJoueur.add(pion);
		}
		return listePieceJoueur;
	}


	public void initialiserEchiquier() {
		List<Piece> listePiecesJoueur=new ArrayList<Piece>();
		for(int numJoueur=0;numJoueur<this.joueurs.size();numJoueur++ ){

			listePiecesJoueur=this.createPieceDuJoueur(joueurs.get(numJoueur), joueurs.get(numJoueur).getCouleur());
			joueurs.get(numJoueur).setPieces(listePiecesJoueur);
			echiquier.placerPieces(listePiecesJoueur, joueurs.get(numJoueur).getCouleur());
		}

	}

	public void afficherEchiquier(){
		Case[][] tabCase=echiquier.getTabCase();
		for (int i=0;i<CONSTANTES.MAX_LIGNE;i++){
			for (int j=0;j<CONSTANTES.MAX_COL;j++){
				if (tabCase[i][j].getPiece() == null){
					System.out.print(tabCase[i][j].toString());
				}else{
					System.out.print(tabCase[i][j].getPiece().toString());
				}
			}
			System.out.println("");
		}
	}


/**
 * @param pieceABouffe
 * methode pour la prise de piece
 */
public static void bouffePiece(Piece pieceABouffe){

	Joueur j= pieceABouffe.getProprietaire();
	j.removePiece(pieceABouffe);
}


public static void main(String[] args) {


	Echiquier echiquier=new Echiquier();
	List <Joueur> listeJoueur=new ArrayList<Joueur>();
	Joueur j1=new Joueur("Ben", Couleur.BLANC);
	Joueur j2=new Joueur("Ju", Couleur.NOIR);
	listeJoueur.add(j1);
	listeJoueur.add(j2);

	Game partie=new Game(echiquier,listeJoueur);
	partie.initialiserEchiquier();

	partie.afficherEchiquier();
	
	Case[][] tabCase =echiquier.getTabCase();
	//System.out.println("PIECE "+tabCase[2][0].getPiece().toString());
	j1.getPieces().get(8).typeDeplacement(tabCase[1][0]);
	
	
}



}

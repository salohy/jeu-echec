import java.util.ArrayList;
import java.util.List;


public class Test {

	/**
	 * @param args
	 */
	public static void main(String[] args) {


		Cases casesDeLechiquier=new Cases();
		
		Echiquier echiquier=new Echiquier(casesDeLechiquier);
		
		
		Joueur j1=new Joueur("Ben", Couleur.BLANC);
		Joueur j2=new Joueur("Ju", Couleur.NOIR);
		
		List <Joueur> listeJoueur=new ArrayList<Joueur>();
		listeJoueur.add(j1);
		listeJoueur.add(j2);
		
		Game partie=new Game(listeJoueur);
		
		List <Piece> listePieceJ1=new ArrayList<Piece>();
		Piece tourJ1= new PieceTour(Couleur.BLANC, false, j1);
		Piece tour1J1= new PieceTour(Couleur.BLANC, false, j1);
		listePieceJ1.add(tourJ1);
		listePieceJ1.add(tour1J1);
		
		j1.setPieces(listePieceJ1);
		
		List <Piece> listePieceJ2=new ArrayList<Piece>();
		Piece tourJ2= new PieceTour(Couleur.NOIR, false, j2);
		Piece tour1J2= new PieceTour(Couleur.NOIR, false, j2);
		listePieceJ2.add(tourJ2);
		listePieceJ2.add(tour1J2);
		
		j2.setPieces(listePieceJ2);

	}

}

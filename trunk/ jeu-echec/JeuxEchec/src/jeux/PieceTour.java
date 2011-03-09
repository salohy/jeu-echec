package jeux;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;



public class PieceTour extends Piece {


	public PieceTour(Couleur couleur, boolean isCapturable, Joueur proprietaire) {
		super(couleur, isCapturable, proprietaire);
	}


	@Override
	public void capturable() {


	}


	/*	@Override
	public List<Position> typeDeplacement(Case c) {

		Position posCase=c.getPosition();
		int x=posCase.getX();
		int y=posCase.getY();
		List<Position> positionPossibles=new ArrayList<Position>();

		for (int coordX=0;coordX<CONSTANTES.MAX_LIGNE;coordX++){
			if (coordX != x){
				positionPossibles.add (new Position(coordX, y));
			}
		}

		for (int coordY=0;coordY<CONSTANTES.MAX_COL;coordY++){
			if (coordY != y){
				positionPossibles.add (new Position(x,coordY));
			}
		}

		System.out.println("-------Liste des positions possibles-------------"+positionPossibles);

		return positionPossibles;
	}*/



/*	@Override
	public List<Position> typeDeplacement(Case casePieceADeplacer) {

		int x=casePieceADeplacer.getPosition().getX();
		int y=casePieceADeplacer.getPosition().getY();

		List<Position> positionPossibles=new ArrayList<Position>();

		for(int i=0; i<Cases.getTabCase().length;i++){


			for (int coordX=x;coordX<CONSTANTES.MAX_LIGNE;coordX++){
				if (coordX != x){

					//on récupère la case avec les coordonnées recu
					Case c=Cases.getCase(new Position(coordX,y));
					if(!c.isPrise()){
						positionPossibles.add (new Position(coordX,y));
					}else{

						//voir si la case prise est occupé par une piece de l'adversaire

						if (c.getPiece().getProprietaire() != casePieceADeplacer.getPiece().getProprietaire()){
							positionPossibles.add (new Position(coordX,y));
						}

						break;
					}
				}
			}


			for (int coordX=0;coordX<x;coordX++){
				if (coordX != x){

					//on récupère la case avec les coordonnées recu
					Case c=Cases.getCase(new Position(coordX,y));
					if(!c.isPrise()){
						positionPossibles.add (new Position(coordX,y));
					}else{

						//voir si la case prise est occupé par une piece de l'adversaire

						if (c.getPiece().getProprietaire() != casePieceADeplacer.getPiece().getProprietaire()){
							positionPossibles.add (new Position(coordX,y));
						}
						break;
					}
				}
			}


			for (int coordY=y;coordY<CONSTANTES.MAX_COL;coordY++){
				if (coordY != y){

					//on récupère la case avec les coordonnées recu
					Case c=Cases.getCase(new Position(x,coordY));
					if(!c.isPrise()){
						positionPossibles.add (new Position(x,coordY));
					}else{

						//voir si la case prise est occupé par une piece de l'adversaire

						if (c.getPiece().getProprietaire() != casePieceADeplacer.getPiece().getProprietaire()){
							positionPossibles.add (new Position(x,coordY));
						}
						break;
					}
				}
			}


			for (int coordY=0;coordY<y;coordY++){
				if (coordY != y){

					//on récupère la case avec les coordonnées recu
					Case c=Cases.getCase(new Position(x,coordY));
					if(!c.isPrise()){
						positionPossibles.add (new Position(x,coordY));
					}else{
						//voir si la case prise est occupé par une piece de l'adversaire

						if (c.getPiece().getProprietaire() != casePieceADeplacer.getPiece().getProprietaire()){
							positionPossibles.add (new Position(x,coordY));
						}
						break;
					}
				}
			}

		}

		System.out.println("-------Liste des positions possibles-------------"+positionPossibles);

		return positionPossibles;
	}
	*/
	
	
	
	@Override
	public List<Case> typeDeplacement(Case casePieceADeplacer) {

		int x=casePieceADeplacer.getPosition().getX();
		int y=casePieceADeplacer.getPosition().getY();

		List<Case> positionPossibles=new ArrayList<Case>();

		for(int i=0; i<Cases.getTabCase().length;i++){


			for (int coordX=x;coordX<CONSTANTES.MAX_LIGNE;coordX++){
				if (coordX != x){

					//on récupère la case avec les coordonnées recu
					Case c=Cases.getCase(new Position(coordX,y));
					if(!c.isPrise()){
						positionPossibles.add (c);
					}else{

						//voir si la case prise est occupé par une piece de l'adversaire

						if (c.getPiece().getProprietaire() != casePieceADeplacer.getPiece().getProprietaire()){
							positionPossibles.add (c);
							c.getPiece().setCapturable(true);
						}

						break;
					}
				}
			}


			for (int coordX=0;coordX<x;coordX++){
				if (coordX != x){

					//on récupère la case avec les coordonnées recu
					Case c=Cases.getCase(new Position(coordX,y));
					if(!c.isPrise()){
						positionPossibles.add (c);
					}else{

						//voir si la case prise est occupé par une piece de l'adversaire

						if (c.getPiece().getProprietaire() != casePieceADeplacer.getPiece().getProprietaire()){
							positionPossibles.add (c);
						}
						break;
					}
				}
			}


			for (int coordY=y;coordY<CONSTANTES.MAX_COL;coordY++){
				if (coordY != y){

					//on récupère la case avec les coordonnées recu
					Case c=Cases.getCase(new Position(x,coordY));
					if(!c.isPrise()){
						positionPossibles.add (c);
					}else{

						//voir si la case prise est occupé par une piece de l'adversaire

						if (c.getPiece().getProprietaire() != casePieceADeplacer.getPiece().getProprietaire()){
							positionPossibles.add (c);
						}
						break;
					}
				}
			}


			for (int coordY=0;coordY<y;coordY++){
				if (coordY != y){

					//on récupère la case avec les coordonnées recu
					Case c=Cases.getCase(new Position(x,coordY));
					if(!c.isPrise()){
						positionPossibles.add (c);
					}else{
						//voir si la case prise est occupé par une piece de l'adversaire

						if (c.getPiece().getProprietaire() != casePieceADeplacer.getPiece().getProprietaire()){
							positionPossibles.add (c);
						}
						break;
					}
				}
			}

		}

		System.out.println("-------Liste des cases possibles-------------"+positionPossibles);

		return positionPossibles;
	}


	public String toString(){
		
		return "je suis une tour "+ super.toString();
	}

}

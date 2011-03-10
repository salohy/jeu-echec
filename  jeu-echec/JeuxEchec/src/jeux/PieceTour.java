package jeux;

import java.util.ArrayList;
import java.util.List;



public class PieceTour extends Piece {


	public PieceTour(Couleur couleur, boolean isCapturable, Joueur proprietaire/*,String posInit*/) {
		super(couleur, isCapturable, proprietaire/*,posInit*/);
	}


	@Override
	public void capturable() {

	}



	@Override
	public List<Case> typeDeplacement(Case casePieceADeplacer) {

		int x=casePieceADeplacer.getPosition().getX();
		int y=casePieceADeplacer.getPosition().getY();

		List<Case> positionPossibles=new ArrayList<Case>();

		for(int i=0; i<Echiquier.getTabCase().length;i++){

			
			for (int coordX=x;coordX<CONSTANTES.MAX_LIGNE;coordX++){
				if (coordX != x){

					//on récupère la case avec les coordonnées recu
					Case c=Echiquier.getCase(new Position(coordX,y));
					
					if(c.getPiece() == null){
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
					Case c=Echiquier.getCase(new Position(coordX,y));
					if(c.getPiece() == null){
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
					Case c=Echiquier.getCase(new Position(x,coordY));
					if(c.getPiece() == null){
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
					Case c=Echiquier.getCase(new Position(x,coordY));
					if(c.getPiece() == null){
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

		if(this.getCouleur()==Couleur.BLANC){
			return "t";
		}else{
			return "T";
		}
	}

}

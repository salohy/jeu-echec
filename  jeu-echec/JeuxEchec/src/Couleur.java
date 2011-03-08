
public enum Couleur {
	
	BLANC, NOIR;
	
	public String toString() {
		switch (this) {
		case BLANC:
			return "blanc";
		case NOIR:
			return "noir";

		default:
			return "non précisé";
		}
	}
}

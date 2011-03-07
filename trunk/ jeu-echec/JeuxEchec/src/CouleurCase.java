
public enum CouleurCase {
	
	CASE_BLANCHE, CASE_NOIR;
	
	public String toString() {
		switch (this) {
		case CASE_BLANCHE:
			return "blanc";
		case CASE_NOIR:
			return "noir";

		default:
			return "non précisé";
		}
	}
}

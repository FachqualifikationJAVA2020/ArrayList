package zwei;

public class Kuchen extends Gebaeck {
	public Kuchen(String name, float gewicht) {
		super(name,gewicht);
	}
	
	@Override
	public String toString() {
		/*
		 * Weil ich nicht direkt auf die Felder der Oberklasse zugreifen kann
		 * müsste ich entweder Getter schreiben oder ich kann mit
		 * super.toString() auf die toString()-Methode der Oberklasse zugreifen
		 */
//		return "Kuchen "+name+": "+gewicht+"g";//funktioniert so nicht
		return "Kuchen "+super.toString();
	}
}

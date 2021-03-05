package zwei;

public class Gebaeck implements Comparable{
	/*
	 * Ein einfaches Backwerk, das nicht näher beschrieben ist
	 */
	private String name;
	private float gewicht;
	
	public Gebaeck(String name, float gewicht) {
		this.name = name;
		this.gewicht = gewicht;
	}
	
	@Override
	public String toString() {
		return name+": "+gewicht+"g";
	}
	
	@Override
	public boolean equals(Object o) {
		/*
		 * In der equals()-Methode kann ich festlegen wann zwei Instanzen dieser Klasse
		 * gleich sind, z.B. wenn sie den gleichen Namen und das gleiche Gewicht haben
		 * 
		 * Dazu erstmal prüfen, ob o überhaupt ein Gebaeck ist
		 */
		if(o instanceof Gebaeck ) {
			//Der instanceof-Operator gibt true zurück, wenn o ein Gebaeck ist
			//false, wenn o irgendetwas anderes ist
			Gebaeck go = (Gebaeck)o;
			if(this.name.equals(go.name) && this.gewicht == go.gewicht) {
				return true;
			}
		}
		return false;
	}
	
	/*
	 * Um Gebaecke zu vergleichen, muss ich Comparable implementieren
	 * und dazu gehört eine compreTo()-Methode
	 * < 0 heißt davor sortieren
	 * > 0 heißt dahinter sortieren
	 */
	public int compareTo(Object o) {
		/*
		 * Gebaecke werden zunächst alphabetisch sortiert und dananch nach
		 * Gewicht
		 */
		if(o instanceof Gebaeck) {
			Gebaeck go = (Gebaeck) o;
			//Wenn ich nur nach namen sortieren wollte:
//			return this.name.compareTo(go.name);
			
			//Erst nach Namen sortieren
			if(this.name.compareTo(go.name) > 0) {
				return 1;
			} else if (this.name.compareTo(go.name) < 0) {
				return -1;
			} else {
				//nur wenn die Namen gleich sind, nach gewicht sortieren
				return (int)(this.gewicht - go.gewicht);
			}	
		}
		return -1;
		
	}
	
}

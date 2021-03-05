package zwei;

import java.util.ArrayList;

public class ArrayListTest {

	public static void main(String[] args) {
		/*
		 * ArrayList ist ein mit gelieferte JavaKlasse, der unser
		 * FancyArray nachempfunden ist. ArrayList hat viele Methoden
		 * die wir in FancyArray auch geschrieben haben
		 */
		ArrayList test = new ArrayList();
		test.add("M�ller");
		test.add("Brauer");
		System.out.println(test);
		
		test.remove("Brauer");
		System.out.println(test);
		test.add(1);
		System.out.println(test);
		
		Object el = test.get(1);
		System.out.println(el);
//		String s = (String)el;
		Integer i = (Integer)el;
		//Weil i jetzt ein Integer ist, kann ich damit
		//Integer-typische Dinge tun, wie addieren
		int ergebnis = i + 2;
		
		/*
		 * Wenn ich meine ArrayList auf einen Typen festlegen will
		 * z.B. eine Namensliste, die nur Strings enthalten soll,
		 * kann ich das tun:
		 */
		ArrayList<String> namensliste = new ArrayList<String>();
		/*
		 * Das in den spitzen Klammern ist ein Typparameter
		 * mit dem ich den erlaubten Datentypen festlegen kann:
		 */
		namensliste.add("�zmen");
		namensliste.add("Havel");
//		namensliste.add(1);//Integer sind jetzt nicht mehr zugelassen, nur Strings
		System.out.println(namensliste);
		String eins = namensliste.get(1);
		/*
		 * get() liefert jetzt sofort einen String zur�ck :)
		 */
		
		/*
		 * Nat�rlich kann ich auch eine ArrayList vom Typ der Oberklasse machen
		 * und dort Instanzen der Kindklasse einstellen
		 */
		ArrayList<Gebaeck> backliste = new ArrayList<>();
		//rechts kann ich den Typen weglassen, es reichen dann die leeren Klammern <>
		backliste.add(new Gebaeck("Roggenbr�tchen", 250.0F));
		backliste.add(new Kuchen("Kirschkuchen", 212.5F));
		
		System.out.println(backliste);
		
		/*
		 * Nochmal die remove-Methode
		 * 
		 * diesmal m�chte ich auch wissen, OB das Br�tchen entfernt wurde
		 * dazu nutze ich den R�ckgabewert von remove()
		 * true - wenn die ArrayList ge�ndert wurde
		 * false - wenn die ArrayList NICHT ge�ndert wurde (weil das Objekt nicht drauf war)
		 */
		if(backliste.remove(new Gebaeck("Kirschkuchen",212.5F))) {
			System.out.println("Gebaeck entfernt");
		} else {
			System.out.println("Gebaeck nicht vorhanden!");
		}
		/*
		 * Dieses Roggenbr�tchen ist ein anderes Objekt als das Roggenbr�tchen oben
		 * standardm��ig pr�ft die equals()-Methode auf Objektgleichheit
		 * Um das zu �ndern, kann ich equals() �berschreiben
		 */
		System.out.println(backliste);
		
	}

}

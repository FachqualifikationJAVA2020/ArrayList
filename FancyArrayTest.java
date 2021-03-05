package zwei;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FancyArrayTest {

	public static void main(String[] args) {
		/*
		 * Hier probieren wir aus ob die ArrayList-Methoden genauso funktionieren
		 * wie in FancyArray
		 */
		ArrayList test = new ArrayList();
		System.out.println(test.size());
		//add
		test.add("Neu");
		System.out.println(test);
		
		test.add("zwei");
		test.add("drei");
		
		//toString()
		System.out.println(test);
		
		/*
		 * Jetzt einzelne Objekte
		 */
		System.out.println(test.get(2));
		/*
		 * Auch hier sehen wir, das "erste" Element hat den Index 0
		 */
		System.out.println(test.size());
		
		test.set(0, "eins");
		System.out.println(test);
		System.out.println(test.size());
		/*
		 * remove()
		 */
		test.remove(1);
		System.out.println(test);
		test.remove(1);
		System.out.println(test);
		test.remove(0);
		System.out.println(test);
		
		//Hier werden die float-Literale umgewandelt in Float
		//(die zugehörige Wrapperklasse)
		test.add(1.5);
		test.add(1.2);
		test.add(2.5);
		System.out.println(test);
		/*
		 * Ich möchte, dass so etwas geht:
		 * ich gebe den Wert an, der entfernt werden soll
		 * nicht den Index
		 */
		test.remove(1.2);
		System.out.println(test);
		
		/*
		 * Ab jetzt ein parametrisierter Konstruktoraufruf
		 */
		Object[] eingabe = {"Einkauf","Verwaltung","IT"};
		//Hier ist ein Unterschied: ArrayList nehmen nicht ohne weiteres
		//klassische Arrays als Parameter im Konstruktor :(
		//Wie kann ich trotzdem mehrere Elemente auf einmal angeben?
//		ArrayList test2 = new ArrayList(eingabe);
		/*
		 * Offenbar kann ich eine Collection annehmen
		 * Wie mache ich aus einem klassischen Array eine Collection?
		 * Dazu brauche ich eine Hilfsklasse: Arrays
		 * das hat eine Methode asList(), die eine Liste zurückgibt
		 * immerhin ist List eine Collection und darum kann ich sie dem
		 * Konstruktor übergeben
		 */
		List c = Arrays.asList(eingabe);
		ArrayList test2 = new ArrayList(c);
		System.out.println(test2);
		
		test2.add("Verwaltung");
		/*
		 * removeAll nimmt nur eine Collection, kein einzelnes Element
		 */
		ArrayList remove = new ArrayList();
		remove.add("Verwaltung");
		/*
		 * Lösung: ich erzeige eine Collection, die die zu entfernenden Elemente
		 * enthält: z.B. eine ArrayList()
		 * Hier jetzt nur ein Element, aber ich könnte auch mehrere Vorkommnisse
		 * mehrerer Elemente gleichzeitig entfernen
		 */
		test2.removeAll(remove);
		System.out.println(test2);
		
		Object[] bla = test2.toArray();
		bla[1] = "Blödsinn";
		System.out.println(test2);
		//So soll es nicht sein, dass in test2 Blödsinn steht
		//Also haben wir das gefixt :)
		
		test2.add("Buchhaltung");
		System.out.println(test2);
		//Sortieren:
//		test2.sort();
//		System.out.println(test2);
		
//		//Mal Zahlen
//		Integer[] zahlen = {4,5,2,3,1};//Objekttyp!
//		FancyArray test3 = new FancyArray(zahlen);
//		System.out.println(test3);
//		test3.sort();
//		System.out.println(test3);
	}

}

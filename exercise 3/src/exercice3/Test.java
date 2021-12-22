package exercice3;

public class Test {
	
	public static void main (String[] args)
	{
		livre l1 = new livre();
		
		l1.ref = "ref dyal ktab nadi";
		l1.titre = "ktab nadi";
		l1.maison_edition = "f cafe";
		l1.annee = 2020;
		
		String auteurs[] = new String[2];
		auteurs[0] = "wa7d";
		auteurs[1] = "wa7da";
		l1.setauteurs(auteurs);
		
		
		
		System.out.println(l1.toString());
		System.out.println(l1.chercherAuteur("wa7d"));
		System.out.println(l1.chercherAuteur("wa7da"));
		System.out.println(l1.chercherAuteur("ta wa7d"));
		
		System.out.println(l1.chercherTheme("ktab"));
		System.out.println(l1.chercherTheme("nadi"));
		System.out.println(l1.chercherTheme("war9a"));
		
		
		
		
	}

}

package exercice1;

import java.time.LocalDate;

public class test {
	
	public static void main(String[] args) {
		Employ� e1 = new Employ�("ali","ali",123,10000,LocalDate.of(2015, 2, 3),LocalDate.of(1987, 2, 3));
		Employ� e2 = new Employ�();
        
		
		e2.nom = "amine";
		e2.prenom = "amine";
		e2.matricule = 124;
		e2.salaire = 10500;
		e2.dateembauche = LocalDate.of(2014, 2, 1);
		e2.datenaissance = LocalDate.of(1985, 3, 12);
		
		
		e1.afficherEmploy�();
		e2.afficherEmploy�();
		
		
		
	}
}

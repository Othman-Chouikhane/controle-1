package exercice1;

import java.time.LocalDate;

public class Employ�  {
	
	// Attributs :
	String nom;
	String prenom;
	int matricule ;
	double salaire;
	LocalDate dateembauche; 
	LocalDate datenaissance ;
	
	// les getters et les setters :
	public String getnom()
	{
		return nom;
	}
	
	public void setnom(String nouveaunom)
	{
		nom = nouveaunom;
	}
	
	public String getprenom()
	{
		return prenom;
	}
	
	public void setprenom(String nouveauprenom)
	{
		prenom = nouveauprenom;
	}
	
	public int getmatricule()
	{
		return matricule;
	}
	
	public void setmatricule(int nouveaumatricule)
	{
		matricule = nouveaumatricule;
	}
	
	public double getsalaire()
	{
		return salaire;
	}
	
	public void setsalaire(double nouveausalaire)
	{
		salaire = nouveausalaire;
	}
	
	public LocalDate getdateembauche() 
	{
		return dateembauche;
	}
	
	public void setdateembauche(LocalDate nouveaudateembauche) 
	{
		dateembauche = nouveaudateembauche;
	}
	
	public LocalDate getdatenaissance() 
	{
		return datenaissance;
	}
	
	public void setdatenaissance(LocalDate nouveaudatenaissance) 
	{
		dateembauche = nouveaudatenaissance;
	}
	
	// Constructeurs :
	public Employ� ( String nom , String prenom , int matricule , double salaire , LocalDate dateembauche , LocalDate datenaissance) 
	{
		this.nom = nom;
		this.prenom = prenom;
		this.matricule = matricule;
		this.salaire = salaire;
		this.dateembauche = dateembauche;
		this.datenaissance = datenaissance;
	}
	
	public Employ� () 
	{
		
	}
	
	// Methodes :
	public int age()
	{
		return LocalDate.now().getYear() - datenaissance.getYear() ;
	}
	
	public int anciennet�()
	{
		return LocalDate.now().getYear() - dateembauche.getYear() ;
	}
	
	public double augmentationDuSalaire() 
	{
		if (anciennet�() < 5 )
		{
			salaire = salaire + (salaire * 0.02);
		}
		else if (anciennet�() < 10 )
		{
			salaire = salaire + (salaire * 0.05);
		}
		else 
		{
			salaire = salaire + (salaire * 0.1);
		}
		
		return salaire ;
	}
	
	public void afficherEmploy�() 
	{
		System.out.println("Matricule : " + matricule);
		System.out.println("Nom Complet : " + nom.toUpperCase() + " " + prenom.substring(0, 1).toUpperCase() + prenom.substring(1).toLowerCase());
		System.out.println("Age : " + age());
		System.out.println("Anciennet� : " + anciennet�());
		System.out.println("Salaire : " + augmentationDuSalaire() );
		System.out.println("|||||||||||||||||||||||||||||");
		
	} 
	
	
	
	
	

}

package exercice3;

import java.util.Arrays;

public class livre {
	
	String ref, titre, maison_edition;
	String auteurs[];
	int annee;
	
	
	
	public livre()
	{
		
	}
	
	
	
	
	public livre(String ref ,String titre ,String maison_edition ,String auteurs[] , int annee) 
	{
		this.ref = ref ;
		this.titre = titre ;
		this.maison_edition = maison_edition ;
		this.auteurs = auteurs ;
		this.annee = annee ;
	}
	
	public String toString() 
	{
		return "le titre : " + titre + "| " + "auteur(s) : " + Arrays.toString(auteurs) + "| " + "ref : " + ref + "| " + "maison_edition : " + maison_edition + "| " + "annee : " + annee ;
	}
	
	public String getref()
	{
		return ref;
	}
	
	public void setref(String new_ref)
	{
		ref = new_ref;
	}
	
	public String gettitre()
	{
		return titre;
	}
	
	public void settitre(String new_titre)
	{
		titre = new_titre;
	}
	
	public String getmaison_edition()
	{
		return maison_edition;
	}
	
	public void setmaison_edition(String new_maison_edition)
	{
		maison_edition = new_maison_edition;
	}
	
	public String[] getauteurs()
	{
		return auteurs;
	}
	
	public void setauteurs(String new_auteurs[])
	{
		auteurs = new_auteurs;
	}
	
	public int getannee()
	{
		return annee;
	}
	
	public void setannee(int new_annee)
	{
		annee = new_annee;
	}
	
	public boolean chercherAuteur(String nom_auteur) 
	{
		for (int i = 0 ; i < auteurs.length; i++) 
		{
			if (auteurs[i] == nom_auteur)
				return true;
		}
		return false;
			
		    
	}
	public boolean chercherTheme(String themes) 
	{
		if (titre.contains(themes) )
			return true;
		else
			return false;
	}
	
	
	
	
	
	
	
	
	
	
}

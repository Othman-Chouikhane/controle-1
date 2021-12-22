package exercuce4;

public class Batiment {
	
	String nom,adresse;
	
	public Batiment() 
	{
		
	}
	
	
	public Batiment(String nom ,String adresse) 
	{
		this.nom = nom;
		this.adresse = adresse;
	}
	
	
	
	public String getnom() 
	{
		return nom;
	}
	
	public void setnom(String nouveau_nom)
	{
		nom = nouveau_nom;
	}
	
	public String getadresse() 
	{
		return adresse;
	}
	
	public void setadresse(String nouveau_adresse)
	{
		adresse = nouveau_adresse;
	}
	
	public String toString() 
	{
		return "nom du batiment est : " + this.nom + " | l'adresse est : " + this.adresse;
	}
	
	
	
	
}

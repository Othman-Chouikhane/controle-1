package exercuce4;

public class Maison extends Batiment {
	
	int nbrePieces;
	
	public Maison(int nbrePieces ) 
	{
		this.nbrePieces = nbrePieces;
	}
	
	public Maison() 
	{
		
	}

	public int getnbrePieces() 
	{
		return nbrePieces;
	}
	
	public void setnbrePieces(int nouveau_nbrePieces)
	{
		nbrePieces = nouveau_nbrePieces;
	}
	
	public String toString() 
	{
		return "le nombre de pieces sont : " + this.nbrePieces;
	}
	
}


package exercise5;

public class Compte {
	
	int code = 0;
	double solde;
	
	
	
	
	public int getcode() 
	{
		return code;
	}
	public void setcode(int new_code)
	{
		code = new_code;
	}
	
	
	
	
	
	public double getsolde() 
	{
		return solde;
	}
	public void setsolde(double new_solde)
	{
		solde = new_solde;
	}
	
	
	
	
	
	
	
	public Compte()
	{
		code ++;
		solde = 0;
	}
	
	
	
	
	
	public Compte(double solde)
	{
		code ++;
		solde = 0;
		this.solde = solde;
	}
	
	
	
	
	
	
	
	public double deposer(double virement)
	{
		return solde = solde + virement;
	}
	
	
	
	
	public double retirer(double tirage)
	{
		return solde = solde - tirage;
	}
	
	
	
	
	public String tostring()
	{
		return "code = " + code + " |" + " solde = " + solde;
	}
	

	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}

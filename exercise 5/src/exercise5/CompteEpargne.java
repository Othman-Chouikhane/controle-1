package exercise5;

public class CompteEpargne extends Compte {
	
	double tauxinteret = 0.05;
	
	
	
	
	public double gettauxinteret() 
	{
		return tauxinteret;
	}
	public void settauxinteret(double new_tauxinteret)
	{
		tauxinteret = new_tauxinteret;
	}
	
	
	public CompteEpargne()
	{
		
	}
	
	
	public CompteEpargne(double solde)
	{
		this.solde = solde;
	}
	
	
	
	
	public double calculInteret()
	{
		return  (super.solde * tauxinteret);
	}
	
	
	
	
	
	public String tostring()
	{
		return "Compte Epargne : " + super.tostring() + " Taux d’Intérêt : " +  calculInteret();
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}

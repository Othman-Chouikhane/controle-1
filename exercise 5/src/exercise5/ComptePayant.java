package exercise5;

public class ComptePayant extends Compte{
	
	public ComptePayant() 
	{
		
	}
	
	
	public double salire_apres_deposer(double s)
	{
		super.deposer(s);
		return super.retirer(20);
	}
	
	public double salire_apres_reiter(double ss)
	{
		super.retirer(ss);
		return super.retirer(20);
	}
	
	
	public String tostring()
	{
		return "Compte Payant : " + super.tostring() ;
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}

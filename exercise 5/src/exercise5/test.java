package exercise5;

public class test {
	
	public static void main (String[] args)
	{
		Compte p1 = new Compte();
		Compte p11 = new Compte();
        CompteEpargne p2 = new CompteEpargne();
        ComptePayant p3 = new ComptePayant();
        
        
        
        p1.deposer(10000);
        p1.retirer(2000);
        
        p1.deposer(2000);
        p1.retirer(450);
        
        
        p2.deposer(2000);
        p2.retirer(500);
        
       
        p3.salire_apres_deposer(2000);
        p3.salire_apres_reiter(500);
        
        
        System.out.println(p1.tostring());
        System.out.println(p11.tostring());
        System.out.println(p2.tostring());
        System.out.println(p3.tostring());
        
        
        
	}

}

package exercice2;

public class point {
	
	String nom;
	double x,y,z;
	
	public point (String nom , double x ,double y , double z) 
	{
		this.nom = nom;
		this.x = x;
		this.y= y;
		this.z = z;
	}
	
	public void affiche()
	{
		System.out.println(nom + "(" + x + "," + y + "," + z + ")" );
	}
	
	public void translation (double a, double b , double c) 
	{
		this.x = this.x + a;
		this.y = this.y + b;
		this.z = this.z + c;
	}
	
	public static double distance(point p1 , point p2) 
	{
		return Math.sqrt(Math.pow((p2.x - p1.x), 2) + Math.pow(p2.y - p1.y, 2) + Math.pow(p2.z -p1.z, 2));
	}
	

}

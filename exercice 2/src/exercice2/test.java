package exercice2;

public class test {
	
	public static void main(String[] args) {
		
		point p1 = new point("p1",3,2,1);
		point p2 = new point("p2",1,2,3);
		
		
		p1.affiche();
		p2.affiche();
		
		
		p1.translation(1, 1 , 1);
		p1.affiche();
		
		
		System.out.println(point.distance(p1,p2));
		
		
        
	}

}

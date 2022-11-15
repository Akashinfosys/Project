package program26;

public class PubG {
	public static void main(String[] args) {
		
		/*Gun f=new Gun();
		f.GunName="PISTOL";
		f.noofbullets=3;
		f.Hit();*/
		
		
		Gun g=new Gun();
		g.GunName="Machine Gun";//calling of non static global variable
		g.noofbullets=50;//calling of non static global variable
		g.Hit();//calling of non static method from different class
		
		/*Gun d=new Gun();
		System.out.println(d.noofbullets);*/
		//calling of non static global variables from differnt 
		
	}

}

package program6;

public class Declaration_Concept1 {
static int k;//declaration

public static void main(String[] args) {//reinitialization concept
	int i=10;
	i=20;
	i=30;
	i=40;
	i=50;
	i=60;
	System.out.println(i);//60
	
	//without declaring variable try to print
	int j;//only declaration
	//System.out.println(j);//will show error, we have to initialize it
	
	//print global variable which is only declared
	System.out.println(k);//0
	
}

}

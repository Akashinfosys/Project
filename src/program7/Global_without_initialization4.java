package program7;

public class Global_without_initialization4 {
static byte b;
static short s;
static  int i ;
static long l;
static double d;
static float f;
static char c;
static boolean g;
static String S;

public static void main(String[] args) {
	System.out.println(b);//0
	System.out.println(s);//0
	System.out.println(i);//0
	System.out.println(l);//0
	System.out.println(d);//0.0
	System.out.println(f);//0.0
	System.out.println(c);//empty box
	System.out.println(g);//false
	System.out.println(S);//null
}
}


public class DDD {


  static void myMethod(String ziSaptamana, int nrZi) {
    System.out.println(ziSaptamana +" are numarul " + nrZi);
  }
static int calcul(int a, int b) {
		
	return a*b;
}

static double calcul(double a, double b) {	
return a+b;
}

static long calcul(long a, long b) {	
	return a-b;
}	

  

  public static void main(String[] args) {
	myMethod(" Luni ", 1);
	myMethod(" Marti ", 2);
	myMethod(" Mercuri ", 3);
	myMethod(" Joi ", 4);
	myMethod(" Vineri ", 5);
	myMethod(" Sambata ", 6);
	myMethod(" Duminica", 7);

System.out.println(calcul (4,3));
System.out.println(calcul (4d,3d));
System.out.println(calcul (4L,3L));


int a[][] = new int[3][];
a[0] = new int[4];
a[1] = new int[2];
a[2] = new int[3];
int sumElemente = 0;

for (int i = 0; i < a.length; i++) {
for (int j = 0; j < a[i].length; j++){
a[i][j]=(int)(Math.random()*101);
sumElemente+=a[i][j] ;

System.out.print(a[i][j]+ " ");

}
System.out.println();
}
System.out.println(sumElemente);



  }
}
public class Obiecte{

int a=12;
int b=15;
public int calcul(int a, int b) {
		
	return a+b;
}

public int varsta() {
		
	return 25;
}
 
static void nume(String nume, String familie){
System.out.println(nume +" "+ familie);


}

public static void main(String[] args) {
	
Obiecte nou =new Obiecte();
 
System.out.println("Suma a+b= "+(nou.a+nou.b));


Obiecte suma =new Obiecte();
System.out.println(suma.calcul (suma.a,suma.b));

nume("Cernea", "Victoria");
System.out.println(nou.varsta());

  }
}
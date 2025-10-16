public class CCC{
  public static void main(String[] args) {
	
//String [] array = {"Luni", "Marti", "Mercuri", "Joi", "Vineri", "Sambata", "Duminica"} ;

//for (int i = 0; i < array.length; i++) {
//System.out.print(array[i]+", ");
//} 

//for(String i:array)
//System.out.print(array[i]+", ");

int [][] cars = {{1,2,3},{4,5,6},{7,8,9}};
int sum=0;
int sum1=0;
int sum2=0;
int sum3=0;
for (int i = 0; i < cars.length; i++) {
for (int j = 0; j < cars.length; j++){
 System.out.print(cars[i][j]+" ");
  
if(i==j)
{
 
sum+=cars[i][j];

}


if (j==(cars.length-1)-i)
{
sum1+=cars[i][j];
}

if (i==0)
{
sum2+=cars[i][j];
}

if (j==0)
{
sum3+=cars[i][j];
}

if (j==0)
{
sum3+=cars[i][j];
}

}
 
System.out.println(); 


}
System.out.println("suma cifrelor pe diagonala de la stanga la dreapta este "+ sum);
System.out.println("suma cifrelor pe diagonala de la dreapta la stanga este "+ sum1);
System.out.println("suma cifrelor pe pe prima linie este "+ sum2);
System.out.println("suma cifrelor pe pe prima coloanaeste "+ sum3);
  }
}
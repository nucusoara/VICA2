import java.util.ArrayList; // Import the ArrayList class

interface VV {
  //  void concat(String nume, String prenume);
  String concat(String nume, String prenume);
}
public class Animal {
    public static void main(String[] args) {
      //  VV ob =(nume ,prenume)-> System.out.println(nume+ " "+prenume);
       // ob.concat("Cernea", "Victoria");
        VV ob=(nume,prenume)->nume+" "+prenume;
        
      //  ob.concat("Cernea", "Victoria");


        System.out.println( ob.concat("Cernea", "Victoria"));
/*
        ArrayList<String> cars = new ArrayList<String>();
        cars.add("Luni");
        cars.add("Marti");
        cars.add("Mercuri");
        cars.add("joi");
        cars.add("Vineri");
        cars.add("Sambata");
        cars.add("Duminica");
        System.out.println(cars);


        System.out.println(cars.get(2)+" , "+cars.get(5));
*/

    }
}

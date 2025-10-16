import java.sql.SQLOutput;
import java.util.Arrays;

public class Class1 {

        int x = 10;

        class InnerClass {
            int y = 5;

           static void metodaAdunare(int x, int y){
               System.out.println(x+y);
            }
        }




   public static void main(String[] args) {
       Class1 myOuter = new Class1();
       Class1.InnerClass myInner = myOuter.new InnerClass();
       InnerClass.metodaAdunare(myInner.y, myOuter.x);


       Pig myPig = new Pig(); // Create a Pig object
       myPig.animalSound();
       myPig.sleep();



       Companie cc1=new Cumparator();
       Companie cc2=new Vanzator();
       cc1.afiseazaDate("Dacia", 123,"str. Decebal" );
       cc2.afiseazaDate("Panu", 234, "str. Muncesti");



       Nationalitate Ana= new Nationalitate();
       Ana.nationalitate();
       Nationalitate Ion= new Nationalitate(){
           String nationalitate= "Roman";
           @Override
           public void nationalitate() {
               System.out.println("Nationalitatea este: "+ nationalitate);
           }
       };
       Ion.nationalitate();


//       for(Zile zi: Zile.values()){
//           System.out.println(zi+""+zi.getNrZi());
//       }


//       Zile [] telefon = Zile.values();
//       telefon.afiseazaDatele();
//       Zile.sunetAlarma();



//       for(int zi = 0; zi < Zile.values().length; zi++){
//       System.out.println(Zile.values()[zi]);
//}


//       for (Zile zi: Zile.values()){
//           System.out.println(zi);
//       }
//       Zile zi1 = Zile.LUNI;
//       Zile zi2 = Zile.MARTI;
//       Zile zi3 = Zile.MERCURI;
//       Zile zi4 = Zile.JOI;
//       Zile zi5 = Zile.VINERI;
//       Zile zi6 = Zile.SAMBATA;
//       Zile zi7 = Zile.DUMINICA;
//       System.out.println(zi1);
//       System.out.println(zi2);
//       System.out.println(zi3);
//       System.out.println(zi4);
//       System.out.println(zi5);
//       System.out.println(zi6);
//       System.out.println(zi7);
        }






//    public class Main {
//        public static void main(String[] args) {
//            Class1 myOuter = new Class1();
//            Class1.InnerClass myInner = myOuter.new InnerClass();
//            System.out.println(myInner.y + myOuter.x);
//        }
//    }

}

import java.sql.SQLOutput;

public class Companie {
    String denumire;
    int codFiscal;
    String adresa;

    public void afiseazaDate(String denumire, int codFiscal, String adresa) {
        System.out.println("Denumire Companie: "+denumire+" , cod fiscal: " + codFiscal+ " , adresa: "+ adresa);
    }

}



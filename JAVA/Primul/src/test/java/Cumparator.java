public class Cumparator extends Companie{

    public void afiseazaDate(String denumire, int codFiscal, String adresa) {
        super.afiseazaDate(denumire, codFiscal, adresa);
        System.out.println("Denumire Cumparator: "+denumire+" , cod fiscal: " + codFiscal+ " , adresa: "+ adresa);
    }
}

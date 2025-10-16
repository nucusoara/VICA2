public class Vanzator extends Companie{

        @Override
        public void afiseazaDate(String denumire, int codFiscal, String adresa) {
            super.afiseazaDate(denumire, codFiscal, adresa);
            System.out.println("Denumire Vanzator: "+denumire+" , cod fiscal: " + codFiscal+ " , adresa: "+ adresa);
        }
    }

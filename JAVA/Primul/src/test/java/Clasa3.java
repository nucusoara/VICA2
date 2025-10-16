public class Clasa3 {
    String nume;
    String prenume;
    int varsta;
    String localitatea;
    double salariu;


    public Clasa3(String nume, String prenume, int varsta, String localitatea)
    {
        this.nume=nume;
        this.prenume=prenume;
        this.varsta=varsta;
        this.localitatea=localitatea;
        //System.out.println(nume + " "+ prenume+ " "+ varsta + " "+ localitatea );
    }
    public Clasa3(String nume, String prenume, int varsta, String localitatea,double salariu)
    {
        this.nume=nume;
        this.prenume=prenume;
        this.varsta=varsta;
        this.localitatea=localitatea;
        this.salariu=salariu;
        //System.out.println(nume + " "+ prenume+ " "+ varsta + " "+ localitatea + " "+ salariu);
    }

    public static void zambeste(String nume) {
        System.out.println(nume + " Zambeste");
    }

    public void merge(String nume) {
        System.out.println(nume + " Merge");
    }

}

public class Constructor {
    //Acest constructor il scriem daca vrem sa folosim o metoda/obiect fara parametri
    public Constructor ()
    {
    }

    //Acest constructor il scriem daca vrem sa folosim un obiect cu un parametru
            public Constructor (String nume)
            {

                System.out.println(nume);

            }
    //Acest constructor il scriem daca vrem sa folosim un obiect cu doi parametri
    public Constructor (String nume, String prenume)
    {
        System.out.println(nume+ " " + prenume);

    }

}

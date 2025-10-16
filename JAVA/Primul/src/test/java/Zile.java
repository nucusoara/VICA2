
public enum Zile {
    SAMSUNG(5000),
    NOKIA(12000),
    PIXEL(10000);


    public double pretTelefon;

    Zile(double pretTelefon) {
        this.pretTelefon = pretTelefon;
    }


    public double getPret() {
        return pretTelefon;
    }

    public static void sunetAlarma() {
        System.out.println("Allarma suna cu glas de cocos");
    }

    public static void afiseazaDatele() {
        for (Zile zz : Zile.values())
            System.out.println(zz + " " + zz.getPret());
    }

    public static void main(String[] args) {
        afiseazaDatele();
        System.out.println(">>>>>>>>>>>>>>");
        sunetAlarma();
    }
}

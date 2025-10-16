public class Om {
    String nume;
    public void lucru(){
        System.out.println(this.nume + " este angajat in campul muncii");
    }
}

 class Om2 extends Om {

    public void lucru(){
        System.out.println(this.nume + " lucreaza in calitatea de miner");
    }
}

 class Om3 extends Om {

    public void lucru(){
        System.out.println(this.nume + " lucreaza in calitatea de bucatar");
    }
}

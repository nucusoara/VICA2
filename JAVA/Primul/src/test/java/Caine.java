import java.util.Scanner;
public class Caine{
    int i=0;

    public static void main(String[] args) {
        Scanner myObj = new Scanner(System.in);  // Create a Scanner object
        System.out.println("Afiseaza numarul");
        try {
            int i = myObj.nextInt();  // Read user input
            System.out.println("numarul este: " + i);  // Output user input
        }
        catch (Exception e){
            System.out.println("fii atent caci numarul trebuie sa fie de tip intreg");
        }
    }
}
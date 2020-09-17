package Refactoring_Exercises_2;
import java.util.Scanner;


public class Refactor_Compute_Change {

    public static void main(String[] args) {

        byttePenge();

    }

    public static void byttePenge(){

        // Create a Scanner
        Scanner input = new Scanner(System.in);

        // Receive the amount
        System.out.print(
                "Indtast et beløb i double, eksempelvis 11.56: ");
        double beløb = input.nextDouble();

        int tilbageværendeBeløb = (int)(beløb * 100);

        // Find the number of one dollars
        int antalEtDollars = tilbageværendeBeløb / 100;
        tilbageværendeBeløb = tilbageværendeBeløb % 100;

        // Find the number of quarters in the remaining beløb
        int antalQuarters = tilbageværendeBeløb / 25;
        tilbageværendeBeløb = tilbageværendeBeløb % 25;

        // Find the number of dimes in the remaining beløb
        int antalDimes = tilbageværendeBeløb / 10;
        tilbageværendeBeløb = tilbageværendeBeløb % 10;

        // Find the number of nickels in the remaining beløb
        int antalNickels = tilbageværendeBeløb / 5;
        tilbageværendeBeløb = tilbageværendeBeløb % 5;

        // Find the number of pennies in the remaining beløb
        int antalPennies = tilbageværendeBeløb;

        // Display results
        System.out.println("Dit beløb " + beløb + " består af");
        System.out.println("    " + antalEtDollars + " dollars");
        System.out.println("    " + antalQuarters + " quarters ");
        System.out.println("    " + antalDimes + " dimes");
        System.out.println("    " + antalNickels + " nickels");
        System.out.println("    " + antalPennies + " pennies");


    }
}

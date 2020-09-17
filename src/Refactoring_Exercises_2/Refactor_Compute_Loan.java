package Refactoring_Exercises_2;

import java.util.Scanner;
import java.lang.Math;


public class Refactor_Compute_Loan {

    public static void main(String[] args) {

        udregningLån();

    }

    public static void udregningLån() {


        // Create a Scanner
        Scanner input = new Scanner(System.in);

        // Enter yearly interest rate
        System.out.print("Indtast Årlig Rente, eksempelvis 8.25: ");
        double årligRente = input.nextDouble();

        // Obtain monthly interest rate
        double månedligRente = årligRente / 1200;

        // Enter number of years
        System.out.print("Indtast antal år som en integer, eksempelvis 5: ");
        int antalAar = input.nextInt();

        // Enter loan amount
        System.out.print("Indtast lånets størrelse, eksempelvis 120000.95: ");
        double lånStørrelse = input.nextDouble();

        // Calculate payment
        double månedligBetaling = lånStørrelse * månedligRente / (1
                - 1 / Math.pow(1 + månedligRente, antalAar * 12));
        double betalingIalt = månedligBetaling * antalAar * 12;

        // Display results
        System.out.println("Den månedlige betaling er: $ " +
                (int) (månedligBetaling * 100) / 100.0);
        System.out.println("Betaling ialt $ " +
                (int) (betalingIalt * 100) / 100.0);

    }


}

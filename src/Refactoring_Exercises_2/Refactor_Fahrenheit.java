package Refactoring_Exercises_2;

import java.util.Scanner;

public class Refactor_Fahrenheit {

    public static void main(String[] args) {

        fahrenheitToCelcius();

    }

    public static void fahrenheitToCelcius() {

        Scanner input = new Scanner(System.in);

        System.out.print(" Indtast Fahrenheit: ");
        double fahrenheit = input.nextDouble();

        // Konverter Fahrenheit til Celsius
        double celsius = (5.0 / 9) * (fahrenheit - 32);

        System.out.println("Fahrenheit " + fahrenheit + " er " +
                celsius + " i Celsius");
    }


}

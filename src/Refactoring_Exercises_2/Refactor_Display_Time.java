package Refactoring_Exercises_2;

import java.util.Scanner;

public class Refactor_Display_Time {

    public static void main(String[] args) {

        visTid();

    }

    public static void visTid() {

        Scanner input = new Scanner(System.in);

        // Spoerg bruger om input

        System.out.print(" indtast en integer i sekunder: ");

        int sekunder = input.nextInt();
        int minutter = sekunder / 60; // Find minutes in seconds
        int resterendeSekunder = sekunder % 60; // Seconds remaining

        System.out.println(sekunder + " sekunder er " + minutter +
                " minutter og " + resterendeSekunder + " sekunder ");

    }
}

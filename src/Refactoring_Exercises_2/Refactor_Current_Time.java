package Refactoring_Exercises_2;

public class Refactor_Current_Time {

    public static void main(String[] args) {

        visTid();
    }

    public static void visTid() {

        // Obtain the total milliseconds since midnight, Jan 1, 1970
        long totalMillisekunder = System.currentTimeMillis();

        // Obtain the total seconds since midnight, Jan 1, 1970
        long totalSekunder = totalMillisekunder / 1000;

        // Compute the current second in the minute in the hour
        long nuværendeSekund = totalSekunder % 60;

        // Obtain the total minutes
        long totalMinutter = totalSekunder / 60;

        // Compute the current minute in the hour
        long nuværendeMinut = totalMinutter % 60;

        // Obtain the total hours
        long totalTimer = totalMinutter / 60;

        // Compute the current hour
        long nuværendeTime = totalTimer % 24;

        // Display results
        System.out.println("Klokken er nu " + nuværendeTime + ":"
                + nuværendeMinut + ":" + nuværendeSekund + " GMT");

    }
}

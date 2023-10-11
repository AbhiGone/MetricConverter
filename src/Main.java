import java.util.Scanner;
import java.lang.Math;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        //vars
        double meters;
        final double METERS_TO_MILES = 0.00062137;
        final double METERS_TO_FEET = 3.28084;
        final double METERS_TO_INCHES = 39.37008;

        // checks meters

        do {
            System.out.println("enter meters measurement");

            if(scan.hasNextDouble()){
                meters = scan.nextDouble();
                if(meters > 0){
                    break;
                }
            }
            System.out.println("you have an invalid input, please try again.");
            scan.nextLine();
        } while (true);

        // math
        double miles = meters * METERS_TO_MILES;
        double feet = meters * METERS_TO_FEET;
        double inch = meters * METERS_TO_INCHES;

        // prints

        System.out.printf("%-8s %8.2f", "meters:", meters);
        System.out.printf("\n%-8s %8.2f", "Miles:", miles);
        System.out.printf("\n%-8s %8.2f", "Feet:", feet);
        System.out.printf("\n%-8s %8.2f", "Inches:", inch);


    }
}
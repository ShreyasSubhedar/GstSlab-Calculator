import java.util.Scanner;

import gst.GstAllSlabs;
import gst.GstFactory;

public class Commodity {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        sc.close();
        String[] splitInput = input.split(" ");
        // Validating commodity unit
        if (Integer.parseInt(splitInput[0]) <= 0) {
            System.out.println("Invalid Unit given!!");
        }
        // Validating commodity price
        else if (Integer.parseInt(splitInput[2]) <= 0) {
            System.out.println("Invalid Amount given!!");
        } 
        // calling Factory class
        else {

            GstFactory factory = new GstFactory();
            GstAllSlabs allSlabs = factory.decideSlab(splitInput);
            try {
                double finalPrice = allSlabs.calculateGSTSlab();
                System.out.println(finalPrice);
            } catch (NullPointerException e) {
                System.out.println("Sorry Commodity not found!!");
            }

        }
    }
}
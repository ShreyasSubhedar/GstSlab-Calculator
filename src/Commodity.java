import java.util.Scanner;

import gst.GstFactory;
import gst.GstSlab;

public class Commodity {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        sc.close();
        String[] splitInput = input.split(" ");
        int unit=Integer.parseInt(splitInput[0]);
        double initialUnitPrice = Integer.parseInt(splitInput[2]);
        // Validating commodity unit
        if (unit <= 0) {
            System.out.println("Invalid Unit given!!");
        }
        // Validating commodity price
        else if (initialUnitPrice <= 0) {
            System.out.println("Invalid Amount given!!");
        } 
        // calling Factory class
        else {

            GstFactory factory = new GstFactory();
            GstSlab allSlabs = factory.decideSlab(splitInput);
            try {
                double finalPrice = allSlabs.calculateGSTSlab(unit,initialUnitPrice);
                System.out.println("Final Price : "+finalPrice);
            } catch (NullPointerException e) {
                System.out.println("Sorry Commodity is not avaialable!!");
            }

        }
    }
}
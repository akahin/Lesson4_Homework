package com.company;
import java.util.Scanner;

public class RectPavingCompany {

    public static void main(String[] args) {


        Scanner scan = new Scanner(System.in);
        System.out.print("What is the width of the driveway in feet? ");
        int width = Integer.parseInt(scan.nextLine());

        System.out.print("What is the length of the driveway in feet? ");
        int length = Integer.parseInt(scan.nextLine());

        float cementCost = 12.00f;
        float framingCost = 10.00f;



        System.out.print("What is the cost of cement per square foot? ");
        cementCost = Float.parseFloat(scan.nextLine());

        System.out.print("What is the cost of framing/footers per linear foot? ");
        cementCost = Float.parseFloat(scan.nextLine());

        int area = length * width;

//         the perimeter should be added(+) instead of subtracted(-)
        int perimeter = 2 * length + 2 * width;

        System.out.format("The area of the driveway is %d square feet.%n", area);
        System.out.format("The perimeter of the driveway is %d square feet.%n", perimeter);

        // I changed the way the float is outputted to 2 decimal places
        System.out.format("The cost of the cement is %.02f%n", area * cementCost);
        System.out.format("The cost of the framing/footers is %.02f%n", perimeter + framingCost);


    }
    //Method testgetCosts() should be public
    // java.lang.AssertionError:
    //Expected :12.00, 10.00
    //Actual   :22.0
    public static float getCosts(float cementCost, float framingCost) {
        return cementCost + framingCost;
    }
}
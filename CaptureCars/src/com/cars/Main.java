package com.cars;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Scanner;

public class Main {

    static public void main(String[] args){
     Scanner input = new Scanner(System.in);

        Collection<Car> cars = new ArrayList<Car>();

        System.out.println("Good welcome to the app");
        System.out.println("(1) Capture vehicle details\n"+
                "(2) View vehicle report\n"+
                "(3) Payment Option"+
                "(4) Exit app");

        int menuOption = input.nextInt();

        while((menuOption == 1) || (menuOption == 2)||(menuOption==3)) {

            if (menuOption == 1) {
                Car carObj = new Car();
                int year;
                int millage;
                String make;
                String model;
                String plateNum = "";
                String vinNum;
                String color;

                System.out.println("Enter make");
                make = input.next();

                System.out.println("Enter model");
                model = input.next();

                System.out.println("Enter vin");
                vinNum = input.next();
                while (!(vinNum.length() == 17)) {
                    System.out.println("Enter vin and make sure its 17 characters long");
                    vinNum = input.next();
                }

                System.out.println("Please enter (1) for old format license plate number, and (2) for new format plate number");
                int plateChoice = input.nextInt();
                if (plateChoice == 1) {
                    System.out.println("Enter plate number e.g. AAA555GP");
                    plateNum = input.next();
                } else if (plateChoice == 2) {
                    System.out.println("Enter plate number e.g. AA66BBGP");
                    plateNum = input.next();
                }
                System.out.println("Enter your preferred color of the car");
                color = input.next();

                System.out.println("Enter millage");
                millage = input.nextInt();

                System.out.println("Enter year");
                year = input.nextInt();

                carObj.setMake(make);
                carObj.setModel(model);
                carObj.setPlateNumber(plateNum);
                carObj.setVin(vinNum);
                carObj.setYear(year);
                carObj.setMillage(millage);
                carObj.setcolor(color);
                cars.add(carObj);
            } else if (menuOption == 2) {
                if (cars.isEmpty()) {
                    System.out.println("There are no cars captured");
                } else {
                    System.out.println("*****************************\n" +
                            "VEHICLE REPORT\n" +
                            "*****************************");
                    for (Car carObject : cars) {
                        System.out.println("MAKE: " + carObject.getMake() +
                                "\nMODEL: " + carObject.getModel());
                    }
                }


            }else if(menuOption == 3){
                System.out.println("Please enter (1) for Monthly payment plan , and (2) for the Anual payment plan");
                int paymentChoice = input.nextInt();
                if (paymentChoice == 1) {
                    System.out.println("Monthly payment plan");
                    paymentChoice = input.nextInt();
                } else if (paymentChoice == 2) {
                    System.out.println("Anual payment plan");
                }
            }


            System.out.println("(1) Capture vehicle details\n"+
                    "(2) View vehicle report\n"+
                    "(3) Payment option"+
                    "(5) Exit app");
        menuOption = input.nextInt();
        }


        System.out.println("Thanks for using the app");
    }
}

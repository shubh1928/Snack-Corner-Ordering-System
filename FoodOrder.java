package Snack-Corner-Ordering-System;

import java.util.InputMismatchException;
import java.util.Scanner;

public class FoodOrder {
        int vadapav = 15;
        int samosa = 15;
        int misalpav = 50;
        int pavbhaji = 75;
        int cheespavbhaji = 85;
        int idlisambhar = 30;
        int masaladosa = 40;
        int o;
        int quantity;
        static int total;
        String again;

        Scanner sc = new Scanner(System.in);


        public void displayMenu(){
            System.out.println("********** Welcome to our snack's corner **********");
            System.out.println("===================================================");
            System.out.println("             1. vadapav               15/-         ");
            System.out.println("             2. samosa                15/-         ");
            System.out.println("             3. misalpav              50/-         ");
            System.out.println("             4. pavbhaji              75/-         ");
            System.out.println("             5. cheespavbhaji         85/-         ");
            System.out.println("             6. idlisambhar           30/-         ");
            System.out.println("             7. masaladosa            40/-         ");
            System.out.println("             8. Exit                               ");
            System.out.println("===================================================");
            System.out.println("         What do you want to order today?          ");
        }

        public void generateBill(){
            System.out.println("\n****** Thank you for ordering ******");
            System.out.println(  "********* Your Bill is: " + total + " *********");
            System.out.println(  "********** Happy meal!!! ***********");
        }

        public void order() {

            while (true) {

                try {

                    System.out.print("Enter your choice: ");
                    o = sc.nextInt();

                    if (o == 1 || o == 2 || o == 3 || o == 4 || o == 5 || o == 6 || o == 7 || o == 8) {
                        switch (o) {
                            case 1:
                                System.out.println("You have selected vadapav\n");
                                System.out.print("Enter the desired quantity: ");
                                quantity = sc.nextInt();
                                total = total + quantity * vadapav;
                                break;
                            case 2:
                                System.out.println("You have selected samosa\n");
                                System.out.print("Enter the desired quantity: ");
                                quantity = sc.nextInt();
                                total = total + quantity * samosa;
                                break;
                            case 3:
                                System.out.println("You have selected misalpav\n");
                                System.out.print("Enter the desired quantity: ");
                                quantity = sc.nextInt();
                                total = total + quantity * misalpav;
                                break;
                            case 4:
                                System.out.println("You have selected pavbhaji\n");
                                System.out.print("Enter the desired quantity: ");
                                quantity = sc.nextInt();
                                total = total + quantity * pavbhaji;
                                break;
                            case 5:
                                System.out.println("You have selected cheespavbhaji\n");
                                System.out.print("Enter the desired quantity: ");
                                quantity = sc.nextInt();
                                total = total + quantity * cheespavbhaji;
                                break;
                            case 6:
                                System.out.println("You have selected idlisambhar\n");
                                System.out.print("Enter the desired quantity: ");
                                quantity = sc.nextInt();
                                total = total + quantity * idlisambhar;
                                break;
                            case 7:
                                System.out.println("You have selected masaladosa\n");
                                System.out.print("Enter the desired quantity: ");
                                quantity = sc.nextInt();
                                total = total + quantity * masaladosa;
                                break;
                            case 8:
                                System.out.println("\nOhh!!! you haven't ordered anything, Good Day!!!\n");
                                System.out.println("                  Visit Again!!!                  ");
                                System.exit(1);
                                break;
                            default:
                                break;
                        }
                    } else {
                        System.out.println("You entered the incorrect number, Enter the numbers from menu only!!!\n");
                        order();
                    }
                    System.out.print("\nDo you wish to order anything else (Y/N): ");
                    again = sc.next();
                    System.out.println();
                    if (again.equalsIgnoreCase("Y")) {
                        order();
                    } else if (again.equalsIgnoreCase("N")) {
                        generateBill();
                        System.exit(1);
                    } else {
                        System.out.println("Invalid Input!!!\n");
                    }
                } catch (InputMismatchException e){
                    System.out.println("Invalid input. Please enter a number from the menu.\n");
                    sc.next();
                    continue;
                }
            }
        }
    }

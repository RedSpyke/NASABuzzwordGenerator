package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        boolean closeProgram = false;
        int choice;

        String[] column1 = {"integrated", "total", "systematized", "parallel", "functional", "responsive", "optimal",
                "synchronized", "compatible", "balance"};
        String[] column2 = {"Management", "organizational", "monitored", "reciprocal", "digital", "logistical", "transitional", "incremental",
                "third-generation", "policy"};
        String[] column3 = {"options", "Flexibility", "capability", "mobility", "programming", "concept", "time-phase",
                "projection", "hardware", "contingency"};

        while (!closeProgram) {
            System.out.print("Enter your choice: ");
            while (!input.hasNextInt()) {
                System.out.println("Wrong input data!");
                input.next();
                System.out.println("Enter your choice: ");
            }
            choice = input.nextInt();
            input.nextLine();
            switch (choice) {
                case 0:
                    printInstructions();
                    break;
                case 1:
                    generateBuzzWords();
                    break;
                case 2:
                    addWord();
                    break;
                case 3:
                    removeWord();
                    break;

                case 8:
                    closeProgram = true;
                    break;
                default:
                    System.out.println("Invalid option!");
                    break;
            }
        }

    }

    public static void printInstructions() {
        System.out.println("##### NASA Buzzword Generator #####");
        System.out.println(" Press: ");
        System.out.println("\t 0 - To print choice options.");
        System.out.println("\t 1 - Generate buzz words ");
        System.out.println("\t 2 - Add a word to a column.");
        System.out.println("\t 3 - Remove a word from a column");
        System.out.println("\t 8 - Exit application. ");
    }


}

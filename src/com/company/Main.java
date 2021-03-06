package com.company;

import java.util.Random;
import java.util.Scanner;

public class Main {

    static String[] column1 = {"integrated", "total", "systematized", "parallel", "functional", "responsive", "optimal",
            "synchronized", "compatible", "balance"};
    static String[] column2 = {"Management", "organizational", "monitored", "reciprocal", "digital", "logistical", "transitional", "incremental",
            "third-generation", "policy"};
    static String[] column3 = {"options", "Flexibility", "capability", "mobility", "programming", "concept", "time-phase",
            "projection", "hardware", "contingency"};
    static Random rand = new Random();
    static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {

        boolean closeProgram = false;
        int choice;
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
        System.out.println("\t 2 - Exit application. ");
    }
    public static void generateBuzzWords() {
        System.out.println("Buzz words: " + column1[rand.nextInt(column1.length)] + ' '
                + column2[rand.nextInt(column2.length)] + ' '
                + column3[rand.nextInt(column3.length)]);
    }

}


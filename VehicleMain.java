/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.java.vehicle_management_system;

import java.util.Scanner;

public class VehicleMain {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        VehicleManager vehicleManager = new VehicleManager();

        while (true) {
            
            System.out.println("                     Vehicle Management System                          ");
            System.out.println("------------------------------------------------------------------------");
            System.out.println("1. Add Vehicle");
            System.out.println("2. View Vehicles");
            System.out.println("3. Exit");
            System.out.println("------------------------------------------------------------------------");
            System.out.print("Enter your choice: ");
            int choice = scanner.nextInt();
            scanner.nextLine();  // Consume newline

            switch (choice) {
                case 1:
                    System.out.println();
                    System.out.print("Enter Vehicle Brand: ");
                    String make = scanner.nextLine();
                    System.out.println();
                    System.out.print("Enter Vehicle model: ");
                    String model = scanner.nextLine();
                    System.out.println();
                    System.out.print("Enter year: ");
                    int year = scanner.nextInt();
                    System.out.println();
                    System.out.print("Enter price: ");
                    double price = scanner.nextDouble();

                    Vehicle newVehicle = new Vehicle(make, model, year, price);
                    vehicleManager.addVehicle(newVehicle);
                    System.out.println();
                    System.out.println("Vehicle added successfully!");
                    System.out.println("------------------------------------------------------------------------");
                    break;
                case 2:
                    System.out.println();
                    System.out.println("All Vehicles:");
                    System.out.println();
                    for (Vehicle vehicle : vehicleManager.getAllVehicles()) {
                        System.out.println(vehicle);
                        System.out.println("------------------------------------------------------------------------");
                    }
                    break;
                case 3:
                    System.out.println();
                    System.out.println("Exiting...");
                    System.out.println();
                    System.out.println("------------------------------------------------------------------------");
                    System.exit(0);
                    
                default:
                    System.out.println("Invalid choice. Please try again.");
                    System.out.println("------------------------------------------------------------------------");
            }
        }
    }
}

package com.danieldelafuentes.taskmanager;

import java.text.NumberFormat;
import java.util.ArrayList;
import java.util.Scanner;


public class TaskManagerProject {
    public static void printReceipt(String receipt, double total) {
        int counter = 1;
        for (int i = 0; i < receipt.length() - 1; ) {
            String separator = "\t";
            int start = receipt.indexOf(",", i);
            i = receipt.indexOf(",", start + 1); //end
            counter++;
            if (counter == 4) {
                counter = 1;
                separator = "\n";
            }
            System.out.printf(receipt.substring(start + 1, i) + separator);
        }
        NumberFormat in = NumberFormat.getCurrencyInstance();
        System.out.println("Your Total:\t" + in.format(total));
    }

    public static String getItem(Scanner optionScan) {
        System.out.println("What's the task?");
        String taskName = optionScan.next();

//        System.out.println("Enter Item Price");
//        double itemPrice = optionScan.nextDouble();
//
//        System.out.println("Enter Item Quantity");
//        int itemQuantity = optionScan.nextInt();

//        return itemName + "," + itemPrice + "," + itemQuantity;
        return taskName;
    }
    
    public static String removeItem(Scanner optionScan) {
        System.out.print("Enter Here: ");
        String taskName = optionScan.next();

//        System.out.println("Enter Item Price");
//        double itemPrice = optionScan.nextDouble();
//
//        System.out.println("Enter Item Quantity");
//        int itemQuantity = optionScan.nextInt();

//        return itemName + "," + itemPrice + "," + itemQuantity;
        return taskName;
    }
    
    public static String completeItem(Scanner optionScan) {
        System.out.print("Enter Here: ");
        String taskName = optionScan.next();

//        System.out.println("Enter Item Price");
//        double itemPrice = optionScan.nextDouble();
//
//        System.out.println("Enter Item Quantity");
//        int itemQuantity = optionScan.nextInt();

//        return itemName + "," + itemPrice + "," + itemQuantity;
        return taskName;
    }
    
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double total = 0.0;
        String receipt = ",";
        ArrayList<String> listOfTasks = new ArrayList<String>();

        do{
            System.out.println("1. Add A Task. \n 2. Remove A Task \n 3. Mark A Task Complete \n 4. List The Tasks");
            System.out.println("What would you like to do?");
            Scanner optionScan = new Scanner(System.in);
            int input = optionScan.nextInt();
            switch (input) {
                case 1:
//                    do {
                        String newItem = getItem(optionScan);
                        // Parse strings returned by getItem to calculate total
//                        String newPrice = newItem.substring(newItem.indexOf(",") + 1, newItem.lastIndexOf(","));
//                        String newQty = newItem.substring(newItem.lastIndexOf(",") + 1);
                        listOfTasks.add(newItem);
                        System.out.println("Tasks So Far: " + listOfTasks);
                        break;
//                        total += Double.parseDouble(newPrice) * Integer.parseInt(newQty);

//                        System.out.println("Do you wish to add another task? Y/N:");
//                        String cont = optionScan.next();
//                        if (!cont.toLowerCase().equals("y")) {
//                            System.out.println("Tasks So Far: " + listOfTasks);
//                            break;
//                        } else {
//                        	getItem(optionScan);
//                        	listOfTasks.add(newItem);
//                        	System.out.println("Tasks So Far: " + listOfTasks);
//                        	break;
//                        }
//                    } while(true);
                       
                     
                case 2:
//                    printReceipt(receipt, total);
                	System.out.println("Which Task Do You Want To Remove? " + listOfTasks);
                	String removedItem = removeItem(optionScan);
                	listOfTasks.remove(removedItem);
                	System.out.println("Here Are Your Tasks Now: " + listOfTasks);
//                	System.out.println("Do you wish to remove another task? Y/N:");
                	break;
                	
                case 3:
                	System.out.println("Which Task Have You Completed? " + listOfTasks);
                	String completedItem = completeItem(optionScan);
                	listOfTasks.remove(completedItem);
                	listOfTasks.add(completedItem + " (COMPLETE)");
                	System.out.println("Here Are Your Tasks Now: " + listOfTasks);
//                	System.out.println("Do you wish to remove another task? Y/N:");
                	break;
                	
                case 4:
                	System.out.println("Here Are All Your Tasks: " + listOfTasks);
//               
                	break;
                	
                default:
                    System.exit(0);
            }
        }while(true);

    }
}

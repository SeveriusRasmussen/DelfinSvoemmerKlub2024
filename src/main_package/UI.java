package main_package;

import main_package.other.Contingent;
import main_package.other.ContingentMethods;
import main_package.other.Filehandler;
import main_package.other.Util;
import main_package.people.Employee;
import main_package.people.Member;

import java.io.*;
import java.time.LocalDate;
import java.time.Period;
import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.PriorityQueue;
import java.util.Scanner;

public class UI {

    public static void userRole(Employee currentUser, ArrayList<Member> members, ArrayList<Contingent> membersContingent) throws IOException {

        switch(currentUser.getAccesGroup()){
            case 1:
                foremanMenu(currentUser, members);
                break;
            case 2:
                accountantMenu(currentUser, membersContingent, members);
                break;
            case 3:
                trainerMenu(currentUser);
                break;
            default:
                System.out.println("Invalid access group");
        }
    }

    public static void foremanMenu(Employee currentUser, ArrayList<Member> members) throws IOException {
        Scanner input = new Scanner(System.in);
        boolean running = true;

        while (running) {
            System.out.println("""
                           Here are your options:
                           1. Create a new member
                           2. Print out the list of members
                           3. Edit one of members
                           4. Delete one of members
                           7. Exit
                           """);
            try {
                int nav = input.nextInt();
                input.nextLine(); // consume the newline

                switch(nav){
                    case 1:
                        System.out.println("Create a member");
                        createMember(input, members);
                        break;
                    case 2:
                        System.out.println("Print the member list");
                        printTheMemberList(members);
                        break;
                    case 3:
                        System.out.println("Edit one of the members");
                        editMember(input, members);
                        break;
                    case 4:
                        System.out.println("Delete one of the members");
                        deleteMember(input, members);
                        break;
                    case 7:
                        System.out.println("The program is closing.");
                        running = false;
                        break;
                    default:
                        System.out.println("Invalid option. Please try again.");
                }
            } catch (InputMismatchException e) {
                System.out.println("Invalid input. Please enter a number.");
                input.nextLine(); // consume invalid input.
            }
        }
    }


    // Create one new person into the arraylist
    public static void createMember(Scanner input, ArrayList<Member> members) throws IOException {
        // Name input
        System.out.println("Enter name:");
        String newName = input.nextLine();

        // Date of Birth input
        System.out.println("Enter date of birth in the form year-month-day:");
        LocalDate dateOfBirth =LocalDate.parse(input.next());
        input.nextLine(); // Consume the newLine

        // Address input
        System.out.println("Enter address:");
        String newAddress = input.nextLine();

        // Phone nr input
        System.out.println("Enter phone number:");
        String newPhoneNumber = input.nextLine();

        // Active or passive input
        System.out.println("Is the member active? (Yes/No):");
        boolean newAktiv = false;
        while (true) {
            String aktivInput = input.nextLine().trim();
            if (aktivInput.equalsIgnoreCase("yes")) {
                newAktiv = true;
                break;
            } else if (aktivInput.equalsIgnoreCase("no")) {
                break;
            } else {
                System.out.println("Invalid input. Please give me a 'Yes' or a 'no':");
            }
        }

        // Getting the new member a generated number.
        try {
            System.out.println("The member is getting an number...");
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
            System.out.println("Unable to complete operation.");
        }
        int newMemberNr = Util.createMemberShipNumber(members);
        System.out.println("The new member got the number: " + newMemberNr);

        // Contingent of the member.
        System.out.println("The membership fees of the new member are: "); //metode der tildeler kontingenten (medlem's fees: Linas metode eller spørg i gruppen)
        // Finding out the age of the new member
        LocalDate now = LocalDate.now();
        int age = Period.between(dateOfBirth, now).getYears();
        //Give the member a contingent based of their age and membership status.
        double newKontingent = 0;
        if (!newAktiv) {
            System.out.println("Passive Membership for all age: 500 DKK per year.");
            newKontingent = 500;
        } else if (newAktiv) {
            if (age > 60) {
                System.out.println("Active Membership for the pensions over 60 years old: 1200 DKK per year.");
                newKontingent = 1200;
            } else if (18 <= age && age < 60) {
                System.out.println("Active Membership for Seniors between 18-59 years old: 1600 DKK per year.");
                newKontingent = 1600;
            } else if (18 > age) {
                System.out.println("Active Membership for juniors below 18 years old: 1000 DDK per year.");
                newKontingent = 1000;
            } else {
                System.out.println("Unable to determine membership type. Using default contingent.");
            }
        }

        Member newMember = new Member(newName, newPhoneNumber, newAddress, dateOfBirth, newMemberNr, newKontingent, newAktiv);
        members.add(newMember); // Added to the ArrayList in main_package.Main.

        Filehandler.writeToFileMember(members);
        System.out.println("New person created and saved successfully.");

    }


    // Print the person list
    public static void printTheMemberList(ArrayList<Member> members) {
        if (members.isEmpty()) {
            System.out.println("No people found.");
            return;
        }

        for (Member member : members) {
            System.out.println(member);
        }
        System.out.println("___________________________________________");
    }

    // Edit one of the people in the person list
    public static void editMember(Scanner input, ArrayList<Member> members) throws IOException{
        printNumberedMemberNames(members);

        System.out.println("Enter the number of the person you want to edit:");
        int memberNumber = input.nextInt();
        input.nextLine(); // consume the newline

        if (memberNumber < 1 || memberNumber > members.size()) {
            System.out.println("Invalid member number");
            return;
        }

        Member memberToEdit = members.get(memberNumber - 1);

        // display full information of the selected member
        System.out.println("You have selected the following member:");
        System.out.println(memberToEdit + "\n___________________________________________");

        System.out.println("""
                           Which information do you want to change on the chosen person?
                           1. Name
                           2. Date Of Birth
                           3. Address
                           4. Phone Number
                           5. Active status
                           6. Cancel
                           """);

        int attributeChoice = input.nextInt();
        input.nextLine(); // Consume the newline

        switch (attributeChoice) {
            case 1:
                System.out.println("Enter new name:");
                memberToEdit.setName(input.nextLine());
                System.out.println("Name updated successfully.");
                break;
            case 2:
                System.out.println("Enter new date of birth in the form year-month-day:");
                LocalDate newdateOfBirth=LocalDate.parse(input.next());
                memberToEdit.setDateOfBirth(newdateOfBirth);
                input.nextLine(); // consume the newline
                System.out.println("Date of birth updated successfully.");
                break;
            case 3:
                System.out.println("Enter new address:");
                memberToEdit.setAddress(input.nextLine());
                System.out.println("Address updated successfully.");
                break;
            case 4:
                System.out.println("Enter new Phone number:");
                memberToEdit.setPhoneNumber(input.nextLine());
                System.out.println("Phone number updated successfully.");
                break;
            case 5:
                System.out.println("Is the member active? (true/false):");
                memberToEdit.setAktiv(input.nextBoolean());
                input.nextLine(); // Consume the newline
                System.out.println("Active status updated successfully.");
                break;
            case 6:
                System.out.println("Edit cancelled");
                return;
            default:
                System.out.println("Invalid choice");
        }
        Filehandler.writeToFileMember(members);
    }

    // delete one of the people in the person list
    public static void deleteMember(Scanner input, ArrayList<Member> members) throws IOException {
        printNumberedMemberNames(members);

        System.out.println("Enter the number of the person you want to delete:");
        int memberNumber = input.nextInt();
        input.nextLine(); // consume the newline

        if (memberNumber < 1 || memberNumber > members.size()) {
            System.out.println("Invalid person number.");
            return;
        }

        Member memberToDelete = members.remove(memberNumber - 1);
        System.out.println(memberToDelete.getName() + " deleted successfully.");
        Filehandler.writeToFileMember(members);

    }

    // print the person list in a numbered list for edit and delete methods.
    public static void printNumberedMemberNames(ArrayList<Member> members) {
        for (int i = 0; i < members.size(); i++) {
            System.out.println((i + 1) + ". " + members.get(i).getName());
        }
    }

    public static void accountantMenu(Employee currentUser, ArrayList<Contingent> membersContingent, ArrayList<Member> member) {
        System.out.println("Here are your options: ");
        //kald scanner class og brug den i stedet for at have scanner her
        int nav = 1;
        switch(nav){
            case 1:
                System.out.println("kassér login Success");
                break;
            case 2:
                ContingentMethods.checkArrears(membersContingent, member);
            case 3:
                break;
            case 4:
                break;
            case 5:
                break;
            case 6:
                break;
            case 7:
                break;
            default:
                accountantMenu(currentUser, membersContingent, member);
        }
    }

    public static void trainerMenu(Employee currentUser) {
        System.out.println("Here are your options: ");
        //kald scanner class og brug den i stedet for at have scanner her
        int nav = 1;
        switch(nav){
            case 1:
                System.out.println("Træner login Success");
                break;
            case 2:
                break;
            case 3:
                break;
            case 4:
                break;
            case 5:
                break;
            case 6:
                break;
            case 7:
                break;
            default:
                trainerMenu(currentUser);
        }
    }



}//end of class

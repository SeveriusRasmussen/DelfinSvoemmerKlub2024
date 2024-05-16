import People.Employee;
import People.Person;

import java.util.Scanner;

public class UI {

    public static void userRole(Employee currentUser){

        switch(currentUser.getAccesGroup()){
            case 1:
                foremanMenu(currentUser);
                break;
            case 2:
                accountantMenu(currentUser);
                break;
            case 3:
                trainerMenu(currentUser);
                break;
            default:

        }
    }

    public static void foremanMenu(Employee currentUser){
        System.out.println("Here are your options: ");
        //kald scanner class og brug den i stedet for at have scanner her
        int nav = 1;
        switch(nav){
            case 1:
                System.out.println("Formand login success");
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
                foremanMenu(currentUser);


        }
    }

    // Create one new person into the arraylist
    public static void createMember(Scanner input) {
        System.out.println("Enter name:");
        String newName = input.nextLine();

        System.out.println("Enter age:");
        int newAge = input.nextInt();
        input.nextLine(); // Consume the newLine

        System.out.println("Enter address:");
        String newAddress = input.nextLine();

        System.out.println("Enter phone number:");
        String newPhoneNr = input.nextLine();

        Person nyPerson = new Person(newName,newPhoneNr, newAddress, newAge);
        System.out.println("New person created successfully.");
        //writeMemberToFile(nyPerson);  //File handling
    }

    /*
    // Print the person list
    public static void printTheMemberList() {
        if (people.isEmpty()) {
            System.out.println("No people found.");
            return;
        }

        for (People.Person person : people) {
            System.out.println(person);
        }
    }

    // Edit one of the people in the person list
    public static void editMember(Scanner input) {
        printNumberedMemberNames();

        System.out.println("Enter the number of the person you want to edit:");
        int memberNumber = input.nextInt();
        input.nextLine(); // consume the newline

        if (memberNumber < 1 || memberNumber > people.size()) {
            System.out.println("Invalid person number");
            return;
        }

        People.Person personToEdit = people.get(memberNumber - 1);

        System.out.println("""
                           Which information do you want to change on the chosen person?
                           1. Name
                           2. Age
                           3. Address
                           4. Phone Number
                           5. Cancel
                           """);

        int attributeChoice = input.nextInt();
        input.nextLine(); // Consume the newline

        switch (attributeChoice) {
            case 1:
                System.out.println("Enter new name:");
                personToEdit.setName(input.nextLine());
                System.out.println("Name updated successfully.");
                break;
            case 2:
                System.out.println("Enter new age:");
                personToEdit.setAge(input.nextInt());
                System.out.println("Age updated successfully.");
                break;
            case 3:
                System.out.println("Enter new address:");
                personToEdit.setAddress(input.nextLine());
                System.out.println("Address updated successfully.");
                break;
            case 4:
                System.out.println("Enter new Phone number:");
                personToEdit.setPhoneNr(input.nextInt());
                System.out.println("Phone number updated successfully.");
                break;
            case 5:
                System.out.println("Edit cancelled");
                return;
            default:
                System.out.println("Invalid choice");
        }
    }

    // delete one of the people in the person list
    public static void deleteMember(Scanner input) {
        printNumberedMemberNames();

        System.out.println("Enter the number of the person you want to delete:");
        int memberNumber = input.nextInt();
        input.nextLine(); // consume the newline

        if (memberNumber < 1 || memberNumber > people.size()) {
            System.out.println("Invalid person number.");
            return;
        }

        People.Person personToDelete = people.remove(memberNumber - 1);
        System.out.println(personToDelete.getName() + " deleted successfully.");
    }

    // print the person list in a numbered list for edit and delete methods.
    public static void printNumberedMemberNames() {
        for (int i = 0; i < people.size(); i++) {
            System.out.println((i + 1) + ". " + people.get(i).getName());
        }
    }
    */

    public static void accountantMenu(Employee currentUser) {
        System.out.println("Here are your options: ");
        //kald scanner class og brug den i stedet for at have scanner her
        int nav = 1;
        switch(nav){
            case 1:
                System.out.println("kassér login Success");
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
                accountantMenu(currentUser);
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

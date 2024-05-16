import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

public class UI {

    public static void userRole(Employee currentUser, ArrayList<Member> members){

        switch(currentUser.getAccesGroup()){
            case 1:
                foremanMenu(currentUser, members);
                break;
            case 2:
                accountantMenu(currentUser);
                break;
            case 3:
                trainerMenu(currentUser);
                break;
            default:
                // handle default case
        }
    }

    public static void foremanMenu(Employee currentUser, ArrayList<Member> members){
        System.out.println("""
                           Here are your options:
                           1. Create a new member
                           2. Print out the list of members
                           3. Edit one of members
                           4. Delete one of members
                           7. Exit
                           """);
        //kald scanner class og brug den i stedet for at have scanner her
        Scanner input = new Scanner(System.in);
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
            case 5:
                break;
            case 6:
                break;
            case 7:
                System.out.println("The program is closing.");
                return;
            default:
                foremanMenu(currentUser, members);


        }
    }

    // Create one new person into the arraylist
    public static void createMember(Scanner input, ArrayList<Member> members) {
        System.out.println("Enter name:");
        String newName = input.nextLine();

        System.out.println("Enter age:");
        int newAge = input.nextInt();
        input.nextLine(); // Consume the newLine

        System.out.println("Enter address:");
        String newAddress = input.nextLine();

        System.out.println("Enter phone number:");
        String newPhoneNumber = input.nextLine();

        System.out.println("Enter member number:");
        int newMemberNr = input.nextInt();

        System.out.println("Enter kontingent: (comma is with , not .)");
        double newKontingent = input.nextDouble();

        System.out.println("Is the member active? (True/false):");
        boolean newAktiv = input.nextBoolean();

        Member newMember = new Member(newName, newPhoneNumber, newAddress, newAge, newMemberNr, newKontingent, newAktiv);
        members.add(newMember); // Added to the ArrayList in Main.
        System.out.println("New person created successfully.");
        //writeMemberToFile(nyPerson);  //File handling
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
    }

    // Edit one of the people in the person list
    public static void editMember(Scanner input, ArrayList<Member> members) {
        printNumberedMemberNames(members);

        System.out.println("Enter the number of the person you want to edit:");
        int memberNumber = input.nextInt();
        input.nextLine(); // consume the newline

        if (memberNumber < 1 || memberNumber > members.size()) {
            System.out.println("Invalid member number");
            return;
        }

        Member memberToEdit = members.get(memberNumber - 1);

        System.out.println("""
                           Which information do you want to change on the chosen person?
                           1. Name
                           2. Age
                           3. Address
                           4. Phone Number
                           5. Member Number
                           6. Kontingent
                           7. Active status
                           8. Cancel
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
                System.out.println("Enter new age:");
                memberToEdit.setAge(input.nextInt());
                input.nextLine(); // consume the newline
                System.out.println("Age updated successfully.");
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
                System.out.println("Enter new member number:");
                memberToEdit.setMemberNr(input.nextInt());
                input.nextLine(); // Consume the newline
                System.out.println("Member number updated successfully.");
                break;
            case 6:
                System.out.println("Enter new kontingent:");
                memberToEdit.setKontingent(input.nextDouble());
                input.nextLine(); // Consume the newline
                System.out.println("Kontingent updated successfully.");
                break;
            case 7:
                System.out.println("Is the member active? (true/false):");
                memberToEdit.setAktiv(input.nextBoolean());
                input.nextLine(); // Consume the newline
                System.out.println("Active status updated successfully.");
                break;
            case 8:
                System.out.println("Edit cancelled");
                return;
            default:
                System.out.println("Invalid choice");
        }
    }

    // delete one of the people in the person list
    public static void deleteMember(Scanner input, ArrayList<Member> members) {
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
    }

    // print the person list in a numbered list for edit and delete methods.
    public static void printNumberedMemberNames(ArrayList<Member> members) {
        for (int i = 0; i < members.size(); i++) {
            System.out.println((i + 1) + ". " + members.get(i).getName());
        }
    }

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

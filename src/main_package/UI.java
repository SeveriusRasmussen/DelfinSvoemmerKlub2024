package main_package;

import main_package.other.Contingent;
import main_package.other.ContingentMethods;
import main_package.other.Filehandler;
import main_package.other.Util;
import main_package.people.CompetitionMember;
import main_package.people.Employee;
import main_package.people.Member;
import main_package.people.PersonMethods;
import main_package.people.SwimmingResult;

import java.io.*;
import java.util.ArrayList;
import java.util.InputMismatchException;
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
                trainerMenu(currentUser,members);
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
                        PersonMethods.createMember(input, members);
                        break;
                    case 2:
                        System.out.println("Print the member list");
                        PersonMethods.printTheMemberList(members);
                        break;
                    case 3:
                        System.out.println("Edit one of the members");
                        PersonMethods.editMember(input, members);
                        break;
                    case 4:
                        System.out.println("Delete one of the members");
                        PersonMethods.deleteMember(input, members);
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
    }// end of formand menu

    public static void accountantMenu(Employee currentUser, ArrayList<Contingent> membersContingent, ArrayList<Member> member) {
        //kald scanner class og brug den i stedet for at have scanner her
        int nav = 0;
        System.out.println("""
                    Here are your options:
                    1. See the expected yearly revenue
                    2. Members in arrear
                    3. Exit
                    """);
        Scanner input = new Scanner(System.in);
        try {
            nav = input.nextInt();
            input.nextLine(); // consume the newline

            switch (nav) {
                case 1:
                    ContingentMethods.calculateRevenue(member);
                    break;
                case 2: //skal laves igen af Lina
                    System.out.println("check restance");
                    ContingentMethods.checkArrears(membersContingent, member);
                    break;
                case 3:
                    System.out.println("Exit.");
                    System.exit(0);
                default:
                    System.out.println("you have entered a wrong number, please try again.");
                    accountantMenu(currentUser, membersContingent, member);
            }
        }catch (InputMismatchException e) {
            System.out.println("Invalid input. Please enter a number.");
            input.nextLine(); // consume invalid input.
        }
    }// end of accountantMenu

    public static void trainerMenu(Employee currentUser) throws IOException{
        ArrayList <SwimmingResult> swimmingResults= Filehandler.readFromFileSwimResult ();
        int nav;
        do {
            System.out.println("""
                    Here are your options:
                    1. View list of all swimmers 
                    2. Change member type 
                    3. View a swimmer's result in all disciplines
                    4. Register a swimmer's best result and date
                    5. View the top five results for a chosen discipline for each age group
                    6. Exit
                    """);
            nav = Util.getIntInputSwitch("choose a number from the list: ", "wrong input, only a number between 1 and 6: ", 1, 6);
    public static void trainerMenu(Employee currentUser,ArrayList<Member> members) {
        System.out.println("""
                           Here are your options:
                           1. View list of all swimmers 
                           2. Change member type 
                           3. View a swimmer's result in all disciplines
                           4. Register a swimmer's best result and date
                           5. View the top five results for a chosen discipline for each age group
                           6. Exit
                           """);

            //kald scanner class og brug den i stedet for at have scanner her
            switch (nav) {
                case 1:
                    System.out.println("Træner login Success");//choose between: all swimmers, junior- eller seniorsvømmer, motionist eller konkurrencesvømmer.
                    break;
                case 2:
                    break;
                case 3:
                    System.out.println("View a swimmer's result in all disciplines");
                    break;
                case 4:
                    System.out.println("Register a swimmer's best result and date");
                    PersonMethods.registrerSwimResult(swimmingResults);
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
        } while (nav != 6);
    }//end of trainer menu
        //kald scanner class og brug den i stedet for at have scanner her
        int nav = 5;
        switch(nav){
            case 1:
                System.out.println("Træner login Success");//choose between: all swimmers, junior- eller seniorsvømmer, motionist eller konkurrencesvømmer.
                break;
            case 2:
                break;
            case 3:
                break;
            case 4:
                break;
            case 5:
                ArrayList<CompetitionMember> compMembers = PersonMethods.getCompMembers(members);
                compMembers=PersonMethods.getBestFive(compMembers);
                for(CompetitionMember cm: compMembers){
                    cm.toPrint();
                }
                break;
            case 6:
                break;
            case 7:
                break;
            default:
                trainerMenu(currentUser,members);
        }
    }



}//end of class

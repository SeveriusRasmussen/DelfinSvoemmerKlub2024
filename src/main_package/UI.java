package main_package;

import main_package.other.Contingent;
import main_package.other.ContingentMethods;
import main_package.other.Filehandler;
import main_package.other.Util;
import main_package.people.Employee;
import main_package.people.Member;
import main_package.people.MemberMethods;

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
                        MemberMethods.createMember(input, members);
                        break;
                    case 2:
                        System.out.println("Print the member list");
                        MemberMethods.printTheMemberList(members);
                        break;
                    case 3:
                        System.out.println("Edit one of the members");
                        MemberMethods.editMember(input, members);
                        break;
                    case 4:
                        System.out.println("Delete one of the members");
                        MemberMethods.deleteMember(input, members);
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


    // Print the person list




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
                break;
            case 3:
                System.out.println("Oversigt over årlige revenue");
                ContingentMethods.calculateRevenue(member);
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

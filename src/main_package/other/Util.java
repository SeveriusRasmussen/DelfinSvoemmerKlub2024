package main_package.other;

import main_package.people.Member;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Util {

    public static int createMemberShipNumber(ArrayList<Member> members){
        int max=0;
        for(Member m:members){
            if(m.getMemberNr()>max){
                max=m.getMemberNr();
            }
        }
        return max+1;
    }



    public boolean containsIgnoreCase(String s1,String s2){
       return s1.toLowerCase().contains(s2.toLowerCase());
    }


    public static String stringPrompt(String prompt){
        Scanner scan = new Scanner(System.in);
        System.out.println(prompt);
        String output=scan.nextLine();
        return output;
    }

    public static int intPrompt(String prompt)throws InputMismatchException {
        Scanner scan = new Scanner(System.in);
        System.out.println(prompt);
        int output = scan.nextInt();
        return output;
    }

    public static double doublePrompt(String prompt)throws InputMismatchException{
        Scanner scan = new Scanner(System.in);
        System.out.println(prompt);
        double output = scan.nextDouble();
        return output;
    }

    public static LocalDate LocalDateInput() {
        DateTimeFormatter dateFormatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");
        LocalDate date = null;
        do {
            String enterDate = stringPrompt("Enter a date (yyyy-MM-dd): ");
            try {
                date = LocalDate.parse(enterDate, dateFormatter);
            } catch (Exception e) {
                System.out.println("Invalid date format. Please enter date in yyyy-MM-dd format.");
            }
        } while (date == null);
        return date;
    }


}

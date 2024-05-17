package main_package.other;

import main_package.people.Member;

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
}

package main_package.other;
import main_package.people.*;
import java.util.*;

public class ContingentMethods{

    /*public static void checkArrears(ArrayList<Contingent> memberContingent, ArrayList<Member> memberList) {
        for (Contingent c : memberContingent) {
            if (c.getArrears() > 0) {
                for (Member m : memberList) {
                    if (m.getMemberNr() == c.getMemberNr()) {
                        System.out.println(m);
                        System.out.println(c);
                    }
                }
            }
        }
    }*/
    public static void calculateRevenue (List<Member> members) {

        int juniorCount = 0;
        int seniorCount = 0;
        int verySeniorCount = 0;
        int passiveCount = 0;

        int juniorRevenue = 0;
        int seniorRevenue = 0;
        int verySeniorRevenue = 0;
        int passiveRevenue = 0;

        for (Member member : members) {
            if (member.isAktiv()) {
                if (member.getAge() < 18) {
                    juniorCount++;
                    juniorRevenue += 1000;
                } else if (member.getAge() >= 60) {
                    verySeniorCount++;
                    verySeniorRevenue += 1600 * 0.75;
                } else {
                    seniorCount++;
                    seniorRevenue += 1600;
                }
            } else {
                passiveCount++;
                passiveRevenue += 500;
            }
        }
        double totalRevenue = juniorRevenue + seniorRevenue + verySeniorRevenue + passiveRevenue;

        System.out.println("There are " + juniorCount + " junior members that generate " + juniorRevenue + " revenue");
        System.out.println("There are " + seniorCount + " senior members that generate " + seniorRevenue + " revenue");
        System.out.println("There are " + verySeniorCount + " very senior members that generate " + verySeniorRevenue + " revenue");
        System.out.println("There are " + passiveCount + " passive members that generate " + passiveRevenue + " revenue");
        System.out.println("The total yearly revenue is " + totalRevenue + " Kr.");
    }

}



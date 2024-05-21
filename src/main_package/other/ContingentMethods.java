package main_package.other;
import main_package.people.*;
import java.util.*;

public class ContingentMethods{

    public static void checkArrears(ArrayList<Contingent> memberContingent, ArrayList<Member> memberList) {
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
    }
}



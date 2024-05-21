package main_package.people;
//package main_package.other.Util;

import main_package.other.ComparableDisciplines;
import main_package.other.Util;

import java.util.*;

public class MemberMethods {
    ArrayList<Member> listOfMembers;
    ArrayList<SwimmingResult>listOfResults;

    MemberMethods(ArrayList<Member>listOfMembers){
        this.listOfMembers=listOfMembers;
    }

    public static void getBestFive(ArrayList<CompetitionMember>members){
        String disciplin = Util.stringPrompt("Which disciplin");
        SwimmingDisciplin disciplin1= SwimmingDisciplin.valueOf(disciplin);
        List<Integer>competingMembers =null;
        HashMap<Integer, Integer>record=null;
        for(CompetitionMember cm:members){
            ArrayList<SwimmingResult> currentSwimmersResults=cm.getResults();
            for(SwimmingResult sr:currentSwimmersResults ){
                if(sr.getDiscipline().equals(disciplin1)){
                    record.put(cm.getMemberNr(),sr.getTime());
                    competingMembers.add(cm.getMemberNr());
                }

            }
        }







    }
}

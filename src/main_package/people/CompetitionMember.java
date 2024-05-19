package main_package.people;

import main_package.other.ComparableBestTime;
import main_package.other.Util;

import java.util.ArrayList;
import java.util.Collections;

public class CompetitionMember extends Member {
    private static ArrayList<SwimmingResult> swimResults;
    private SwimmingDisciplin disciplin;
    //ArrayList<main_package.people.SwimmingResult> swimmingResults=new ArrayList<>();

    public CompetitionMember(String name, String phoneNumber, String adress, int age, int memberNr, double kontingent, boolean aktiv, SwimmingDisciplin disciplin, ArrayList<SwimmingResult> swimResults) {
        super(name, phoneNumber, adress, age, memberNr, kontingent, aktiv);
        this.disciplin = disciplin;
        this.swimResults = swimResults;
    }

    public ArrayList<SwimmingResult> getResults() {
        return swimResults;
    }

    public SwimmingDisciplin getDisciplin() {
        return disciplin;
    }

    public void setDisciplin(SwimmingDisciplin disciplin) {
        this.disciplin = disciplin;
    }

    //method that returns for each CompetitionMember his best result by disciplin
    public static SwimmingResult returnBestResultsByDisciplin(SwimmingDisciplin disciplin) {
        SwimmingResult bestResults = null;
        int bestTime = Integer.MAX_VALUE;
        //SwimmingResult(int memberNr, SwimmingDisciplin swimmingDiscipline, int time, LocalDate dateOfResult) {
        for (SwimmingResult swR : swimResults) {
            if (swR.getDiscipline().equals(disciplin)) {
                if (swR.getTime() < bestTime) {
                    bestResults = swR;
                    bestTime = swR.getTime();
                }
            }
        }
        return bestResults;
    }

    public static void bestFive(ArrayList<CompetitionMember> competitionMembers) {
        String disciplin = Util.stringPrompt("Which disciplin");
        SwimmingDisciplin disciplin1 = SwimmingDisciplin.valueOf(disciplin);

        ArrayList<CompetitionMember> membersByDisciplin = new ArrayList<>();
        for (CompetitionMember comM : competitionMembers) {
            SwimmingResult bestResult = returnBestResultsByDisciplin(disciplin1);
            if (bestResult != null) {
                membersByDisciplin.add(comM);
            }
        }
        Collections.sort(membersByDisciplin, new ComparableBestTime());

        ArrayList<CompetitionMember> bestFive = new ArrayList<>();
        int counter = 0;
        for (CompetitionMember comM : membersByDisciplin) {
            if (counter < 5) {
                bestFive.add(comM);
                counter++;
            } else {
                break;
            }
        }

        if (bestFive.isEmpty()) {
            System.out.println("There is no swimmers matching this disciplin");
        } else {
            System.out.println("here are the best 5 swimmers in this disciplin:");
            for (CompetitionMember comM : bestFive) {
                SwimmingResult swimResult = comM.returnBestResultsByDisciplin(disciplin1);
                System.out.println(comM.getName() + "time: " + swimResult.getTime());
            }
        }
    }//end of bestFive

}

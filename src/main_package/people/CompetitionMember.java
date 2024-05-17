package main_package.people;

import java.util.ArrayList;

public class CompetitionMember extends Member {
    private ArrayList<SwimmingResult> swimResults;
        private SwimmingDisciplin disciplin;
    //ArrayList<main_package.people.SwimmingResult> swimmingResults=new ArrayList<>();

    public CompetitionMember(String name, String phoneNumber, String adress, int age, int memberNr, double kontingent, boolean aktiv, SwimmingDisciplin disciplin) {
        super(name, phoneNumber, adress, age,memberNr,kontingent,aktiv);
        this.disciplin = disciplin;
    }

    public ArrayList<SwimmingResult> getResults(){
        return swimResults;
    }
    public SwimmingDisciplin getDisciplin() {
        return disciplin;
    }

    public void setDisciplin(SwimmingDisciplin disciplin) {
        this.disciplin = disciplin;
    }
}

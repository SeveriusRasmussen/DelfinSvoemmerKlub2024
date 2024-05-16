package People;

import People.Member;

public class CompetitionMember extends Member {
    private String disciplin;

    public CompetitionMember(String name, String phoneNumber, String adress, int age, int memberNr, double kontingent, boolean aktiv,String disciplin) {
        super(name, phoneNumber, adress, age,memberNr,kontingent,aktiv);
        this.disciplin = disciplin;
    }

    public String getDisciplin() {
        return disciplin;
    }

    public void setDisciplin(String disciplin) {
        this.disciplin = disciplin;
    }
}

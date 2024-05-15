public class CompetitionMember extends Member {
    private String disciplin;

    public CompetitionMember(String name, String phoneNumber, String adress, int age) {
        super(name, phoneNumber, adress, age);
        this.disciplin = disciplin;
    }

    public String getDisciplin() {
        return disciplin;
    }

    public void setDisciplin(String disciplin) {
        this.disciplin = disciplin;
    }
}

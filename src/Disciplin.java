public class Disciplin {
    private SwimmingDisciplin disciplin;
    private int bestTime;
    private String competitionName;

    //private String competitionName = SwimmingCompetition.getCompetitionName();
    /*jeg vil hellere have en klasse der hedder SwimminCompetition
    som jeg lavede, og så kan vi hente competitionName fra klassen getCompetitionName();
    men jeg er lidt i tvivl om resten af gruppen er enige med mig..
    så indtil videre klassen: SwimmingCompetition er ikke brugt til noget
    og competitionName er bare en String
     */

    public Disciplin(SwimmingDisciplin disciplin, int bestTime, String competitionName ){
        this.disciplin=disciplin;
        this.bestTime=bestTime;
        this.competitionName=competitionName;
    }

    public SwimmingDisciplin getDisciplin() {
        return disciplin;
    }

    public void setDisciplin(SwimmingDisciplin disciplin) {
        this.disciplin = disciplin;
    }

    public int getBestTime() {
        return bestTime;
    }

    public void setBestTime(int bestTime) {
        this.bestTime = bestTime;
    }

    public String getCompetitionName() {
        return competitionName;
    }

    public void setCompetitionName(String competitionName) {
        this.competitionName = competitionName;
    }
}

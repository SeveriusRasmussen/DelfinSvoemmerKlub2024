import People.Employee;

import java.time.LocalDate;

public class SwimmingCompetition {
    private static String competitionName;
    private LocalDate dateOfCompetition;
    Employee trainer;

    public static String getCompetitionName() {
        return competitionName;
    }

    public void setCompetitionName(String competitionName) {
        this.competitionName = competitionName;
    }

    public LocalDate getDateOfCompetition() {
        return dateOfCompetition;
    }

    public void setDateOfCompetition(LocalDate dateOfCompetition) {
        this.dateOfCompetition = dateOfCompetition;
    }

    public Employee getTrainer() {
        return trainer;
    }

    public void setTrainer(Employee trainer) {
        this.trainer = trainer;
    }
}

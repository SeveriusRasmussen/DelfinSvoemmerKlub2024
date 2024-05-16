import java.time.LocalDate;

    public class SwimmingResult {

        private int memberNr;
        private SwimmingDisciplin swimmingDiscipline;
        private int time;
        private LocalDate dateOfResult;

        public SwimmingResult(int memberNr, SwimmingDisciplin swimmingDiscipline, int time, LocalDate dateOfResult) {
            this.memberNr=memberNr;
            this.swimmingDiscipline = swimmingDiscipline;
            this.time = time;
            this.dateOfResult = dateOfResult;
        }

        public static void registrerSwimResult(){

        }//end of registrerSwimResult

    }



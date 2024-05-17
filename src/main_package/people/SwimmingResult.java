package main_package.people;

import main_package.people.SwimmingDisciplin;

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

        public SwimmingDisciplin getDiscipline(){
            return swimmingDiscipline;
        }
        public static void registrerSwimResult(){

        }//end of registrerSwimResult
        public int getTime(){
            return time;
        }

        //vi laver en liste af resultater til hver konkurrence medlem i main_package.people.CompetitionMember

    }



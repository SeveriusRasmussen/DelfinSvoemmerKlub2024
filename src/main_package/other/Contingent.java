package main_package.other;
import java.time.LocalDate;

public class Contingent {

    private LocalDate dateOfPayment; //I DAG
    private LocalDate nextpayment; //+90 dage
    private boolean arrears; //restance // boolean til om de er i restance eller ej
    private double debt;



    public Contingent(){}



    public  Contingent(LocalDate dateOfPayment, LocalDate nextpayment, boolean arrears, double debt) {
        this.dateOfPayment = dateOfPayment;
        this.nextpayment=nextpayment;
        this.arrears = arrears;
        this.debt = debt;
    }

    public LocalDate getDateOfPayment() {
        return this.dateOfPayment;
    }
    public boolean getArrears() {
        return this.arrears;
    }

    @Override
    public String toString() {
        return "Last payment: " + this.dateOfPayment  + "\nArrears: " + arrears + "\nDebt: "+debt+"\n";
    }


}

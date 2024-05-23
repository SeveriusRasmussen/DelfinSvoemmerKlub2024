package main_package.other;

import main_package.people.Member;

import java.time.LocalDate;
import java.util.List;

public class Contingent {

    private LocalDate dateOfPayment; //I DAG
    private LocalDate nextpayment; //+90 dage
    //private String membershipType; //Senior eller Junior // slet
    private boolean arrears; //restance // boolean til om de er i restance eller ej
    private double debt;



    public Contingent(){}



    public  Contingent(LocalDate dateOfPayment, LocalDate nextpayment, boolean arrears, double debt) {
        //super(name, phoneNumber, address, dateOfBirth, memberNr, contingent, aktiv);
        this.dateOfPayment = dateOfPayment;
        this.nextpayment=nextpayment;
        //this.membershipType = membershipType;
        this.arrears = arrears;
        this.debt = debt;
    }

    public LocalDate getDateOfPayment() {
        return this.dateOfPayment;
    }
    /*public String getMembershipType() {
        return this.membershipType;
    }*/
    public boolean getArrears() {
        return this.arrears;
    }

    @Override
    public String toString() {
        return "Last payment: " + this.dateOfPayment + "\nMembership Type: " + "\nArrears: " + arrears + "\nDebt: "+debt+"\n";
    }


}

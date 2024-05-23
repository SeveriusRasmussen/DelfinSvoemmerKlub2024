package main_package.other;

import main_package.people.Member;

import java.time.LocalDate;
import java.util.List;

public class Contingent {

    private int memberNr;
    private LocalDate dateOfPayment; //I DAG
    private LocalDate nextpayment; //+90 dage
    //private String membershipType; //Senior eller Junior // slet
    private boolean arrears; //restance // boolean til om de er i restance eller ej
    private double debt;



    public Contingent(){}



    public  Contingent(int memberNr, LocalDate dateOfPayment, LocalDate nextpayment, boolean arrears, double debt) {
        //super(name, phoneNumber, address, dateOfBirth, memberNr, contingent, aktiv);
        this.memberNr = memberNr;
        this.dateOfPayment = dateOfPayment;
        this.nextpayment = nextpayment;
        //this.membershipType = membershipType;
        this.arrears = arrears;
        this.debt = debt;
    }

    public String toPrint() {
        return (getMemberNr() + "," + getDateOfPayment()+ "," + getNextPayment() + "," + getArrears() + "," + getDebt() + "\n");
    }

    public int getMemberNr(){
        return  this.memberNr;
    }

    public LocalDate getNextPayment(){
        return this.nextpayment;
    }

    public double getDebt(){
        return this.debt;
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
        return "Membership Number: " + memberNr + "\n" +
                "First payment: " + dateOfPayment + "\n" +
                "Next payment: " + nextpayment + "\n" +
                "Is in arrear: " + arrears + "\n" +
                "Total debt: " + debt + "\n";

    }
}

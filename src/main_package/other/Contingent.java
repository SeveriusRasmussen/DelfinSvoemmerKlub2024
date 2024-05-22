package main_package.other;

import main_package.people.Member;

import java.time.LocalDate;
import java.util.List;

public class Contingent extends Member{

    private LocalDate dateOfPayment; //I DAG
    private LocalDate nextpayment; //+90 dage
    private String membershipType;
    private double arrears;

    public  Contingent(String name, String phoneNumber, String address, LocalDate dateOfBirth, int memberNr, double kontingent, boolean aktiv, LocalDate dateOfPayment, LocalDate nextpayment, String membershipType, double arrears) {
        super(name, phoneNumber, address, dateOfBirth, memberNr, kontingent, aktiv);
        this.dateOfPayment = dateOfPayment;
        this.nextpayment=nextpayment;
        this.membershipType = membershipType;
        this.arrears = arrears;
    }

    public LocalDate getDateOfPayment() {
        return this.dateOfPayment;
    }
    public String getMembershipType() {
        return this.membershipType;
    }
    public double getArrears() {
        return this.arrears;
    }

    @Override
    public String toString() {
        return "Last payment: " + this.dateOfPayment + "\nMembership Type: " + this.membershipType + "\nArrears: " + arrears;
    }


}

package main_package.other;

import main_package.people.Member;

import java.time.LocalDate;
import java.util.List;

public class Contingent extends Member{

    String dateOfPayment;
    String membershipType;
    double arrears;
    public  Contingent(String name, String phoneNumber, String address, LocalDate dateOfBirth, int memberNr, double kontingent, boolean aktiv, String dateOfPayment, String membershipType, double arrears) {
        super(name, phoneNumber, address, dateOfBirth, memberNr, kontingent, aktiv);
        this.dateOfPayment = dateOfPayment;
        this.membershipType = membershipType;
        this.arrears = arrears;
    }

    public String getDateOfPayment() {
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

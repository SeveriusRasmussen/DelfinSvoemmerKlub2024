package main_package.people;

import main_package.other.Contingent;

import java.time.LocalDate;

public class Member extends Person {
    private int memberNr;
    private Contingent contingent;
    private boolean aktiv;


    public Member(String name, String phoneNumber, String address, LocalDate dateOfBirth, int memberNr, Contingent contingent, boolean aktiv) {
        super(name, phoneNumber, address, dateOfBirth);
        this.memberNr = memberNr;
        this.contingent = contingent;
        this.aktiv = aktiv;
    }

    public int getMemberNr() {
        return memberNr;
    }

    public void setMemberNr(int memberNr) {
        this.memberNr = memberNr;
    }

    public Contingent getKontingent() {
        return contingent;
    }
    public boolean getAktiv() {
        return aktiv;
    }

    public void setKontingent(Contingent kontingent) {
        this.contingent = contingent;
    }

    public boolean isAktiv() {
        return aktiv;
    }

    public void setAktiv(boolean aktiv) {
        this.aktiv = aktiv;
    }

    public String toString() {
        String aktivString = aktiv? "Aktivt medlem" : "Passivt medlem";  // True : false
        return super.toString() +
                "Member Number: " + memberNr + "\n" +
                "Contingent   : " + contingent + "\n" +
                aktivString;
    }

    public String toPrint() {
        return (getName() + "," + getPhoneNumber()+ "," + getAddress() + "," + getDateOfBirth() + "," + memberNr + "," + aktiv + "\n");
    }
}

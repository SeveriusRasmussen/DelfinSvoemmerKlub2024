package main_package.people;

import java.time.LocalDate;

public class Member extends Person {
    private int memberNr;
    private double kontingent;
    private boolean aktiv;

    public Member(String name, String phoneNumber, String address, LocalDate dateOfBirth, int memberNr, double kontingent, boolean aktiv) {
        super(name, phoneNumber, address, dateOfBirth);
        this.memberNr = memberNr;
        this.kontingent = kontingent;
        this.aktiv = aktiv;
    }

    public int getMemberNr() {
        return memberNr;
    }

    public void setMemberNr(int memberNr) {
        this.memberNr = memberNr;
    }

    public double getKontingent() {
        return kontingent;
    }
    public boolean getAktiv() {
        return aktiv;
    }

    public void setKontingent(double kontingent) {
        this.kontingent = kontingent;
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
                "Kontingent   : " + kontingent + "\n" +
                aktivString;
    }

    public String toPrint() {
        return (getName() + "," + getPhoneNumber()+ "," + getAddress() + "," + getDateOfBirth() + "," + memberNr + "," + kontingent + "," + aktiv + "\n");
    }
}

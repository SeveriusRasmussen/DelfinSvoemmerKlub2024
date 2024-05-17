package People;

import People.Person;

public class Member extends Person {
    private int memberNr;
    private double kontingent;
    private boolean aktiv;

    public Member(String name, String phoneNumber, String address, int age, int memberNr, double kontingent, boolean aktiv) {
        super(name, phoneNumber, address, age);
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
        return super.toString() + "\n" +
                "Member Number: " + memberNr + "\n" +
                "Kontingent: " + kontingent + "\n" +
                aktivString;
    }
}

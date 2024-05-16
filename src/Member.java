public class Member extends Person{
    private int memberNr;
    private double kontingent;
    private boolean aktiv;

    public Member(String name, String phoneNumber, String adress, int age, int memberNr, double kontingent, boolean aktiv) {
        super(name, phoneNumber, adress, age);
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
}

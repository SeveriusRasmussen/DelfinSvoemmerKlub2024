public class Member {
    private String name;
    private int age;
    private String address;
    private int phoneNr;

    public Member(String name, int age, String address, int phoneNr) {
        this.name = name;
        this.age = age;
        this.address = address;
        this.phoneNr = phoneNr;
    }

    // Getters
    public String getName() {
        return name;
    }
    // unused getters
    /*
    public int getAge() {
        return age;
    }

    public String getAddress() {
        return address;
    }

    public int getPhoneNr() {
        return phoneNr;
    }
    */

    // Setters
    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void setPhoneNr(int phoneNr) {
        this.phoneNr = phoneNr;
    }

    @Override
    public String toString() {
        return "Name: " + name + "\n" +
                "Age: " + age + "\n" +
                "Address: " + address + "\n" +
                "Phone number: " + phoneNr + "\n" +
                "_________________________";
    }
}

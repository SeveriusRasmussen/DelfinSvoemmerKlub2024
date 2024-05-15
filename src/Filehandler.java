import java.util.*;
import java.io.*;

public class Filehandler {
    public static void loadEmployeeTxt(ArrayList<Employee> employees) throws FileNotFoundException {
        File employeeFile = new File("src/EmployeeList.txt");
        Scanner scan = new Scanner(employeeFile);
        while (scan.hasNextLine()) {
            String[] employeeData = scan.nextLine().split(",");

            String employeeName = employeeData[0];
            String employeePhoneNumber = employeeData[1];
            String employeeAddress = employeeData[2];
            int employeeAge = Integer.parseInt(employeeData[3]);
            int employeeAccesGroup = Integer.parseInt(employeeData[4]);
            String employeePassword = employeeData[5];
            String employeeTitle = employeeData[6];
            String employeeUserName = employeeData[7];
            employees.add(new Employee(employeeName, employeePhoneNumber, employeeAddress, employeeAge, employeeAccesGroup, employeePassword, employeeTitle, employeeUserName));

        }
    } //end of loadEmployeeTxt

    public static void loadMemberTxt(ArrayList<Member> members) throws FileNotFoundException {
        File memberFile = new File("src/MemberList.txt");
        Scanner scan = new Scanner(memberFile);
        Member member;
        while (scan.hasNextLine()) {
            String[] memberData = scan.nextLine().split(",");
            String memberName = memberData[0];
            String memberPhoneNumber = memberData[1];
            String memberAddress = memberData[2];
            int memberAge = Integer.parseInt(memberData[3]);
            int memberNr = Integer.parseInt(memberData[4]);
            double kontingent = Double.parseDouble(memberData[5]);
            boolean aktiv = Boolean.parseBoolean(memberData[6]);
            member = new Member(memberName, memberPhoneNumber, memberAddress, memberAge, memberNr, kontingent, aktiv);
            members.add(member);
        } //end of loadMemberTxt
    }
}//end of class

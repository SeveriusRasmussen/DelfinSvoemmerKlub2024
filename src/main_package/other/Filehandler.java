package main_package.other;

import main_package.people.Employee;
import main_package.people.Member;
import main_package.people.SwimmingDisciplin;
import main_package.people.SwimmingResult;

import java.time.LocalDate;
import java.util.*;
import java.io.*;

public class Filehandler {
    public static void loadEmployeeTxt(ArrayList<Employee> employees) throws FileNotFoundException {
        File employeeFile = new File("src/main_package/Db/EmployeeList.txt");
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
        File memberFile = new File("src/main_package/db/MemberList.txt");
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
        }
    }//end of loadMemberTxt

    // Mangler save to file methods here.


    public static ArrayList<SwimmingResult> readFromFileSwimResult () throws FileNotFoundException {
        Scanner scan=new Scanner(new File("src/main_package/db/SwimResultList.txt"));
        ArrayList<SwimmingResult> swimmingResults=new ArrayList<>();
        while (scan.hasNextLine()){
            String line=scan.nextLine();
            Scanner linescan=new Scanner(line);
            int memberNr=0;
            while ((linescan.hasNext()) && !linescan.hasNext(";")){
                memberNr=linescan.nextInt();
            }
            linescan.next();

            SwimmingDisciplin disciplin= SwimmingDisciplin.valueOf("BUTTERFLY");
            while ((linescan.hasNext()) && !linescan.hasNext(";")){
                disciplin= SwimmingDisciplin.valueOf(linescan.next());
            }
            linescan.next();

            int time=0;
            while ((linescan.hasNext()) && !linescan.hasNext(";")){
                time= linescan.nextInt();
            }
            linescan.next();

            LocalDate dateOfResult=LocalDate.now();
            while (linescan.hasNext() && !linescan.hasNext(";")){
                dateOfResult= LocalDate.parse(linescan.next());
            }
            linescan.next();

            SwimmingResult newSwimminResult = new SwimmingResult(memberNr, disciplin, time, dateOfResult);
            swimmingResults.add(newSwimminResult);

        }//end while
        return swimmingResults;

    }//end readFromFileSwimResult
    public static void loadContingentTxt(ArrayList<Contingent> contigents) throws FileNotFoundException {
        File contigentFile = new File("src/main_package/db/Contingent.txt");
        Scanner scan = new Scanner(contigentFile);
        Contingent memberContingent;
        while (scan.hasNextLine()) {
            String[] contingentData = scan.nextLine().split(",");
            String memberName = contingentData[0];
            String memberPhoneNumber = contingentData[1];
            String memberAddress = contingentData[2];
            int memberAge = Integer.parseInt(contingentData[3]);
            int memberNr = Integer.parseInt(contingentData[4]);
            double kontingent = Double.parseDouble(contingentData[5]);
            boolean aktiv = Boolean.parseBoolean(contingentData[6]);
            String dateOfPayment = contingentData[7];
            String membershipType = contingentData[8];
            double arrears = Double.parseDouble(contingentData[9]);

            memberContingent = new Contingent(memberName, memberPhoneNumber, memberAddress, memberAge, memberNr, kontingent, aktiv,dateOfPayment,membershipType,arrears);
            contigents.add(memberContingent);
        }
    }//end of loadMemberTxt

    public static List<Member> readMembersFromFile(String fileName) throws IOException {
        List<Member> members = new ArrayList<>();
        BufferedReader reader = new BufferedReader(new FileReader ("src/main_package/db/SwimResultList.txt"));
        String line;

        while ((line = reader.readLine()) != null) {
            String[] fields = line.split(",");
            String name = fields[0];
            String phoneNumber = fields[1];
            String address = fields[2];
            int age = Integer.parseInt(fields[3]);
            int memberNr = Integer.parseInt(fields[4]);
            int kontingent = Integer.parseInt(fields[5]);
            boolean aktiv = Boolean.parseBoolean(fields[6]);

            Member member = new Member(name, phoneNumber, address, age, memberNr, kontingent, aktiv);
            members.add(member);
        }
        return members;
    }

}//end of class

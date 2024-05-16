import People.Employee;
import People.Member;

import java.io.FileNotFoundException;
import java.util.*;

public class Main {

    public static void main(String[] args) throws FileNotFoundException {
        //making a list for the members
        ArrayList<Member> members = new ArrayList<>();

        //Reading employees from EmployeeList.txt and adding them into the ArrayList employees
        Filehandler.loadMemberTxt(members);


        //making a list for the employees
        ArrayList<Employee> employees = new ArrayList<>();

        //Reading employees from EmployeeList.txt and adding them into the ArrayList employees
        Filehandler.loadEmployeeTxt(employees);

        //making a list of the swimresults
        ArrayList<SwimmingResult> swimmingResults=new ArrayList<>();

        //reading swim results from file: SwimResult.txt
        Filehandler.readFromFile();

        //make login object
        Login newLogin = new Login(employees);

        Employee currentUser = Login.attemptLogin(newLogin.makeLogins(),employees);
        UI.userRole(currentUser, members);
        UI.userRole(currentUser);

    }
}

package main_package;

import main_package.other.Filehandler;
import main_package.other.Login;
import main_package.people.Employee;
import main_package.people.Member;
import main_package.people.SwimmingResult;

import java.io.FileNotFoundException;
import java.util.*;

import static main_package.other.Filehandler.readFromFileSwimResult;

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

        //Reading swimmingResults from SwimResultList and saving them into an ArrayList
        ArrayList <SwimmingResult> swimmingResults=Filehandler.readFromFileSwimResult ();

        //make login object
        Login newLogin = new Login(employees);

        Employee currentUser = Login.attemptLogin(newLogin.makeLogins(),employees);
        UI.userRole(currentUser, members);
        //main_package.UI.userRole(currentUser);

    }
}

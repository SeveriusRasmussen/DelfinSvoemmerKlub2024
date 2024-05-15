import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws Exception {


        //making a list for the employees
        ArrayList<Employee> employees = new ArrayList<>();
        //Making some employees, and adding them to the list

        Filehandler.loadEmployeeTxt(employees);
        Scanner scan = new Scanner(System.in);


        //make login object
        Login newLogin = new Login(employees);

        Employee currentUser = Login.attemptLogin(newLogin.makeLogins(),employees);
        UI.userRole(currentUser);
    }

}

public class UI {

    public static void userRole(Employee currentUser){

        switch(currentUser.getAccesGroup()){
            case 1:
                foremanMenu(currentUser);
                break;
            case 2:
                accountantMenu(currentUser);
                break;
            case 3:
                trainerMenu(currentUser);
                break;
            default:

        }
    }

    public static void foremanMenu(Employee currentUser){
        System.out.println("Here are your options: ");
        //kald scanner class og brug den i stedet for at have scanner her
        int nav = 1;
        switch(nav){
            case 1:
                System.out.println("Formand login success");
                break;
            case 2:
                break;
            case 3:
                break;
            case 4:
                break;
            case 5:
                break;
            case 6:
                break;
            case 7:
                break;
            default:
                foremanMenu(currentUser);


        }
    }

    public static void accountantMenu(Employee currentUser) {
        System.out.println("Here are your options: ");
        //kald scanner class og brug den i stedet for at have scanner her
        int nav = 1;
        switch(nav){
            case 1:
                System.out.println("kassér login Success");
                break;
            case 2:
                break;
            case 3:
                break;
            case 4:
                break;
            case 5:
                break;
            case 6:
                break;
            case 7:
                break;
            default:
                accountantMenu(currentUser);
        }
    }

    public static void trainerMenu(Employee currentUser) {
        System.out.println("Here are your options: ");
        //kald scanner class og brug den i stedet for at have scanner her
        int nav = 1;
        switch(nav){
            case 1:
                System.out.println("Træner login Success");
                break;
            case 2:
                break;
            case 3:
                break;
            case 4:
                break;
            case 5:
                break;
            case 6:
                break;
            case 7:
                break;
            default:
                trainerMenu(currentUser);
        }
    }


}//end of class

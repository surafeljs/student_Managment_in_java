import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Admin adminStudentRegistration= new Admin();
       Dashboadrd dashboadrd=new Dashboadrd();
       dashboadrd.dashboadrd();



       Scanner scanner =new Scanner(System.in);
          int usaerInput=scanner.nextInt();
       

         int value=usaerInput;
         scanner.close();
                      switch (value) {
                        case 1:
                    System.out.println("\n");

                            adminStudentRegistration.studentRegistration();
                            break;
                      
                        default:
                            break;
                      }



    }
    
}

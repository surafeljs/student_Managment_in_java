import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Admin adminStudentRegistration= new Admin();
       Dashboadrd dashboadrd=new Dashboadrd();
       dashboadrd.dashboadrd();



       Scanner scanner =new Scanner(System.in);
       

       

        System.out.println("Enter your choice: ");
          int usaerInput=scanner.nextInt();

                      switch (usaerInput) {
                        case 1:
                    System.out.println("\n");

                            adminStudentRegistration.studentRegistration();
                            break;
                      
                        default:
                           System.out.println("Invalid choice!");
                           scanner.close();
                      }



    }
    
}

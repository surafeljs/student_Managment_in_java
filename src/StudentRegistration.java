import java.sql.Timestamp;
import java.sql.Date;
import java.util.Scanner;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class StudentRegistration {
   Scanner scanner=new Scanner(System.in);
   Timestamp ts = new Timestamp(System.currentTimeMillis());
    public void studentRegistration(){
System.out.println("====================== Student Registration ================================");


try {
   Class.forName("com.mysql.cj.jdbc.Driver");
   String url="jdbc:mysql://localhost:3306/student_managment_system";
   String user="root";
   String password="";
   Connection con = DriverManager.getConnection(url, user, password);
String sql = """
INSERT INTO student_management_system(
    student_id,
    student_first_name,
    student_last_name,
    gender,
    date_of_birth,
    phone_number,
    email_address,
    class_name,
    admission_date,
    department,
    section
)
VALUES(?,?,?,?,?,?,?,?,?,?,?)
""";
           
        
   PreparedStatement ps=con.prepareStatement(sql);

   
System.out.println("Student Id");

   String student_id=scanner.next();
System.out.println("Student First Name");

   String student_first_name=scanner.nextLine();
System.out.println("Student Last Name");

   String student_last_name=scanner.nextLine();
System.out.println("Gender");

   String gender=scanner.nextLine();
System.out.println("Date of Birth");

   String date_of_birth=scanner.nextLine();
System.out.println("Phone Number");

   int phone_number=scanner.nextInt();
System.out.println("Email Address");

   String email_address=scanner.nextLine();
System.out.println("Class");

   String class_name=scanner.nextLine();
System.out.println("Admission_Date");

   String department=scanner.nextLine();
System.out.println("Department");

   int section=scanner.nextInt();
System.out.println("Section");

  Date date=Date.valueOf(date_of_birth);








ps.setString(1, student_id);
ps.setString(2,student_first_name);
ps.setString(3, student_last_name);
ps.setString(4, gender);
ps.setDate(5, date);
ps.setInt(6, phone_number);
ps.setString(7, email_address);
ps.setString(8, class_name);
ps.setTimestamp(9, ts);
ps.setString(10, department);
ps.setInt(11, section);





   con.close();

   ps.close();

   System.out.println("sucsecfully");
} catch (Exception e) {
    // TODO: handle exception
}









    }
}

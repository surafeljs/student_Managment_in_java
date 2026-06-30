import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class StudentRegistration {
    

    public void studentRegistration(){
System.out.println("======================================================");
  
System.out.println("Student Id");
System.out.println("Student First Name");
System.out.println("Student Last Name");
System.out.println("Gender");
System.out.println("Date of Birth");
System.out.println("Phone Number");
System.out.println("Email Address");
System.out.println("Class");
System.out.println("Admission_Date");
System.out.println("Department");
System.out.println("Section");
System.out.println("======================================================");

try {
   Class.forName("com.mysql.cj.jdbc.Driver");
   String url="jdbc:mysql://localhost:3306/student_managment_system";
   String user="root";
   String password="";
   Connection con = DriverManager.getConnection(url, user, password);
   String sql="INSERT INTO student_managment_system(student_id,student_first_name,student_last_name,gender,date_of_birth,phone_number,email_address,class,admission_date,department,section)  VALUES(?,?,?,?,?,?,?,?,?,?,?)";
   PreparedStatement ps=con.prepareStatement(sql);
   System.out.println("co");
   ps.close();
   con.close();
} catch (Exception e) {
    // TODO: handle exception
}









    }
}

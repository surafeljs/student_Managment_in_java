import java.sql.Timestamp;
import java.sql.Date;
import java.util.Scanner;
import java.util.UUID;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class StudentRegistration {
       Scanner scanner =new Scanner(System.in);
UUID uuid =UUID.randomUUID();
   Timestamp ts = new Timestamp(System.currentTimeMillis());
   
    public void studentRegistration(){
System.out.println("====================== Student Registration ================================");
Connection con=null;

try {

   Class.forName("com.mysql.cj.jdbc.Driver");
   String url="jdbc:mysql://localhost:3306/student_managment_system";
   String user="root";
   String password="";
    con = DriverManager.getConnection(url, user, password);



String sql = """
INSERT INTO registration(
    student_id,
    student_first_name,
    student_last_name,
    gender,
    date_of_birth,
    phone_number,
    email_address,
    class,
    admission_date,
    section
)
VALUES(?,?,?,?,?,?,?,?,?,?)
""";
      //   con.setAutoCommit(false);
        
   PreparedStatement ps=con.prepareStatement(sql);

System.out.println("Student First Name");
String student_first_name = scanner.nextLine();

System.out.println("Student Last Name");
String student_last_name = scanner.nextLine();

System.out.println("Gender");
String gender = scanner.nextLine();

System.out.println("Date of Birth (yyyy-mm-dd)");
String date_of_birth = scanner.nextLine();

System.out.println("Phone Number");
String phone_number = scanner.nextLine();

System.out.println("Email Address");
String email_address = scanner.nextLine();

System.out.println("Class");
String class_name = scanner.nextLine();

System.out.println("Section");
String section = scanner.nextLine();


// Convert String date to SQL Date
Date date = Date.valueOf(date_of_birth);


// Current admission date
Timestamp ts = new Timestamp(System.currentTimeMillis());


// PreparedStatement
ps.setString(1, uuid.toString());
ps.setString(2, student_first_name);
ps.setString(3, student_last_name);
ps.setString(4, gender);
ps.setDate(5, date);
ps.setString(6, phone_number);
ps.setString(7, email_address);
ps.setString(8, class_name);
ps.setTimestamp(9, ts);
ps.setString(10, section);


int result= ps.executeUpdate();
if (result > 0) {
System.out.println("====================== insert sucsecfully ================================");

}else{
System.out.println("====================== not insert sucsecfully ================================");


}
// con.commit();

   ps.close();
   con.close();

   
} catch (Exception e) {
  e.printStackTrace();
}
}









    }


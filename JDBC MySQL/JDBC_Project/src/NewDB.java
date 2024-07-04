import java.util.*;
import java.sql.*;
public class NewDB{
    public static void main(String args[]){
        try{
            Scanner sc = new Scanner(System.in);
            Class.forName("com.mysql.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/db1","root","NakulLimbani");
            Statement stmt = con.createStatement();

            
            //PreparedStatement pstm = con.prepareStatement("INSERT into student VALUES(?,?,?)");
            /*
            System.out.println("Enter Your Reg No:");
            int regno = sc.nextInt();

            System.out.println("Enter Your Name:");
            String name1 = sc.nextLine();
           

            System.out.println("Enter Your Branch:");
            String branch = sc.nextLine();

            pstm.setInt(1,regno);
            pstm.setString(2,name1);
            pstm.setString(3,branch);
            */
           // pstm.executeUpdate();


           
             
            ResultSet rs=stmt.executeQuery("select * from student");
            while(rs.next())
            {
                System.out.println(rs.getInt(1) +" " +  rs.getString(2) + " " + rs.getString(3));
                
            }


            PreparedStatement pstm1 = con.prepareStatement("DELETE from student where regno = (?)");
            System.out.println("Enter Reg No To Delete:");
            int regno1 = sc.nextInt();

            pstm1.setInt(1,regno1);
            pstm1.executeUpdate();

            ResultSet rs1=stmt.executeQuery("select * from student");
            System.out.println("After Deletion:");
            while(rs1.next())
            {
                System.out.println(rs1.getInt(1) +" " +  rs1.getString(2) + " " + rs1.getString(3));
            }


           
            
            con.close();
            sc.close();
        }catch(Exception e){ System.out.println(e);}
    }
}
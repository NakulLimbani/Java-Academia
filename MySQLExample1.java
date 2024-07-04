import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
public class MySQLExample1 {
    public static void main(String args[]){
        try{
            Class.forName("com.mysql.jdbc.Driver");
            

            Connection con=DriverManager.getConnection("jdbc:Mysql://localhost:3306/Nakul_Limbani","root","Nakul#3006");
			 

            Statement stmt=con.createStatement();   //statement created to execute query
            ResultSet rs=stmt.executeQuery("select * from stu");   //executeQuery() - to execute sql
            while(rs.next())     //iterate through resultset -
                System.out.println(rs.getString(1)+ " " +rs.getInt(2) + " " + rs.getString(3));
            //NOTE  First field is int, second and third are string.
            rs.close();
            stmt.close();
            con.close();
        }
        catch(Exception e)
        { 
            System.out.println(e);
        }
    }
}
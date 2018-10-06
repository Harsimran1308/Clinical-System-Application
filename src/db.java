
/**
 *
 * @author Harsimran singh
 */

   import java.sql.*;
   
public class db {
    
    Connection con=null;
   Statement stmt=null;
   ResultSet rs;
   db()
   {
       try
       {
           
       
       Class.forName("com.mysql.jdbc.Driver");
       String url="jdbc:mysql://localhost/clinicalsystem";
       con=DriverManager.getConnection(url,"username","password");
       stmt=con.createStatement();
       
       
       }
       
       
       catch(Exception e)
       {
           System.out.println(e);
       }
       
     
       
   }
    
    
      public void update(String qry)throws Exception 
       {
           
           stmt.executeUpdate(qry);
           
           
       }
      
      public ResultSet execute(String qry)throws Exception
      {
          rs= stmt.executeQuery(qry);
          
          return rs;
          
      }
    
    
    
}

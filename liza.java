import java.sql.*;   // Use 'Connection', 'Statement' and 'ResultSet' classes in java.sql package
import java.io.*;
import ScalaJdbcConnectSelect;
import ScalaJdbcConnectSelect;

 //liza
// JDK 1.7 and above
//fae,kbdnekfjbhdrje
public class JdbcSelectTest extends ScalaJdbcConnectSelect {   // Save as "JdbcSelectTest.java"
   public static void main(String[] args) {
	   //hgfjhgjhgfjhgfcxvxcxxxc
	   //hgfjhgjhgfjhgfxcvxcvx
	    //hgfjhgjhgfjhgf
	   //kjghdfksjgadjsgfjhegfdsfsdf
	   //dfljhkdjahfkjhdasf
	   InputStreamReader in = new InputStreamReader(System.in);
	    InputStreamReader in100 = new InputStreamReader(System.in);
	   InputStreamReader in = new InputStreamReader(System.in);
	    InputStreamReader in10 = new InputStreamReader(System.in);
	   InputStreamReader in100 = new InputStreamReader(System.in);
	    InputStreamReader in100 = new InputStreamReader(System.in);
	    //InputStreamReader in10 = new InputStreamReader(System.in);
	    InputStreamReader in = new InputStreamReader(System.in);
       BufferedReader br = new BufferedReader(in);
       String strSelect1 = br.readLine();
	   String strSelect2 = br.readLine();

	  sql(strSelect1);
	  sql1(strSelect1);
	  sql2(strSelect2);
	  sql3(strSelect2);
	  //ScalaJdbcConnectSelect scalaClass=new ScalaJdbcConnectSelect();
	  //scalaClass.sql(strSelect);
	  
   }
   
   public void sql(String strSelect) {
         Connection conn = DriverManager.getConnection(
               "jdbc:mysql://localhost:3306/ebookshop?useSSL=false", "myuser", "xxxx");
         Statement stmt = conn.createStatement();
         ResultSet rset = stmt.executeQuery(strSelect);
   }
   
    public void sql1(String strSelect) {
         Connection conn = DriverManager.getConnection(
               "jdbc:mysql://localhost:3306/ebookshop?useSSL=false", "myuser", "xxxx");
         Statement stmt = conn.createStatement();
         ResultSet rset = stmt.executeQuery(strSelect);
   }
   
    public void sql2(String strSelect) {
         Connection conn = DriverManager.getConnection(
               "jdbc:mysql://localhost:3306/ebookshop?useSSL=false", "myuser", "xxxx");
         Statement stmt = conn.createStatement();
         ResultSet rset = stmt.executeQuery(strSelect);
   }
   
   public void sql3(String strSelect) {
         Connection conn = DriverManager.getConnection(
               "jdbc:mysql://localhost:3306/ebookshop?useSSL=false", "myuser", "xxxx");
         Statement stmt = conn.createStatement();
         ResultSet rset = stmt.executeQuery(strSelect);
   }
}

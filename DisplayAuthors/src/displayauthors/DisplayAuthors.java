package displayauthors;

// Fig. 24.23: DisplayAuthors.java
// Displaying the contents of the authors table.
import java.sql.Connection;
import java.sql.Statement;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;

public class DisplayAuthors 
{
   public static void main(String args[])
   {
// Q.11
       final String DATABASE_URL = "jdbc:derby://localhost:1527/books";
       final String UPDATE_QUERY = 
         "update titles set copyright ='2015' where editionnumber=5";

      
      try {  
         Connection connection = DriverManager.getConnection(DATABASE_URL, "deitel", "deitel"); 
         Statement statement = connection.createStatement(); 
         int rowcount = statement.executeUpdate(UPDATE_QUERY);
          System.out.println("Number of affected rows = " + rowcount);
      }
      catch (SQLException sqlException)                                
      {                                                                  
         sqlException.printStackTrace();
      }   }}        
                    
///// End of Q11


// Q. 10 

//       final String DATABASE_URL = "jdbc:derby://localhost:1527/books";
//       final String SELECT_QUERY = 
//         "SELECT * FROM titles";
//
//      // use try-with-resources to connect to and query the database
//      try (  
//         Connection connection = DriverManager.getConnection(
//            DATABASE_URL, "deitel", "deitel"); 
//         Statement statement = connection.createStatement(); 
//         ResultSet resultSet = statement.executeQuery(SELECT_QUERY))
//      {
//         // get ResultSet's meta data
//         ResultSetMetaData metaData = resultSet.getMetaData();
//         int numberOfColumns = metaData.getColumnCount();     
//         
//         System.out.printf("Titles Table of Books Database:%n%n");
//
//         // display the names of the columns in the ResultSet
//         for (int i = 1; i <= numberOfColumns; i++)
//            System.out.printf("%-8s\t\t", metaData.getColumnName(i));
//         System.out.println();
//         
//         // display query results
//         while (resultSet.next()) 
//         {
//            for (int i = 1; i <= numberOfColumns; i++)
//               System.out.printf("%-8s\t\t", resultSet.getObject(i));
//            System.out.println();
//         } 
//      } // AutoCloseable objects' close methods are called now 
//      catch (SQLException sqlException)                                
//      {                                                                  
//         sqlException.printStackTrace();
//      }  }     }                                            
     // End of Question 10
       
       
//      final String DATABASE_URL = "jdbc:derby://localhost:1527/books";
//      final String SELECT_QUERY = 
//         "SELECT authorID, firstName, lastName FROM authors";
//
//      // use try-with-resources to connect to and query the database
//      try (  
//         Connection connection = DriverManager.getConnection(
//            DATABASE_URL, "deitel", "deitel"); 
//         Statement statement = connection.createStatement(); 
//         ResultSet resultSet = statement.executeQuery(SELECT_QUERY))
//      {
//         // get ResultSet's meta data
//         ResultSetMetaData metaData = resultSet.getMetaData();
//         int numberOfColumns = metaData.getColumnCount();     
//         
//         System.out.printf("Authors Table of Books Database:%n%n");
//
//         // display the names of the columns in the ResultSet
//         for (int i = 1; i <= numberOfColumns; i++)
//            System.out.printf("%-8s\t", metaData.getColumnName(i));
//         System.out.println();
//         
//         // display query results
//         while (resultSet.next()) 
//         {
//            for (int i = 1; i <= numberOfColumns; i++)
//               System.out.printf("%-8s\t", resultSet.getObject(i));
//            System.out.println();
//         } 
//      } // AutoCloseable objects' close methods are called now 
//      catch (SQLException sqlException)                                
//      {                                                                  
//         sqlException.printStackTrace();
//      }                                                   
//   } 
//} // end class DisplayAuthors

/**************************************************************************
 * (C) Copyright 1992-2014 by Deitel & Associates, Inc. and               *
 * Pearson Education, Inc. All Rights Reserved.                           *
 *                                                                        *
 * DISCLAIMER: The authors and publisher of this book have used their     *
 * best efforts in preparing the book. These efforts include the          *
 * development, research, and testing of the theories and programs        *
 * to determine their effectiveness. The authors and publisher make       *
 * no warranty of any kind, expressed or implied, with regard to these    *
 * programs or to the documentation contained in these books. The authors *
 * and publisher shall not be liable in any event for incidental or       *
 * consequential damages in connection with, or arising out of, the       *
 * furnishing, performance, or use of these programs.                     *
 *************************************************************************/
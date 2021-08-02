import java.sql.*;

public class final_project {
    public static void main(String[] args) {
        try{
            Connection con = DriverManager.getConnection(
                    "jdbc:mysql://127.0.0.1:3306/final_project", "root", "ainazostina2015");
        }catch(Exception e){
            System.out.println("Something went wrong: " + e.getMessage());
        }
    }


}


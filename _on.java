package ATM.MANAGMENT.SYSTEM;
import java.sql.*;


public class con {
    Connection connection;
    Statement statement;
public   con(){
    try{
        connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/Bank","root","123456");
        statement = connection.createStatement();
    }catch (Exception e){

        e.printStackTrace();
    }

}

    public void statement(String q1) {

    }
}

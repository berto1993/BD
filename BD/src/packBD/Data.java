package packBD;

import java.sql.*;
public class Data {
Connection connection;
Statement statement;
public Data(){
// Load MySQL driver
try {
Class.forName("org.gjt.mm.mysql.Driver");
}
catch (ClassNotFoundException e) {
e.printStackTrace();
}
// Open connection
try {
connection = DriverManager.getConnection(
"jdbc:mysql://192.168.56.101:3306","director","imthedirector");
connection.setAutoCommit(true);
statement = connection.createStatement();
}
catch (SQLException e) {
e.printStackTrace();
}
}
//…
}
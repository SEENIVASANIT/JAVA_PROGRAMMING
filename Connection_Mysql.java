package JdBC_Demo;
import java.sql.*;
import java.util.Queue;
public class Connection_Mysql {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Read_table();
		//insertValue();
		//delete();
		//Update();
		//Commit_AutoCommit();
	}
	  
	public static void insertValue() {
		
		String url="jdbc:mysql://localhost:3306/JDBC_database";
		String name="root";
		String pass="seeni";
		String query="insert into student values(?,?,?,?)";
		try {
			Connection con=DriverManager.getConnection(url,name,pass);
			PreparedStatement prs=con.prepareStatement(query);
			prs.setString(1, "kumr");
			prs.setInt(2,7);
			prs.setInt(3, 90);
			prs.setString(4, "chennai");
			int row=prs.executeUpdate();
			System.out.println("row affect"+row);
			con.close();
		}catch (Exception e) {
			// TODO: handle exception
		}
			
	}
	
	///////////////////ReadTable//////////////////////////
public static void Read_table() {
	String url="jdbc:mysql://localhost:3306/JDBC_database";
	String user="root";
	String pass="seeni";
	String Query="select *from student";
try {
Connection con=DriverManager.getConnection(url,user,pass);
Statement sd=con.createStatement();
ResultSet rs	=sd.executeQuery(Query);
rs.next();
while(rs.next()) {
System.out.println(rs.getString(1));
System.out.println(rs.getInt(2));
System.out.println(rs.getInt(3));
System.out.println(rs.getString(2));
}
con.close();

} catch (SQLException e) {
// TODO Auto-generated catch block
e.printStackTrace();
}
}

public static void delete() {
	String url="jdbc:mysql://localhost:3306/JDBC_database";
	String name="root";
	String pass="seeni";
	
	String query="delete from student where id=2";
	try {
		Connection con=DriverManager.getConnection(url,name,pass);
		Statement st=con.createStatement();
		int row=st.executeUpdate(query);
		System.out.println("row affert:"+row);
	}catch (Exception e) {
		// TODO: handle exception
	}
}

//////////////////update
public static void Update() {
	String url="jdbc:mysql://localhost:3306/JDBC_database";
	String name="root";
	String pass="seeni";
	
	String query="update student set mark=100 where id=7";
	try {
		Connection con=DriverManager.getConnection(url,name,pass);
		Statement st=con.createStatement();
		int row=st.executeUpdate(query);
		System.out.println("row affert:"+row);
	}catch (Exception e) {
		// TODO: handle exception
	}
	

}
///////////Commit and AutoCommit///////////////////

public static void Commit_AutoCommit() {
	String url="jdbc:mysql://localhost:3306/JDBC_database";
	String name="root";
	String pass="seeni";
	
	String query2="update student set name='seeni' where mark=100";
	String query3="update student set name='vasa' where mark=90";
	
try {
	Connection con=DriverManager.getConnection(url,name,pass);
	con.setAutoCommit(false);
	Statement st=con.createStatement();
	int row1=st.executeUpdate(query2);
	int row2=st.executeUpdate(query3);
	if(row1>1&& row2>1) {
		con.commit();
	}
	
	}catch (Exception e) {
		// TODO: handle exception
	}
}
///////////////////Bacth process
public static  void Bacth_process() {
	String url="jdbc:mysql://localhost:3306/JDBC_database";
	String name="root";
	String pass="seeni";

	String query1="update student set name='seeni' where mark=100";
	String query2="update student set name='vasa' where mark=90";
	String query3="update student set name='ravi' where mark=90";
	String query4="update student set name='kumar' where mark=90";

	try {
	Connection con=DriverManager.getConnection(url,name,pass);
	con.setAutoCommit(false);
	Statement st=con.createStatement();
	st.addBatch(query1);
	st.addBatch(query2);
	st.addBatch(query3);
	st.addBatch(query4);
	int rows[]=st.executeBatch();
	for(int i=0;i<rows.length;i++) {
		if(rows[i]>0) {
			continue;
		}else {
			con.rollback();
		}
	}
	con.commit();
	con.close();

	}catch (Exception e) {
		// TODO: handle exception
	}

}

}


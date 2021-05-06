import java.sql.*;

public class App {

	public static void main(String[] args){
	try {
	//드라이버로드
	Class.forName("com.mysql.cj.jdbc.Driver");								//idpw: root  1234
	//드라이버관리자를통해 DB를얻음											ip    port  db명
	Connection DB연결관리자 = DriverManager.getConnection("jdbc:mysql://localhost:3306/mydb1?useUnicode=true","root","1234");
	//명령전달자를 얻음
	Statement 명령전달자 = DB연결관리자.createStatement();

	System.out.println("연결 성공");
	
	//명령
	String 삽입sql = "insert into 회원(성명,주민번호) values('다길동','333')";
	명령전달자.executeUpdate(삽입sql);
	//종료
	DB연결관리자.close();
	}catch(Exception e){e.printStackTrace();}
	
	
	
	}

}

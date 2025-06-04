package member;

import java.sql.Connection;
import java.sql 
import java.sql.PreparedStatement;

public class MemberDAO {

	Connection conn = null;
	PreparedStatement pstmt;
	
	final String JDBC_DRIVER = "org.h2.Driver";
	final string JDBC_URL = "jdbc:h2:tcp://localhost/~/test";
	
	public void open() {
		try {
	        Class.forName(JDBC_DRIVER);
	        conn = DriveManager.getConnection(JDBC_URL, "sa", "");
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	public void close() {
		try {
			pstmt.close();
			conn.close();
		}catch(Exception e) {
			e.printStackTrace ();
		}
		}
		
	}
	public void getALL() {
	List<Member> memberlist = new ArrayList<>();
	// 모든 회원들의 정보를 리턴하는 부분
	oepn ();
	try {
		pstmt = conn.preparestatement(")
	}catch(Exception e) {
		
	}finally {
		
	}	
	  return memberlist;
	}
	
	public void insert() {
		
	}
}

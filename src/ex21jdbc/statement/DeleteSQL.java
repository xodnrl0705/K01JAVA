package ex21jdbc.statement;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class DeleteSQL {
   
   private Connection con;
   private Statement stmt;
   
   //생성자에서는 드라이버에 대한 로드만 진행한다.
   public DeleteSQL() {
      try {
         Class.forName("oracle.jdbc.OracleDriver");
      }
      catch(ClassNotFoundException e ) { 
         System.out.println("드라이버 로딩 실패");
         e.printStackTrace();
      }
   }
   
   //Oracle DB에 대한 연결을 진행한다.
   public void connect () {
      try {
         con = DriverManager.getConnection(
               "jdbc:oracle:thin://@localhost:1521:orcl",
               "kosmo",
               "1234");
      }
      catch(SQLException e) {
         System.out.println("데이터베이스 연결오류");
         e.printStackTrace();
      }
   }
   
   //DB연결, 쿼리준비, 쿼리전송, 쿼리실행을 위한 메소드
   private void execute() {
	   
	   //여기서 실제 연결을 진행한다.
      connect();
      
      try {
    	  /*
    	  test1 삭제시 제약조건위배 예외발생
    	  test99와 같이 DB에 입력되지 않은 레코드 삭제시에는 예외없이
    	  		삭제되지않음.
    	   */
         stmt = con.createStatement();
         String query = "delete from member where id = 'test99'";
         int affected = stmt.executeUpdate(query);
         
         System.out.println(affected + " 행이 삭제됨");
      }
      catch(SQLException e) {
         System.out.println("쿼리 실행 오류");
         e.printStackTrace();
      }
      finally {
         close();
      }
   }
   private void close() {
      try {
         if(stmt!=null) stmt.close();//stmt 객체 자원반납
         if(con!=null) con.close(); //con 객체 자원 반납.
         System.out.println("자원반납완료");
         
      }
      catch(SQLException e) {
         System.out.println("자원 반납 시 오류가 발생하였습니다.");
      }
   }
   public static void main(String[] args) {
      new DeleteSQL().execute();

   }

}

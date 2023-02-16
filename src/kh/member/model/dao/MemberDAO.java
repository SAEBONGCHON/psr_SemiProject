package kh.member.model.dao;




import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import static kh.common.jdbc.JDBCTemplate.*;
import kh.member.model.vo.MemberVO;

public class MemberDAO {
//	private String userid;
//	private String passwd;
	//로그인
	public MemberVO login(Connection conn, MemberVO vo) {
		MemberVO result = null;
		String sql = "SELECT userid, passwd from TB_USER "
				+ "WHERE userid=? and passwd=?";
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		try {
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, vo.getUserid());
			pstmt.setString(2, vo.getPasswd());
			rs = pstmt.executeQuery();
			if(rs.next()) {
				result = new MemberVO();
				result.setUserid(rs.getString("userid"));
				result.setPasswd(rs.getString("passwd"));
			}
		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			close(rs);
			close(pstmt);
		}
		return result;
	
	}
}




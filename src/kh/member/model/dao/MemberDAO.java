package kh.member.model.dao;




import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import static kh.common.jdbc.JDBCTemplate.*;
import kh.member.model.vo.MemberVO;

public class MemberDAO {
//	private String userid;
//	private String passwd;
	//로그인
	public MemberVO login(Connection conn, MemberVO vo) {
		MemberVO result = null;
		String sql = "SELECT userid, userpw from TBUSER "
				+ "WHERE userid=? and userpw=?";
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		try {
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, vo.getUserid());
			pstmt.setString(2, vo.getUserpw());
			rs = pstmt.executeQuery();
			if(rs.next()) {
				result = new MemberVO();
				result.setUserid(rs.getString("userid"));
				result.setUserpw(rs.getString("userpw"));
			}
		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			close(rs);
			close(pstmt);
		}
		return result;
	}
//	userid varchar2(30) primary KEY,
//	userpw varchar2(30) NOT NULL,
//	nickname varchar(30) NOT NULL,
//	useremail varchar (30) NOT NULL
	//회원가입
	public int join(Connection conn, MemberVO vo) {
		int result = 0;
		String sql = "INSERT INTO TBUSER VALUES (?,?,?,?)";
		PreparedStatement pstmt = null;
		try {
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, vo.getUserid());
			pstmt.setString(2, vo.getUserpw());
			pstmt.setString(3, vo.getNickname());
			pstmt.setString(4, vo.getUseremail());
		} catch (SQLException e) {
			e.printStackTrace();
		}finally {
			close(pstmt);
		}
		return result;
	}
}




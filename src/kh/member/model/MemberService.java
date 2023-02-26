package kh.member.model;

import static kh.common.jdbc.JDBCTemplate.close;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import kh.common.jdbc.JDBCTemplate;
import kh.member.model.dao.MemberDAO;
import kh.member.model.vo.MemberVO;

public class MemberService {
	
	//로그인
	public MemberVO login(MemberVO vo) {
		MemberVO result = null;
		Connection conn = JDBCTemplate.getConnection();
		result = new MemberDAO().login(conn, vo);
		JDBCTemplate.close(conn);
		return result;
	}
		
	//회원가입
	public int join(MemberVO vo) {
		int result = 0;
		Connection conn =JDBCTemplate.getConnection();
		MemberDAO md = new MemberDAO();
		result = new MemberDAO().join(conn, vo);
		JDBCTemplate.close(conn);
		return result;
	}
		
}

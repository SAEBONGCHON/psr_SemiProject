package kh.member.model;

import java.sql.Connection;

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
		
		
		
}

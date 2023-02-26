package kh.member.controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import kh.member.model.MemberService;
import kh.member.model.vo.MemberVO;

/**
 * Servlet implementation class JoinController
 */
@WebServlet("/join")
public class JoinController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public JoinController() {
        super();
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.getRequestDispatcher("/WEB-INF/view/member/join.jsp").forward(request, response);
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//1
		MemberVO vo = new MemberVO();
		vo.setUserid(request.getParameter("userid"));
		vo.setUserpw(request.getParameter("userpw"));
		vo.setNickname(request.getParameter("nickname"));
		vo.setUseremail(request.getParameter("useremail"));
		//2
		MemberService ms = new MemberService();
		int result = ms.join(vo);
		//3
		if(result !=0) {
			response.sendRedirect(request.getContextPath()+"/main");
		}
		request.getRequestDispatcher("/WEB-INF/error.jsp").forward(request, response);
	}

}

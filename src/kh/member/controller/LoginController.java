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
 * Servlet implementation class LoginController
 */
@WebServlet("/login")
public class LoginController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public LoginController() {
        super();
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.getRequestDispatcher("/WEB-INF/view/member/login.jsp").forward(request, response);
		
	}
	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		MemberVO vo = new MemberVO();
	    vo.setUserid(request.getParameter("userid"));
		vo.setPasswd(request.getParameter("passwd"));
		
		MemberVO result = new MemberService().login(vo);
		if(result != null) {
			request.getSession().setAttribute("loginSesstion", result);
		} else {
			System.out.println("로그인 실패");
		}
		
		response.sendRedirect(request.getContextPath()+"/");
	}

}

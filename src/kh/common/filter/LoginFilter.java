//package kh.common.filter;
//
//import java.io.IOException;
//
//import javax.servlet.Filter;
//import javax.servlet.FilterChain;
//import javax.servlet.FilterConfig;
//import javax.servlet.RequestDispatcher;
//import javax.servlet.ServletException;
//import javax.servlet.ServletRequest;
//import javax.servlet.ServletResponse;
//import javax.servlet.annotation.WebFilter;
//import javax.servlet.http.HttpServletRequest;
//import javax.servlet.http.HttpSession;
//
//
//public class LoginFilter implements Filter{
//
//	
//	@Override
//	public void init(FilterConfig filterConfig) throws ServletException {
//		
//	}
//
//	
//	@Override
//	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain)
//			throws IOException, ServletException {
//		HttpServletRequest req =(HttpServletRequest)request;
//		HttpSession session = req.getSession();
//		Object login = session.getAttribute("login");
//		boolean login = false;
//		if(login != null) {
//			chain.doFilter(request, response);			
//		}else {
//			RequestDispatcher dispatcher = request.getRequestDispatcher("/login");
//		}
//		
//	}
//	
//	
//	@Override
//	public void destroy() {
//		
//	}
//}

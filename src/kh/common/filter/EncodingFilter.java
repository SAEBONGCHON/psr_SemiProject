package kh.common.filter;

import java.io.IOException;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebFilter;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebFilter("/private/*")
public class EncodingFilter implements Filter{

	@Override
	public void destroy() {
		
	}
	
	@Override
	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain)
			throws IOException, ServletException {
		request.setCharacterEncoding("UTF-8");
		response.setCharacterEncoding("UTF-8");
		response.setContentType("text/html; charset=UTF-8");
		
		HttpServletRequest req =(HttpServletRequest)request;
		HttpSession session = req.getSession();
		String id=(String)session.getAttribute("id");
		
		if(id != null) {
			chain.doFilter(request, response);			
		}else {
			HttpServletResponse res =(HttpServletResponse)response;
			String cPath= req.getContextPath();
			res.sendRedirect(cPath+"/view/login");
		}
		
	}
	
	
	@Override
	public void init(FilterConfig filterConfig) throws ServletException {

	}
}

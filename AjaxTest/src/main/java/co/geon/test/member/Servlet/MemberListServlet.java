package co.geon.test.member.Servlet;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import co.geon.test.member.service.MemberService;
import co.geon.test.member.serviceImpl.MemberServiceImpl;
import co.geon.test.member.vo.MemberVO;

@WebServlet("/MemberListServlet.do")
public class MemberListServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    public MemberListServlet() {
        super();
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setCharacterEncoding("UTF-8");
		response.setContentType("text/json;charset=utf-8");
		
		MemberService dao = new MemberServiceImpl();
		
		List<MemberVO> list = dao.memberSelectList();
		request.setAttribute("MemberList", list);
		System.out.println(list);
		Gson gson = new GsonBuilder().create();
		response.getWriter().print(gson.toJson(list));
		
	}
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}

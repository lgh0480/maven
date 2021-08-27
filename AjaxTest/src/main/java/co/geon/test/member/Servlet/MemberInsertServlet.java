package co.geon.test.member.Servlet;

import java.io.IOException;
import java.sql.Date;

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

@WebServlet("/MemberInsertServlet.do")
public class MemberInsertServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    public MemberInsertServlet() {
        super();
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setCharacterEncoding("UTF-8");
		response.setContentType("text/json;charset=utf-8");
		
		String id = request.getParameter("id");
		String name = request.getParameter("name");
		String phone = request.getParameter("phone");
		String addr = request.getParameter("addr");
		String birth = request.getParameter("birth");
		
		System.out.println(id+name+phone+addr+birth);
		MemberService dao = new MemberServiceImpl();
		MemberVO vo = new MemberVO();
		
		vo.setId(id);
		vo.setName(name);
		vo.setPhone(phone);
		vo.setAddr(addr);
		vo.setBirth(birth);
		int n = dao.memberInsert(vo);
		System.out.println(vo.toString());
		
	      
	      System.out.println(n);
	      
	      if (n == 1) {
	         String str = "등록성공";
	         Gson gson = new GsonBuilder().create();
	 		response.getWriter().print(gson.toJson(str));
	      } 
		
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
		
	}
}

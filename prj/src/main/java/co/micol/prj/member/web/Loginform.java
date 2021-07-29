package co.micol.prj.member.web;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import co.micol.prj.common.Command;

public class Loginform implements Command {

	@Override
	public String execute(HttpServletRequest request, HttpServletResponse response) {
		// TODO member 밑에 있는 loginform.jsp로 가는길목
		return "member/loginform";
	}

}

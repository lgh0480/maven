package co.micol.prj.command;

import java.security.NoSuchAlgorithmException;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import co.micol.prj.comm.Command;
import co.micol.prj.comm.SHA_256;

public class CyperTextCommand implements Command {
	//단방향 암호화
	@Override
	public String execute(HttpServletRequest request, HttpServletResponse response) {
		SHA_256 cyper = new SHA_256();
		String str = "Hellow1234";
		try {
			String cyperText = cyper.encrypt(str);
			//vo.setPassword(cyperText);
			System.out.println("원문 : " + str);
			System.out.println("반복문 : "+ cyperText);
		} catch (NoSuchAlgorithmException e) {
			e.printStackTrace();
		}
		System.out.println(str);
		
		return null;
	}

}

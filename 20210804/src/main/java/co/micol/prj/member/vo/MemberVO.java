package co.micol.prj.member.vo;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class MemberVO {
	private String id;
	private String password;
	private String name;
	private int age;
	private String department;
	private String author;
	private char state;
	
	private String check; //로그인 or 검색 상태를 체크함
	
	
}
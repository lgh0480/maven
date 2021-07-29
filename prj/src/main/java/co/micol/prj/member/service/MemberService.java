package co.micol.prj.member.service;

import java.util.List;

import co.micol.prj.member.vo.MemberVO;

public interface MemberService {
	List<MemberVO> memberSelectList(); //전체조회
	
	MemberVO memberSelect(MemberVO vo); //한건 조회
	
	MemberVO memberLogin(MemberVO vo); //로그인
	
	int MemberInsert(MemberVO vo); //입력

	int MemberUpdate(MemberVO vo); //수정
	
	int MemberDelete(MemberVO vo); //삭제
}

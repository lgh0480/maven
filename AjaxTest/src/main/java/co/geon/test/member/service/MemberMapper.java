package co.geon.test.member.service;

import java.util.List;

import co.geon.test.member.vo.MemberVO;

public interface MemberMapper {
	//전체조회
		List<MemberVO> memberSelectList();
		
		//한건조회
		MemberVO memberSelectOne(MemberVO vo);
		
		int memberInsert(MemberVO vo);
		int memberDelete(MemberVO vo);
		int memberUpdate(MemberVO vo);
}

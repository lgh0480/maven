package co.geon.test.member.serviceImpl;

import java.util.List;

import org.apache.ibatis.session.SqlSession;

import co.geon.test.common.DataSource;
import co.geon.test.member.service.MemberMapper;
import co.geon.test.member.service.MemberService;
import co.geon.test.member.vo.MemberVO;

public class MemberServiceImpl implements MemberService {
	private SqlSession sqlSession = DataSource.getInstance().openSession(true);
	private MemberMapper map = sqlSession.getMapper(MemberMapper.class);
	
	@Override
	public List<MemberVO> memberSelectList() {
		// TODO 전체조회
		return map.memberSelectList();
	}

	@Override
	public MemberVO memberSelectOne(MemberVO vo) {
		// TODO 한건조회
		return map.memberSelectOne(vo);
	}

	@Override
	public int memberInsert(MemberVO vo) {
		// TODO 한건 입력
		return map.memberInsert(vo);
	}

	@Override
	public int memberDelete(MemberVO vo) {
		// TODO 한건 삭제
		return map.memberDelete(vo);
	}

	@Override
	public int memberUpdate(MemberVO vo) {
		// TODO 한건 수정
		return map.memberUpdate(vo);
	}

}

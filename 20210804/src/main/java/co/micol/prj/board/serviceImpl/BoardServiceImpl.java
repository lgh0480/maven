package co.micol.prj.board.serviceImpl;

import java.util.List;

import org.apache.ibatis.session.SqlSession;

import co.micol.prj.board.service.BoardMapper;
import co.micol.prj.board.service.BoardService;
import co.micol.prj.board.vo.CommentsVO;
import co.micol.prj.board.vo.SnsVO;
import co.micol.prj.common.DataSource;

public class BoardServiceImpl implements BoardService {
	
	//Mybatis를 통해 데이터베이스를 연결한다.
	private SqlSession sqlSession = DataSource.getInstance().openSession(); 
	//Mapper Interface 사용한다.
	private BoardMapper map = sqlSession.getMapper(BoardMapper.class); 
	
	@Override
	public List<SnsVO> SelectSnsList() {
		// TODO 전체
		return map.SelectSnsList();
	}

	@Override
	public List<SnsVO> snsSelect(SnsVO vo) {
		// TODO Auto-generated method stub
		return map.snsSelect(vo);
	}

	@Override
	public CommentsVO commentsSelect(CommentsVO vo) {
		// TODO Auto-generated method stub
		return map.commentsSelect(vo);
	}

	@Override
	public int SnsInsert(SnsVO vo) {
		// TODO Auto-generated method stub
		return map.SnsInsert(vo);
	}

	@Override
	public int CommentsInsert(CommentsVO vo) {
		// TODO Auto-generated method stub
		return map.CommentsInsert(vo);
	}

	@Override
	public int SnsUpdate(SnsVO vo) {
		// TODO Auto-generated method stub
		return map.SnsUpdate(vo);
	}

	@Override
	public int CommentsUpdate(CommentsVO vo) {
		// TODO Auto-generated method stub
		return map.CommentsUpdate(vo);
	}

	@Override
	public int SnsDelete(SnsVO vo) {
		// TODO Auto-generated method stub
		return map.SnsDelete(vo);
	}

	@Override
	public int CommentsDelete(CommentsVO vo) {
		// TODO Auto-generated method stub
		return map.CommentsDelete(vo);
	}

}

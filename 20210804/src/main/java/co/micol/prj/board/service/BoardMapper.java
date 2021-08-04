package co.micol.prj.board.service;

import java.util.List;

import co.micol.prj.board.vo.CommentsVO;
import co.micol.prj.board.vo.SnsVO;

public interface BoardMapper {
	
	List<SnsVO> SelectSnsList();

	List<SnsVO> snsSelect(SnsVO vo);

	CommentsVO commentsSelect(CommentsVO vo);

	int SnsInsert(SnsVO vo);
	int CommentsInsert(CommentsVO vo);

	int SnsUpdate(SnsVO vo);
	int CommentsUpdate(CommentsVO vo);

	int SnsDelete(SnsVO vo);
	int CommentsDelete(CommentsVO vo);

}

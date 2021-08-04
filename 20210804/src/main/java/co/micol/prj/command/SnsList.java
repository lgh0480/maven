package co.micol.prj.command;

import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import co.micol.prj.board.service.BoardService;
import co.micol.prj.board.serviceImpl.BoardServiceImpl;
import co.micol.prj.board.vo.SnsVO;
import co.micol.prj.common.Command;

public class SnsList implements Command {

	@Override
	public String execute(HttpServletRequest request, HttpServletResponse response) {
		//sns 목록 가져오기
		BoardService boardDao = new BoardServiceImpl();
		List<SnsVO> list = new ArrayList<SnsVO>();
		list = boardDao.SelectSnsList();
		
		request.setAttribute("snsList", list);
		
		return "board/snsList";
	}

}

package co.micol.prj.common;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import co.micol.prj.board.service.BoardService;
import co.micol.prj.board.serviceImpl.BoardServiceImpl;
import co.micol.prj.board.vo.SnsVO;

public class SnsSelect implements Command {

	@Override
	public String execute(HttpServletRequest request, HttpServletResponse response) {
		BoardService boardDao = new BoardServiceImpl();
		SnsVO vo = new SnsVO();
		vo.setSNo(Integer.valueOf(request.getParameter("sno")));

		System.out.println(vo);
		List<SnsVO> list = boardDao.snsSelect(vo);
		
		request.setAttribute("snsDetail", list);
		
		
		return "board/snsSelect";
	}

}

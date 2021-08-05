package co.micol.prj.web;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import co.micol.prj.comm.Command;
import co.micol.prj.comm.DownLoadFile;
import co.micol.prj.image.service.FileInfoService;
import co.micol.prj.image.vo.FileInformationVO;

public class FileDownLoadCommand implements Command {

	@Override
	public String execute(HttpServletRequest request, HttpServletResponse response) {
		// TODO Auto-generated method stub
		FileInfoService fileDao = new FileInfoService();
		
		FileInformationVO vo = fileDao.fileSelect(Integer.parseInt(request.getParameter("num")));
		
		String path = "d://temp";
		//String orgFileName = request.getParameter("orgFile");
		//String downFileName = request.getParameter("downFile");
		DownLoadFile downLoadFile = new DownLoadFile(path, vo.getFilename(), vo.getDownfile());
		boolean b = downLoadFile.isFileDown();
		if(!b) {
			request.setAttribute("message", "파일이 성공적으로 다운로드 되었습니다.");
		} else {
			request.setAttribute("message", "다운 실패");
		}
		return "file/fileDownLoadResult";
	}

}

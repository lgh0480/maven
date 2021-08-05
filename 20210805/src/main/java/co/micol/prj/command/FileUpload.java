package co.micol.prj.command;

import java.io.IOException;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.oreilly.servlet.MultipartRequest;
import com.oreilly.servlet.multipart.DefaultFileRenamePolicy;

import co.micol.prj.comm.Command;
import co.micol.prj.image.service.FileInfoService;
import co.micol.prj.image.vo.FileInformationVO;

public class FileUpload implements Command {

	@Override
	public String execute(HttpServletRequest request, HttpServletResponse response) {
		// 파일 업로드
	
		FileInfoService fileDao = new FileInfoService();
		FileInformationVO vo = new FileInformationVO();
		int maxFileSize = 1024 *1024 * 100; // 100MB
		
		
		try {
			MultipartRequest part = new MultipartRequest(request, "d:/temp/", maxFileSize, "utf-8", new DefaultFileRenamePolicy());
			String upfileName = part.getFilesystemName("fileName"); // name=file1의 업로드된 시스템 파일명을 구함(중복된 파일이 있으면, 중복 처리 후 파일 이름)
			String orgfileName = part.getOriginalFileName("fileName"); // name=file1의 업로드된 원본파일 이름을 구함(중복 처리 전 이름)
			
			System.out.println(part.getParameter("subject"));
			System.out.println("업로드"+upfileName);
			System.out.println(orgfileName);
			
			vo.setSubject(part.getParameter("subject"));
			vo.setFilename(orgfileName); //원래 파일명
			vo.setDownfile(upfileName);	
			
			System.out.println(vo.getFilename());
			int n = fileDao.fileInsert(vo);
			if(n != 0) {
				request.setAttribute("message", vo.getFilename()+"파일업로드 성공");
				
			} else {
				request.setAttribute("message", orgfileName + "파일업로드 실패");
			}
		} catch (IOException e) { 
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	    
		return "file/fileUploadResult";
		}
} 

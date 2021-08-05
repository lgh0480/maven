package co.micol.prj.image.service;

import java.util.List;

import co.micol.prj.image.vo.FileInformationVO;

public interface FileInfoMapper {
	List<FileInformationVO> fileSelectList();
	
	FileInformationVO fileSelect(int key);
	
	int fileInsert(FileInformationVO vo);
	int fileDelete(int key); //mybatis가 어떻게 해주는 보여주기 위해 하는거임 실제론 vo로 보내주면됨
	int fileUpdate(FileInformationVO vo);
}

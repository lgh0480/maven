package co.micol.prj.image.service;

import java.util.List;

import org.apache.ibatis.session.SqlSession;

import co.micol.prj.comm.DataSource;
import co.micol.prj.image.vo.FileInformationVO;

public class FileInfoService {
	private SqlSession sqlSession =DataSource.getInstance().openSession(true);
	private FileInfoMapper map = sqlSession.getMapper(FileInfoMapper.class);
	
	public List<FileInformationVO> fileSelectList(){
		return map.fileSelectList();
	}
	
	public FileInformationVO fileSelect(int key) {
		return map.fileSelect(key);
	}
	
	public int fileInsert(FileInformationVO vo) {
		return map.fileInsert(vo);
	}
	public int fileDelete(int key) {
		//mybatis가 어떻게 해주는 보여주기 위해 하는거임 실제론 vo로 보내주면됨
		return map.fileDelete(key);
	}
	public int fileUpdate(FileInformationVO vo) {
		return map.fileUpdate(vo);
	}

	
}

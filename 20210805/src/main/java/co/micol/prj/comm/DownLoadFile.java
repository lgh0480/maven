package co.micol.prj.comm;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;

public class DownLoadFile {
	private String path; // 파일이 실제 들어 있는 물리적 공간 주소
	private String orgFileName; // 원본 파일명
	private String downFileName; // 실제 다운로드될 파일명

	public DownLoadFile(String path, String orgFileName, String downFileName) {
		this.path = path;
		this.orgFileName = orgFileName;
		this.downFileName = downFileName;
	}

	public boolean isFileDown() { // 성공하면 false, 실패하면 true를
		boolean bool = false;
		File file = new File(path+File.separator + downFileName);
		FileInputStream in;
		try {
			FileOutputStream out = new FileOutputStream("d://downLoad//"+orgFileName);
			in = new FileInputStream(file);
			
			byte b[] = new byte[4096];
			int data = 0;
			while ((data = in.read(b, 0, b.length)) != -1) {
				out.write(b, 0, data);

			}
			
			out.close();
			in.close();
			bool =false;
		} catch (Exception e) {
			e.printStackTrace();
		}
		return bool;
	}
}

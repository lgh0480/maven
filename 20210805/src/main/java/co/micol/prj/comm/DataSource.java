package co.micol.prj.comm;

import java.io.InputStream;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

public class DataSource {
	//mybatis를 만들때
	private static SqlSessionFactory sqlSessionFactory;
	
	private DataSource() {} //싱글톤 클래스(외부에서 생성하지못하도록)
	
	public static SqlSessionFactory getInstance() {
		InputStream inputStream;
		try {
			String resource = "config/mybatis-config.xml";
			inputStream = Resources.getResourceAsStream(resource);
			sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);
			System.out.println("DB 연결 성공");
		} catch(Exception e) {
			e.printStackTrace();
		}
		
		return sqlSessionFactory;
	}
	 
	
}

package co.micol.prj.dao;

import java.io.FileReader;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;

public class DataSource {
	//싱글톤 방법
	private static DataSource dataSource = new DataSource(); //외부 객체가 나를 생성하지 못하게 <자신의 인스턴스 생성>
	
	private Connection conn; 
	
	private String driver;
	private String url;
	private String user;
	private String password;
	
	
	private DataSource() { //생성자(외부에서 생성하지 못하도록 함)
	
	}
	public static DataSource getInstance() { //외부에서 사용할때는 인스턴스를 리턴 
		
		return dataSource;
	}
	
	public Connection getConnection() {
		configure(); 	//외부 properties 파일을 읽어온다.
		try {
			Class.forName(driver);
			conn = DriverManager.getConnection(url, user, password);
		}catch (ClassNotFoundException | SQLException e) {
			e.printStackTrace();
		}
		return conn;
	}
	
	private void configure() { //외부에 있는 리소스 파일을 일어 옵니다?
		
		Properties properties = new Properties();
		String resource = getClass().getResource("/db.properties").getPath();
		//리소스를 읽어서 
		try {
			properties.load(new FileReader(resource));
			driver = properties.getProperty("driver");
			url = properties.getProperty("url");
			user = properties.getProperty("user");
			password = properties.getProperty("password");
		}catch(IOException e) {
			e.printStackTrace();
		}
		
	}
}

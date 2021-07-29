package co.micol.prj.member.serviceImpl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import co.micol.prj.dao.DataSource;
import co.micol.prj.member.service.MemberService;
import co.micol.prj.member.vo.MemberVO;

public class MemberServiceImpl implements MemberService {
	private DataSource dataSource = DataSource.getInstance();
	private Connection conn;
	private PreparedStatement psmt;
	private ResultSet rs;
	@Override
	public List<MemberVO> memberSelectList() {
		// TODO 전체 조회
		List<MemberVO> list = new ArrayList<MemberVO>();
		MemberVO vo;
		String sql = "select * from member";
		try {
			conn = dataSource.getConnection();
			psmt = conn.prepareStatement(sql);
			rs = psmt.executeQuery();
			while(rs.next()) {
				vo = new MemberVO();
				vo.setId(rs.getString("id"));
				vo.setPassword(rs.getString("password"));
				vo.setName(rs.getString("name"));
				vo.setAge(rs.getInt("age"));
				vo.setHobby(rs.getString("hobby"));
				vo.setAuthor(rs.getString("author"));
				vo.setState(rs.getString("state").charAt(0));
				list.add(vo);
			}
		}catch(SQLException e) {
			e.printStackTrace();
		}finally {
			close();
		}
		
		return list;
	}

	@Override
	public MemberVO memberSelect(MemberVO vo) {
		// TODO 한건 조회
		return vo;
	}

	@Override
	public MemberVO memberLogin(MemberVO vo) {
		// TODO 로그인 
		String sql = "select name, author  from member where id=? and password=?  and state='Y'";
		try {
			conn = dataSource.getConnection();
			psmt = conn.prepareStatement(sql);
			psmt.setString(1, vo.getId());
			psmt.setString(2, vo.getPassword());
			rs = psmt.executeQuery();
			while(rs.next()) {
				vo.setName(rs.getString("name"));
				vo.setAuthor(rs.getString("author"));
			}
		}catch(SQLException e) {
			
		}finally {
			close();
		}
		return vo;
	}

	@Override
	public int MemberInsert(MemberVO vo) {
		// TODO 입력 
		return 0;
	}

	@Override
	public int MemberUpdate(MemberVO vo) {
		// TODO 수정
		return 0;
	}

	@Override
	public int MemberDelete(MemberVO vo) {
		// TODO 삭제
		return 0;
	}
	
	private void close() {
		// 닫아주는 녀석
		try {
			if(rs != null) rs.close();
			if(psmt != null) psmt.close();
			if(conn != null) conn.close();
			
		}catch(SQLException e) {
			e.printStackTrace();
		}
		
	}
}

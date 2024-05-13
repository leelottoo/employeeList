package com.keduit.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import com.keduit.dto.EmployeesVO;
import com.keduit.util.DBManager;

public class EmployeesDAO {

	private EmployeesDAO() {
	}

	private static EmployeesDAO instance = new EmployeesDAO();

	public static EmployeesDAO getInstance() {
		return instance;
	}

//	모두 조회
	public List<EmployeesVO> selectAllemp(){
		String sql = "select * from employees order by id desc";
		List<EmployeesVO> list = new ArrayList<EmployeesVO>();
		Connection conn = null;
		Statement stmt = null;
		ResultSet rs = null;
		
		conn = DBManager.getConnection();
		try {
			stmt = conn.createStatement();
			rs = stmt.executeQuery(sql);
			
			while(rs.next()) {
				EmployeesVO eVO = new EmployeesVO();
				eVO.setId(rs.getString("id"));
				eVO.setPass(rs.getString("pass"));
				eVO.setName(rs.getString("name"));
				eVO.setLev(rs.getString("lev"));
				eVO.setEnter(rs.getString("enter"));
				eVO.setGender(rs.getString("gender"));			
				eVO.setPhone(rs.getString("phone"));			
				
				list.add(eVO);
			}
	}catch (Exception e) {
		e.printStackTrace();
	}finally {
		DBManager.close(conn, stmt, rs);
	}
		return list;
}
	
//	insert하기
	public void insertEmployees(EmployeesVO eVO) {
		String sql = "insert into employees(id, pass, name, lev, gender, phone) values(?, ?, ?, ?, ?, ?)";
		Connection conn = null;
		PreparedStatement pstmt = null;
		
		try {
			conn = DBManager.getConnection();
			pstmt = conn.prepareStatement(sql);
			
			pstmt.setString(1, eVO.getId());
			pstmt.setString(2, eVO.getPass());
			pstmt.setString(3, eVO.getName());
			pstmt.setString(4, eVO.getLev());
			pstmt.setString(5, eVO.getGender());
			pstmt.setString(6, eVO.getPhone());
			
			int result = pstmt.executeUpdate();
			System.out.println(result);
			
		}catch (Exception e) {
			e.printStackTrace();
		}finally {
			DBManager.close(conn, pstmt);
		}
	}

	public EmployeesVO selectOne(String id) {
		
		EmployeesVO eVO = null;
		String sql = "select * from employees where id = ?";
		
		Connection conn = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		
		try {
			conn = DBManager.getConnection();
			pstmt = conn.prepareStatement(sql);
			
			pstmt.setString(1, id);
			rs = pstmt.executeQuery();
			
			if(rs.next()) {
				eVO = new EmployeesVO();
				eVO.setId(rs.getString("id"));
				eVO.setPass(rs.getString("pass"));
				eVO.setName(rs.getString("name"));
				eVO.setLev(rs.getString("lev"));
				eVO.setGender(rs.getString("gender"));
				eVO.setPhone(rs.getString("phone"));
				eVO.setEnter(rs.getString("enter"));
				
			}
		}catch (Exception e) {
			e.printStackTrace();
		}finally {
			DBManager.close(conn, pstmt, rs);
		}
		System.out.println("------------selectOne : " + eVO);
		return eVO;
	}

}

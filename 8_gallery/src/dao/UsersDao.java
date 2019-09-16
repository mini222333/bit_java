package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import util.JDBCUtil;
import vo.UserVo;

public class UsersDao {
	public List<UserVo> getUserRec() {
		List<UserVo> list = new ArrayList<UserVo>();
		String sql = "select * from ("
				+ "select rownum row#, id, password, name, role "
				+ "from (select * from users order by id)"
				+ ") where row# between ? and ?";
		Connection con = null;
		PreparedStatement ps = null;
		ResultSet rs = null;

		try {
			con = JDBCUtil.getConnection();
			ps = con.prepareStatement(sql);
			// ? 세팅
			ps.setInt(1, 1);
			ps.setInt(2, 5);
			// 실행 및 결과값 핸들링
			rs = ps.executeQuery();
			while (rs.next()) {
				UserVo vo = new UserVo();
				vo.setId(rs.getString("id"));
				vo.setName(rs.getString("name"));
				vo.setPassword(rs.getString("password"));
				vo.setRole(rs.getString("role"));
				list.add(vo);
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			JDBCUtil.close(con, ps, rs);
		}
		return list;
	}

	public List<UserVo> getUserRec(int page, int n) {
		List<UserVo> list = new ArrayList<UserVo>();
		String sql = "select * from ("
				+ "select rownum row#, id, password, name, role "
				+ "from (select * from users order by id)"
				+ ") where row# between ? and ?";
		Connection con = null;
		PreparedStatement ps = null;
		ResultSet rs = null;
		int start = (page - 1) * n + 1;
		int end = start + n - 1;

		try {
			con = JDBCUtil.getConnection();
			ps = con.prepareStatement(sql);
			// ? 세팅
			ps.setInt(1, start);
			ps.setInt(2, end);
			// 실행 및 결과값 핸들링
			rs = ps.executeQuery();
			while (rs.next()) {
				UserVo vo = new UserVo();
				vo.setId(rs.getString("id"));
				vo.setName(rs.getString("name"));
				vo.setPassword(rs.getString("password"));
				vo.setRole(rs.getString("role"));
				list.add(vo);
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			JDBCUtil.close(con, ps, rs);
		}
		return list;
	}

	public UserVo loginUsers(UserVo vo) {
		List<UserVo> list = new ArrayList<UserVo>();
		String sql = "select * from users where id=? and password=?";
		Connection con = null;
		PreparedStatement ps = null;
		ResultSet rs = null;
		UserVo data = null;
		try {
			con = JDBCUtil.getConnection();
			ps = con.prepareStatement(sql);
			// ? 세팅
			ps.setString(1, vo.getId());
			ps.setString(2, vo.getPassword());
			// 실행 및 결과값 핸들링
			rs = ps.executeQuery();
			if (rs.next()) {
				data = new UserVo();
				data.setId(rs.getString("id"));
				data.setName(rs.getString("name"));
				data.setPassword(rs.getString("password"));
				data.setRole(rs.getString("role"));
			} else {
				System.out.println("로그인 실패");
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			JDBCUtil.close(con, ps, rs);
		}
		return data;
	}

	public int insertUsers(UserVo vo) {
		String sql = "insert into users(id,password,name,role) values(?,?,?,?)";
		Connection con = null;
		PreparedStatement ps = null;
		int result = 0;
		try {
			con = JDBCUtil.getConnection();
			ps = con.prepareStatement(sql);
			// ? 세팅
			ps.setString(1, vo.getId());
			ps.setString(2, vo.getPassword());
			ps.setString(3, vo.getName());
			ps.setString(4, vo.getRole());
			// 실행 및 결과값 핸들링
			result = ps.executeUpdate();
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			JDBCUtil.close(con, ps, null);
		}
		return result;
	}

	public int deleteUsers(String id) {
		String sql = "delete from users where id=?";
		Connection con = null;
		PreparedStatement ps = null;
		int result = 0;
		try {
			con = JDBCUtil.getConnection();
			ps = con.prepareStatement(sql);
			// ? 세팅
			ps.setString(1, id);
			// 실행 및 결과값 핸들링
			result = ps.executeUpdate();
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			JDBCUtil.close(con, ps, null);
		}
		return result;
	}

	public int updateUsers(UserVo vo) {
		String sql = "update users set password=?,name=?,role=? where id=?";
		Connection con = null;
		PreparedStatement ps = null;
		int result = 0;
		try {
			con = JDBCUtil.getConnection();
			ps = con.prepareStatement(sql);
			// ? 세팅
			ps.setString(1, vo.getPassword());
			ps.setString(2, vo.getName());
			ps.setString(3, vo.getRole());
			ps.setString(4, vo.getId());
			// 실행 및 결과값 핸들링
			result = ps.executeUpdate();
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			JDBCUtil.close(con, ps, null);
		}
		return result;
	}
}

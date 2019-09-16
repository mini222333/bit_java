package service;

import java.util.List;

import dao.UsersDao;
import vo.UserVo;	

public class UsersServiceImpl implements UsersService{

	UsersDao dao;
	
	public UsersServiceImpl() {}
	public UsersServiceImpl(UsersDao dao) {
		super();
		this.dao = dao;
	}

	@Override
	public List<UserVo> usersList() {
		// TODO Auto-generated method stub
		return dao.getUserRec();
	}
	@Override
	public List<UserVo> usersList(int page, int n) {
		// TODO Auto-generated method stub
		return dao.getUserRec(page,n);
	}

	@Override
	public UserVo login(UserVo vo) {
		// TODO Auto-generated method stub
		return dao.loginUsers(vo);
	}

	@Override
	public int addUsers(UserVo vo) {
		// TODO Auto-generated method stub
		return dao.insertUsers(vo);
	}

	@Override
	public int deleteUsers(String id) {
		// TODO Auto-generated method stub
		return dao.deleteUsers(id);
	}

	@Override
	public int updateUsers(UserVo vo) {
		// TODO Auto-generated method stub
		return dao.updateUsers(vo);
	}

}

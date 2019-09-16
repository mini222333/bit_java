package service;

import java.util.List;

import vo.UserVo;

public interface UsersService {
	public List<UserVo> usersList();
	public List<UserVo> usersList(int page, int n);
	public UserVo login(UserVo vo);
	public int addUsers(UserVo vo);
	public int deleteUsers(String id);
	public int updateUsers(UserVo vo);
	
}

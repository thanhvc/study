package rxb.maven.dao;

import rxb.maven.model.User;

public interface UserDao {
	/**
	 * 创建用户
	 * @param user
	 * @return 是否创建成功
	 */
	public boolean createUser(User user);
	
	/**
	 * 删除用户
	 * @param id
	 * @return 是否删除成功
	 */
	public boolean deleteUserById(Integer id);
}

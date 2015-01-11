package rxb.maven.dao;

import rxb.maven.model.User;

public interface UserDao {
	public boolean createUser(User user);
	public boolean deleteUserById(Integer id);
}

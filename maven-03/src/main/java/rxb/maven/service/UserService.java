package rxb.maven.service;

import rxb.maven.model.User;

public interface UserService {
	public boolean createUser(User user);
	public boolean deleteUserById(Integer id);
}

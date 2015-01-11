package rxb.maven.service.impl;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import rxb.maven.dao.impl.DefaultUserDao;
import rxb.maven.model.User;
import rxb.maven.service.UserService;

@Service("userService")
public class DefaultUserService implements UserService {
	
	@Resource
	private DefaultUserDao userDao;

	@Override
	public boolean createUser(User user) {
		return userDao.createUser(user);
	}

	@Override
	public boolean deleteUserById(Integer id) {
		return userDao.deleteUserById(id);
	}

}

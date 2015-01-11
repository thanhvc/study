package rxb.crm.service.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import rxb.crm.dao.UserDao;
import rxb.crm.model.User;
import rxb.crm.service.UserService;
@Service("userService")
public class DefaultUserService implements UserService {
	@Resource
	UserDao userDao;
	@Override
	public void createUser(User u) {
		userDao.insertUser(u);

	}

	@Override
	public void updateUser(User u) {
		userDao.updateUser(u);

	}

	@Override
	public void deleteUser(Integer id) {
		userDao.deleteUser(id);

	}

	@Override
	public List<User> findAll() {
		return userDao.findAll();
	}

	@Override
	public User findById(Integer id) {
		return userDao.findById(id);
	}

	@Override
	public List<User> findByKey(String key) {
		return userDao.findByKey(key);
	}

	@Override
	public User find(String username, String password) {
		User user=userDao.find(username);
		if(user!=null){
			if(user.getPassword().equals(password))return user;
		}
		return null;
	}

	@Override
	public void deleteUsers(List<Integer> idList) {
		userDao.deleteUsers(idList);
	}

	@Override
	public void reset(Integer id) {
		userDao.reset(id);
		
	}

	@Override
	public void status(Integer id) {
		userDao.status(id);
		
	}

	@Override
	public void resetUsers(List<Integer> idList) {
		userDao.resetUsers(idList);
		
	}

	@Override
	public void statusUsers(List<Integer> idList) {
		userDao.statusUsers(idList);
		
	}

}

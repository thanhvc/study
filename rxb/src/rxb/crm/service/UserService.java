package rxb.crm.service;

import java.util.List;

import rxb.crm.model.User;

public interface UserService {
	public void createUser(User u);
	public void updateUser(User u);
	public void deleteUser(Integer id);
	public List<User> findAll();
	public User findById(Integer id);
	public List<User> findByKey(String key);
	public User find(String username,String password);
	public void deleteUsers(List<Integer> idList);
	public void reset(Integer id);
	public void resetUsers(List<Integer> idList);
	public void status(Integer id);
	public void statusUsers(List<Integer> idList);
}

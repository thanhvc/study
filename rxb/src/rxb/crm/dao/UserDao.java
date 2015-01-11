package rxb.crm.dao;

import java.util.List;

import rxb.crm.model.User;

public interface UserDao {
	public void insertUser(User u);
	public void updateUser(User u);
	public void deleteUser(Integer id);
	public void deleteUsers(List<Integer> idList);
	public List<User> findAll();
	public User findById(Integer id);
	public List<User> findByKey(String key);
	public User find(String username);
	public void reset(Integer id);
	public void resetUsers(List<Integer> idList);
	public void status(Integer id);
	public void statusUsers(List<Integer> idList);
}

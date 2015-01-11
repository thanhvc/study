package rxb.maven.dao;

import rxb.maven.model.User;

public interface UserDao {
	/**
	 * �����û�
	 * @param user
	 * @return �Ƿ񴴽��ɹ�
	 */
	public boolean createUser(User user);
	
	/**
	 * ɾ���û�
	 * @param id
	 * @return �Ƿ�ɾ���ɹ�
	 */
	public boolean deleteUserById(Integer id);
}

package rxb.crm.dao;

import rxb.crm.model.UserPrivilege;

public interface UserPrivilegeDao {
	public void insertUserPrivilege(UserPrivilege up);
	public void updateUserPrivilege(UserPrivilege up);
	public void deleteUserPrivilege(Integer id);
	public UserPrivilege findById(Integer id);
	public UserPrivilege findById(Integer uid,Integer mid);
	
}
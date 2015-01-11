package rxb.crm.service;

import rxb.crm.model.UserPrivilege;

public interface UserPrivilegeService {
	public void createUserPrivilege(UserPrivilege up);
	public void updateUserPrivilege(UserPrivilege up);
	public void deleteUserPrivilege(Integer id);
	public UserPrivilege findById(Integer id);
	public UserPrivilege findById(Integer uid,Integer mid);
	
	
}

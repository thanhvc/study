package rxb.crm.service.impl;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import rxb.crm.dao.ModuleURLDao;
import rxb.crm.dao.UserPrivilegeDao;
import rxb.crm.model.UserPrivilege;
import rxb.crm.service.UserPrivilegeService;
@Service("userPrivilegeService")
public class DefaultUserPrivilegeService implements UserPrivilegeService {
	@Resource
	UserPrivilegeDao userPrivilegeDao;
	@Resource
	ModuleURLDao moduleURLDao;
	@Override
	public void createUserPrivilege(UserPrivilege up) {
		userPrivilegeDao.insertUserPrivilege(up);

	}

	@Override
	public void updateUserPrivilege(UserPrivilege up) {
		userPrivilegeDao.updateUserPrivilege(up);

	}

	@Override
	public void deleteUserPrivilege(Integer id) {
		userPrivilegeDao.deleteUserPrivilege(id);

	}

	@Override
	public UserPrivilege findById(Integer id) {
		return userPrivilegeDao.findById(id);
	}

	@Override
	public UserPrivilege findById(Integer uid, Integer mid) {
		return userPrivilegeDao.findById(uid, mid);
	}



}

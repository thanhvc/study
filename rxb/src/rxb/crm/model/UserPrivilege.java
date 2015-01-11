package rxb.crm.model;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.SequenceGenerator;

@Entity(name="t_userprivileges")
@SequenceGenerator(name="SEQ_USER_PRIV",sequenceName="userpriv_seq")
public class UserPrivilege {
	private Integer id;
	private User user;
	private ModuleURL moduleURL;
	private char mask;

	@Id
	@GeneratedValue(generator="SEQ_USER_PRIV",strategy=GenerationType.SEQUENCE)
	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	@ManyToOne(fetch=FetchType.LAZY,cascade={CascadeType.PERSIST,CascadeType.MERGE})
	@JoinColumn(name="user_id")
	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	@ManyToOne(fetch=FetchType.LAZY,cascade={CascadeType.PERSIST,CascadeType.MERGE})
	@JoinColumn(name="moduleurl_id")
	public ModuleURL getModuleURL() {
		return moduleURL;
	}

	public void setModuleURL(ModuleURL moduleURL) {
		this.moduleURL = moduleURL;
	}

	@Column
	public char getMask() {
		return mask;
	}

	public void setMask(char mask) {
		this.mask = mask;
	}

}

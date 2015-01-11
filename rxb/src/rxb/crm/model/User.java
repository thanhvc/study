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

/**
 * 用户
 * @author rxb
 *
 */
@Entity(name="t_users")
@SequenceGenerator(name="SEQ_USER",sequenceName="user_seq")
public class User {
	/**
	 * id
	 */
	private Integer id;
	/**
	 * 用户名
	 */
	private String username;
	/**
	 * 密码
	 */
	private String password;
	/**
	 * 真实姓名
	 */
	private String realname;
	/**
	 * 电话
	 */
	private String telephone;
	/**
	 * 邮箱
	 */
	private String email;
	/**
	 * 状态
	 */
	char status;
	/**
	 * 所属部门
	 */
	Department department;

	@Id
	@GeneratedValue(strategy=GenerationType.SEQUENCE,generator="SEQ_USER")
	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	@Column(name="user_name",length=18)
	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	@Column(length=256)
	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	@Column(length=12)
	public String getRealname() {
		return realname;
	}

	public void setRealname(String realname) {
		this.realname = realname;
	}

	@Column(length=18)
	public String getTelephone() {
		return telephone;
	}

	public void setTelephone(String telephone) {
		this.telephone = telephone;
	}

	@Column(length=32)
	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	@Column
	public char getStatus() {
		return status;
	}

	public void setStatus(char status) {
		this.status = status;
	}

	@ManyToOne(fetch=FetchType.LAZY,cascade={CascadeType.PERSIST,CascadeType.MERGE})
	@JoinColumn(name="department_id")
	public Department getDepartment() {
		return department;
	}

	public void setDepartment(Department department) {
		this.department = department;
	}
}

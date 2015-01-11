package rxb.crm.model;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.SequenceGenerator;

@Entity(name="t_departments")
@SequenceGenerator(name="SEQ_DEP",sequenceName="dep_seq")
public class Department {
	/**
	 * id
	 */
	private Integer id;
	/**
	 * 部门代码
	 */
	private String code;
	/**
	 * 名称
	 */
	private String name;
	/**
	 * 地址
	 */
	private String address;
	/**
	 * 电话
	 */
	private String telephone;
	/**
	 * 管理员
	 */
	private User manager;

	@Id
	@GeneratedValue(strategy=GenerationType.SEQUENCE,generator="SEQ_DEP")
	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	@Column(length=10)
	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	@Column(length=18)
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	@Column(length=18)
	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	@Column(length=18)
	public String getTelephone() {
		return telephone;
	}

	public void setTelephone(String telephone) {
		this.telephone = telephone;
	}

	@OneToOne(cascade=CascadeType.ALL)
	@JoinColumn(name="manager_id")
	public User getManager() {
		return manager;
	}

	public void setManager(User manager) {
		this.manager = manager;
	}
}

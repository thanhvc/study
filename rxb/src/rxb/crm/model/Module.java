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

@Entity(name="t_modules")
@SequenceGenerator(name="SEQ_MODULE",sequenceName="module_seq")
public class Module {
	private Integer id;
	private String name;
	private String title;
	private ModuleURL url;
	private boolean mainMenu;

	@Id
	@GeneratedValue(strategy=GenerationType.SEQUENCE,generator="SEQ_MODULE")
	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	@Column(length=12)
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Column(length=20)
	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	@OneToOne(cascade=CascadeType.ALL)
	@JoinColumn(name="url_id")
	public ModuleURL getUrl() {
		return url;
	}

	public void setUrl(ModuleURL url) {
		this.url = url;
	}

	@Column(name="main_menu")
	public boolean isMainMenu() {
		return mainMenu;
	}

	public void setMainMenu(boolean mainMenu) {
		this.mainMenu = mainMenu;
	}
}

package rxb.crm.model;

import java.math.BigDecimal;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;

@Entity(name="t_service")
@SequenceGenerator(name="SEQ_SERV",sequenceName="serv_seq")
public class Service {
	private Integer id;
	private String name;
	private String priod;
	private BigDecimal price;
	private String content;
	private char notify;
	private Integer notifyNum;
	private Integer interval;

	@Id
	@GeneratedValue(strategy=GenerationType.SEQUENCE,generator="SEQ_SERV")
	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	@Column(length=20)
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Column(length=10)
	public String getPriod() {
		return priod;
	}

	public void setPriod(String priod) {
		this.priod = priod;
	}

	@Column(precision=10,scale=2)
	public BigDecimal getPrice() {
		return price;
	}

	public void setPrice(BigDecimal price) {
		this.price = price;
	}

	@Column(length=64)
	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	@Column
	public char getNotify() {
		return notify;
	}

	public void setNotify(char notify) {
		this.notify = notify;
	}

	@Column(length=10)
	public Integer getNotifyNum() {
		return notifyNum;
	}

	public void setNotifyNum(Integer notifyNum) {
		this.notifyNum = notifyNum;
	}

	@Column(length=10)
	public Integer getInterval() {
		return interval;
	}

	public void setInterval(Integer interval) {
		this.interval = interval;
	}
}

package rxb.crm.model;

import java.math.BigDecimal;
import java.util.Date;
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

@Entity(name="t_salerecords")
@SequenceGenerator(name="SEQ_SALE",sequenceName="sale_seq")
public class SaleRecord {
	private Integer id;
	private Customer customer;
	private Product product;
	private Integer productCount;
	private Date purchaseDate;
	private BigDecimal price;
	private String stockoutInvNo;
	private String saleInvoiceNo;

	@Id
	@GeneratedValue(strategy=GenerationType.SEQUENCE,generator="SEQ_SALE")
	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	@ManyToOne(cascade={CascadeType.PERSIST,CascadeType.MERGE},fetch=FetchType.LAZY)
	@JoinColumn(name="customer_id")
	public Customer getCustomer() {
		return customer;
	}

	public void setCustomer(Customer customer) {
		this.customer = customer;
	}

	@ManyToOne(cascade={CascadeType.PERSIST,CascadeType.MERGE},fetch=FetchType.LAZY)
	@JoinColumn(name="product_id")
	public Product getProduct() {
		return product;
	}

	public void setProduct(Product product) {
		this.product = product;
	}

	@Column(length=5)
	public Integer getProductCount() {
		return productCount;
	}

	public void setProductCount(Integer productCount) {
		this.productCount = productCount;
	}

	@Column
	public Date getPurchaseDate() {
		return purchaseDate;
	}

	public void setPurchaseDate(Date purchaseDate) {
		this.purchaseDate = purchaseDate;
	}

	@Column(precision=10,scale=2)
	public BigDecimal getPrice() {
		return price;
	}

	public void setPrice(BigDecimal price) {
		this.price = price;
	}

	@Column(length=20)
	public String getStockoutInvNo() {
		return stockoutInvNo;
	}

	public void setStockoutInvNo(String stockoutInvNo) {
		this.stockoutInvNo = stockoutInvNo;
	}

	@Column(length=20)
	public String getSaleInvoiceNo() {
		return saleInvoiceNo;
	}

	public void setSaleInvoiceNo(String saleInvoiceNo) {
		this.saleInvoiceNo = saleInvoiceNo;
	}
}

package com.inventory.model;

import io.swagger.annotations.ApiModelProperty;

import javax.persistence.*;
import java.util.Date;
import java.util.HashSet;
import java.util.Set;

@Entity
@Table(name = "Orders")
public class Order extends BaseEntity {
	@Id
	@GeneratedValue
	private Long id;
	@ManyToOne(cascade = CascadeType.ALL, fetch = FetchType.EAGER, optional = false)
	@JoinColumn(name = "warehouse_id")
	private Warehouse warehouse;
	private String description;
	@ApiModelProperty(value = "Account Number in this system")
	private String internalAccountNumber;
	@ApiModelProperty(value = "Account Number in an external system")
	private String externalAccountNumber;
	@Enumerated(EnumType.STRING)
	private OrderStatus status;
	private String internalComments;
	private String externalComments;
	private Date lastPrintDate;
	@OneToMany(cascade = CascadeType.ALL, orphanRemoval = true)
	@JoinColumn(name = "order_id")
	private Set<OrderLine> stockOrderLineList = new HashSet<OrderLine>();

	public Order(Long id, Warehouse warehouse, String description, String internalAccountNumber,
			String externalAccountNumber, OrderStatus status, String internalComments, String externalComments,
			Date lastPrintDate, Set<OrderLine> stockOrderLineList) {
		super();
		this.id = id;
		this.warehouse = warehouse;
		this.description = description;
		this.internalAccountNumber = internalAccountNumber;
		this.externalAccountNumber = externalAccountNumber;
		this.status = status;
		this.internalComments = internalComments;
		this.externalComments = externalComments;
		this.lastPrintDate = lastPrintDate;
		this.stockOrderLineList = stockOrderLineList;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Warehouse getWarehouse() {
		return warehouse;
	}

	public void setWarehouse(Warehouse warehouse) {
		this.warehouse = warehouse;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getInternalAccountNumber() {
		return internalAccountNumber;
	}

	public void setInternalAccountNumber(String internalAccountNumber) {
		this.internalAccountNumber = internalAccountNumber;
	}

	public String getExternalAccountNumber() {
		return externalAccountNumber;
	}

	public void setExternalAccountNumber(String externalAccountNumber) {
		this.externalAccountNumber = externalAccountNumber;
	}

	public OrderStatus getStatus() {
		return status;
	}

	public void setStatus(OrderStatus status) {
		this.status = status;
	}

	public String getInternalComments() {
		return internalComments;
	}

	public void setInternalComments(String internalComments) {
		this.internalComments = internalComments;
	}

	public String getExternalComments() {
		return externalComments;
	}

	public void setExternalComments(String externalComments) {
		this.externalComments = externalComments;
	}

	public Date getLastPrintDate() {
		return lastPrintDate;
	}

	public void setLastPrintDate(Date lastPrintDate) {
		this.lastPrintDate = lastPrintDate;
	}

	public Set<OrderLine> getStockOrderLineList() {
		return stockOrderLineList;
	}

	public void setStockOrderLineList(Set<OrderLine> stockOrderLineList) {
		this.stockOrderLineList = stockOrderLineList;
	}

	@Override
	public String toString() {
		return "Order [id=" + id + ", warehouse=" + warehouse + ", description=" + description
				+ ", internalAccountNumber=" + internalAccountNumber + ", externalAccountNumber="
				+ externalAccountNumber + ", status=" + status + ", internalComments=" + internalComments
				+ ", externalComments=" + externalComments + ", lastPrintDate=" + lastPrintDate
				+ ", stockOrderLineList=" + stockOrderLineList + "]";
	}

}

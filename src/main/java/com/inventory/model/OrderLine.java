package com.inventory.model;

import javax.persistence.*;
import java.util.Date;

@Entity
public class OrderLine extends BaseEntity {
	@Id
	@GeneratedValue
	private Long id;
	private Integer requestedQuantity;
	private Integer receivedQuantity;
	private Integer pendingQuantity;
	private Double price;
	private String internalComments;
	private String externalComments;
	private String lotNumber;
	private Date estimatedArrivalTime;
	private Date arrivalTime;
	private String orderDescription;
	@ManyToOne
	private Product product;
	@Enumerated(EnumType.STRING)
	private OrderReceptionStatus status;

	public OrderLine(Long id, Integer requestedQuantity, Integer receivedQuantity, Integer pendingQuantity,
			Double price, String internalComments, String externalComments, String lotNumber, Date estimatedArrivalTime,
			Date arrivalTime, String orderDescription, Product product, OrderReceptionStatus status) {
		super();
		this.id = id;
		this.requestedQuantity = requestedQuantity;
		this.receivedQuantity = receivedQuantity;
		this.pendingQuantity = pendingQuantity;
		this.price = price;
		this.internalComments = internalComments;
		this.externalComments = externalComments;
		this.lotNumber = lotNumber;
		this.estimatedArrivalTime = estimatedArrivalTime;
		this.arrivalTime = arrivalTime;
		this.orderDescription = orderDescription;
		this.product = product;
		this.status = status;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Product getProduct() {
		return product;
	}

	public void setProduct(Product product) {
		this.product = product;
	}

	public OrderReceptionStatus getStatus() {
		return status;
	}

	public void setStatus(OrderReceptionStatus status) {
		this.status = status;
	}

	public Integer getRequestedQuantity() {
		return requestedQuantity;
	}

	public void setRequestedQuantity(Integer requestedQuantity) {
		this.requestedQuantity = requestedQuantity;
	}

	public Integer getReceivedQuantity() {
		return receivedQuantity;
	}

	public void setReceivedQuantity(Integer receivedQuantity) {
		this.receivedQuantity = receivedQuantity;
	}

	public Integer getPendingQuantity() {
		return pendingQuantity;
	}

	public void setPendingQuantity(Integer pendingQuantity) {
		this.pendingQuantity = pendingQuantity;
	}

	public Double getPrice() {
		return price;
	}

	public void setPrice(Double price) {
		this.price = price;
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

	public String getLotNumber() {
		return lotNumber;
	}

	public void setLotNumber(String lotNumber) {
		this.lotNumber = lotNumber;
	}

	public Date getEstimatedArrivalTime() {
		return estimatedArrivalTime;
	}

	public void setEstimatedArrivalTime(Date estimatedArrivalTime) {
		this.estimatedArrivalTime = estimatedArrivalTime;
	}

	public Date getArrivalTime() {
		return arrivalTime;
	}

	public void setArrivalTime(Date arrivalTime) {
		this.arrivalTime = arrivalTime;
	}

	public String getOrderDescription() {
		return orderDescription;
	}

	public void setOrderDescription(String orderDescription) {
		this.orderDescription = orderDescription;
	}

	@Override
	public String toString() {
		return "OrderLine [id=" + id + ", requestedQuantity=" + requestedQuantity + ", receivedQuantity="
				+ receivedQuantity + ", pendingQuantity=" + pendingQuantity + ", price=" + price + ", internalComments="
				+ internalComments + ", externalComments=" + externalComments + ", lotNumber=" + lotNumber
				+ ", estimatedArrivalTime=" + estimatedArrivalTime + ", arrivalTime=" + arrivalTime
				+ ", orderDescription=" + orderDescription + ", product=" + product + ", status=" + status + "]";
	}

}

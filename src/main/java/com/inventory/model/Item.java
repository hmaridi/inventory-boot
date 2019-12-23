package com.inventory.model;

import javax.persistence.*;
import java.util.Date;

@Entity
public class Item extends BaseEntity {

	@Id
	@GeneratedValue
	private Long id;
	private Long orderLineID;
	private Date realEntryDate;
	private Date expiryDate;
	private String label;
	private Integer labelsToPrint;
	private String location;
	private String invoiceOrDeliveryNote;
	private String comments;
	private Double finalPrice;
	private Integer purchaseUnits;
	private Integer initialConsumUnits;
	private Integer remainingUnits;
	private String lotNumber;
	@ManyToOne(cascade = CascadeType.ALL, fetch = FetchType.EAGER, optional = false)
	@JoinColumn(name = "warehouse_id")
	private Warehouse warehouse;
	@ManyToOne(cascade = CascadeType.ALL, fetch = FetchType.EAGER, optional = false)
	@JoinColumn(name = "product_id")
	private Product product;
	private boolean quarantine;
	private Date quarantineStartDate;
	private Date quarantineEndDate;

	public Item(Long id, Long orderLineID, Date realEntryDate, Date expiryDate, String label, Integer labelsToPrint,
			String location, String invoiceOrDeliveryNote, String comments, Double finalPrice, Integer purchaseUnits,
			Integer initialConsumUnits, Integer remainingUnits, String lotNumber, Warehouse warehouse, Product product,
			boolean quarantine, Date quarantineStartDate, Date quarantineEndDate) {
		super();
		this.id = id;
		this.orderLineID = orderLineID;
		this.realEntryDate = realEntryDate;
		this.expiryDate = expiryDate;
		this.label = label;
		this.labelsToPrint = labelsToPrint;
		this.location = location;
		this.invoiceOrDeliveryNote = invoiceOrDeliveryNote;
		this.comments = comments;
		this.finalPrice = finalPrice;
		this.purchaseUnits = purchaseUnits;
		this.initialConsumUnits = initialConsumUnits;
		this.remainingUnits = remainingUnits;
		this.lotNumber = lotNumber;
		this.warehouse = warehouse;
		this.product = product;
		this.quarantine = quarantine;
		this.quarantineStartDate = quarantineStartDate;
		this.quarantineEndDate = quarantineEndDate;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Long getOrderLineID() {
		return orderLineID;
	}

	public void setOrderLineID(Long orderLineID) {
		this.orderLineID = orderLineID;
	}

	public Date getRealEntryDate() {
		return realEntryDate;
	}

	public void setRealEntryDate(Date realEntryDate) {
		this.realEntryDate = realEntryDate;
	}

	public Date getExpiryDate() {
		return expiryDate;
	}

	public void setExpiryDate(Date expiryDate) {
		this.expiryDate = expiryDate;
	}

	public String getLabel() {
		return label;
	}

	public void setLabel(String label) {
		this.label = label;
	}

	public Integer getLabelsToPrint() {
		return labelsToPrint;
	}

	public void setLabelsToPrint(Integer labelsToPrint) {
		this.labelsToPrint = labelsToPrint;
	}

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	public String getInvoiceOrDeliveryNote() {
		return invoiceOrDeliveryNote;
	}

	public void setInvoiceOrDeliveryNote(String invoiceOrDeliveryNote) {
		this.invoiceOrDeliveryNote = invoiceOrDeliveryNote;
	}

	public String getComments() {
		return comments;
	}

	public void setComments(String comments) {
		this.comments = comments;
	}

	public Double getFinalPrice() {
		return finalPrice;
	}

	public void setFinalPrice(Double finalPrice) {
		this.finalPrice = finalPrice;
	}

	public Integer getPurchaseUnits() {
		return purchaseUnits;
	}

	public void setPurchaseUnits(Integer purchaseUnits) {
		this.purchaseUnits = purchaseUnits;
	}

	public Integer getInitialConsumUnits() {
		return initialConsumUnits;
	}

	public void setInitialConsumUnits(Integer initialConsumUnits) {
		this.initialConsumUnits = initialConsumUnits;
	}

	public Integer getRemainingUnits() {
		return remainingUnits;
	}

	public void setRemainingUnits(Integer remainingUnits) {
		this.remainingUnits = remainingUnits;
	}

	public String getLotNumber() {
		return lotNumber;
	}

	public void setLotNumber(String lotNumber) {
		this.lotNumber = lotNumber;
	}

	public Warehouse getWarehouse() {
		return warehouse;
	}

	public void setWarehouse(Warehouse warehouse) {
		this.warehouse = warehouse;
	}

	public Product getProduct() {
		return product;
	}

	public void setProduct(Product product) {
		this.product = product;
	}

	public boolean isQuarantine() {
		return quarantine;
	}

	public void setQuarantine(boolean quarantine) {
		this.quarantine = quarantine;
	}

	public Date getQuarantineStartDate() {
		return quarantineStartDate;
	}

	public void setQuarantineStartDate(Date quarantineStartDate) {
		this.quarantineStartDate = quarantineStartDate;
	}

	public Date getQuarantineEndDate() {
		return quarantineEndDate;
	}

	public void setQuarantineEndDate(Date quarantineEndDate) {
		this.quarantineEndDate = quarantineEndDate;
	}

	@Override
	public String toString() {
		return "Item [id=" + id + ", orderLineID=" + orderLineID + ", realEntryDate=" + realEntryDate + ", expiryDate="
				+ expiryDate + ", label=" + label + ", labelsToPrint=" + labelsToPrint + ", location=" + location
				+ ", invoiceOrDeliveryNote=" + invoiceOrDeliveryNote + ", comments=" + comments + ", finalPrice="
				+ finalPrice + ", purchaseUnits=" + purchaseUnits + ", initialConsumUnits=" + initialConsumUnits
				+ ", remainingUnits=" + remainingUnits + ", lotNumber=" + lotNumber + ", warehouse=" + warehouse
				+ ", product=" + product + ", quarantine=" + quarantine + ", quarantineStartDate=" + quarantineStartDate
				+ ", quarantineEndDate=" + quarantineEndDate + "]";
	}

	public void fillQuarantineLotInfo(Date ts, Item item) {

		if (this.getLotNumber() == null) {
			this.setQuarantine(false);
			this.setQuarantineStartDate(null);
			this.setQuarantineEndDate(null);
		} else {
			if (item == null) {
				this.setQuarantineStartDate(this.quarantine ? this.getCreatedAt() : null);
				this.setQuarantineEndDate(null);
			} else {
				if (this.quarantine) {

					this.setQuarantineStartDate(findMinimumDate(item.getCreatedAt(), this.getCreatedAt()));
					this.setQuarantineEndDate(null);
				} else {
					if (item.getQuarantineStartDate() != null) {
						this.setQuarantineStartDate(findMinimumDate(item.getCreatedAt(), this.getCreatedAt()));
						this.setQuarantineEndDate(
								item.getQuarantineEndDate() != null ? item.getQuarantineEndDate() : ts);
					} else {
						this.setQuarantineStartDate(null);
						this.setQuarantineEndDate(null);
					}
				}
			}
		}
	}

	private Date findMinimumDate(Date aDate, Date bDate) {
		return aDate.before(bDate) ? aDate : bDate;
	}
}

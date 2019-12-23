package com.inventory.model;

import com.fasterxml.jackson.annotation.JsonInclude;

import javax.persistence.*;
import javax.validation.constraints.Size;

@Entity
@JsonInclude(JsonInclude.Include.NON_NULL)
public class Product extends BaseEntity {
	@Id
	@GeneratedValue
	private Long id;
	@Size(max = 255)
	private String name;
	@Size(max = 255)
	private String reportDescription;
	@Size(max = 16)
	private String code;
	@Size(max = 16)
	private String supplierProductCode;
	@ManyToOne(cascade = CascadeType.ALL, fetch = FetchType.EAGER, optional = false)
	private Supplier supplier;
	@ManyToOne(cascade = CascadeType.ALL, fetch = FetchType.EAGER, optional = false)
	private Warehouse warehouse;
	@Enumerated(EnumType.STRING)
	private ProductType type;
	@ManyToOne(cascade = CascadeType.ALL, fetch = FetchType.EAGER, optional = true)
	private Section section;
	@Enumerated(EnumType.STRING)
	private LabelPrintingMode labelPrintingMode;
	@ManyToOne(cascade = CascadeType.ALL, fetch = FetchType.EAGER, optional = true)
	private ProductGroup productGroup;

	private Integer minimumExpiry;
	private Integer consumptionPurchaseRatio;
	private Integer minStock;
	private Integer maxStock;
	private Integer orderPoint;
	private Integer fillingPoint;
	private String preservation;
	private String purchaseUnits;
	private String consumptionUnits;
	private String defaultLocation;
	private Integer testsProductRatio;
	private boolean active;
	private Double pricePerUnit;
	private Double vatPercentage;
	private String comments;
	private String productBarcode;
	private String productHostCode;
	private String productMask;
	private Integer totalRemainingUnits;
	private Double totalCost;
	private String productField1;
	private String productField2;
	private Integer totalRemainingUnitsExpired;
	private Integer totalRemainingUnitsInQuarantine;
	private String quarantineControl;
	private boolean mandatoryExpiry;
	private Integer minDaysToExpire;

	public Product(Long id, String name, String reportDescription, String code, String supplierProductCode,
			Supplier supplier, Warehouse warehouse, ProductType type, Section section,
			LabelPrintingMode labelPrintingMode, ProductGroup productGroup, Integer minimumExpiry,
			Integer consumptionPurchaseRatio, Integer minStock, Integer maxStock, Integer orderPoint,
			Integer fillingPoint, String preservation, String purchaseUnits, String consumptionUnits,
			String defaultLocation, Integer testsProductRatio, boolean active, Double pricePerUnit,
			Double vatPercentage, String comments, String productBarcode, String productHostCode, String productMask,
			Integer totalRemainingUnits, Double totalCost, String productField1, String productField2,
			Integer totalRemainingUnitsExpired, Integer totalRemainingUnitsInQuarantine, String quarantineControl,
			boolean mandatoryExpiry, Integer minDaysToExpire) {
		super();
		this.id = id;
		this.name = name;
		this.reportDescription = reportDescription;
		this.code = code;
		this.supplierProductCode = supplierProductCode;
		this.supplier = supplier;
		this.warehouse = warehouse;
		this.type = type;
		this.section = section;
		this.labelPrintingMode = labelPrintingMode;
		this.productGroup = productGroup;
		this.minimumExpiry = minimumExpiry;
		this.consumptionPurchaseRatio = consumptionPurchaseRatio;
		this.minStock = minStock;
		this.maxStock = maxStock;
		this.orderPoint = orderPoint;
		this.fillingPoint = fillingPoint;
		this.preservation = preservation;
		this.purchaseUnits = purchaseUnits;
		this.consumptionUnits = consumptionUnits;
		this.defaultLocation = defaultLocation;
		this.testsProductRatio = testsProductRatio;
		this.active = active;
		this.pricePerUnit = pricePerUnit;
		this.vatPercentage = vatPercentage;
		this.comments = comments;
		this.productBarcode = productBarcode;
		this.productHostCode = productHostCode;
		this.productMask = productMask;
		this.totalRemainingUnits = totalRemainingUnits;
		this.totalCost = totalCost;
		this.productField1 = productField1;
		this.productField2 = productField2;
		this.totalRemainingUnitsExpired = totalRemainingUnitsExpired;
		this.totalRemainingUnitsInQuarantine = totalRemainingUnitsInQuarantine;
		this.quarantineControl = quarantineControl;
		this.mandatoryExpiry = mandatoryExpiry;
		this.minDaysToExpire = minDaysToExpire;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getReportDescription() {
		return reportDescription;
	}

	public void setReportDescription(String reportDescription) {
		this.reportDescription = reportDescription;
	}

	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public String getSupplierProductCode() {
		return supplierProductCode;
	}

	public void setSupplierProductCode(String supplierProductCode) {
		this.supplierProductCode = supplierProductCode;
	}

	public Supplier getSupplier() {
		return supplier;
	}

	public void setSupplier(Supplier supplier) {
		this.supplier = supplier;
	}

	public Warehouse getWarehouse() {
		return warehouse;
	}

	public void setWarehouse(Warehouse warehouse) {
		this.warehouse = warehouse;
	}

	public ProductType getType() {
		return type;
	}

	public void setType(ProductType type) {
		this.type = type;
	}

	public Section getSection() {
		return section;
	}

	public void setSection(Section section) {
		this.section = section;
	}

	public LabelPrintingMode getLabelPrintingMode() {
		return labelPrintingMode;
	}

	public void setLabelPrintingMode(LabelPrintingMode labelPrintingMode) {
		this.labelPrintingMode = labelPrintingMode;
	}

	public ProductGroup getProductGroup() {
		return productGroup;
	}

	public void setProductGroup(ProductGroup productGroup) {
		this.productGroup = productGroup;
	}

	public Integer getMinimumExpiry() {
		return minimumExpiry;
	}

	public void setMinimumExpiry(Integer minimumExpiry) {
		this.minimumExpiry = minimumExpiry;
	}

	public Integer getConsumptionPurchaseRatio() {
		return consumptionPurchaseRatio;
	}

	public void setConsumptionPurchaseRatio(Integer consumptionPurchaseRatio) {
		this.consumptionPurchaseRatio = consumptionPurchaseRatio;
	}

	public Integer getMinStock() {
		return minStock;
	}

	public void setMinStock(Integer minStock) {
		this.minStock = minStock;
	}

	public Integer getMaxStock() {
		return maxStock;
	}

	public void setMaxStock(Integer maxStock) {
		this.maxStock = maxStock;
	}

	public Integer getOrderPoint() {
		return orderPoint;
	}

	public void setOrderPoint(Integer orderPoint) {
		this.orderPoint = orderPoint;
	}

	public Integer getFillingPoint() {
		return fillingPoint;
	}

	public void setFillingPoint(Integer fillingPoint) {
		this.fillingPoint = fillingPoint;
	}

	public String getPreservation() {
		return preservation;
	}

	public void setPreservation(String preservation) {
		this.preservation = preservation;
	}

	public String getPurchaseUnits() {
		return purchaseUnits;
	}

	public void setPurchaseUnits(String purchaseUnits) {
		this.purchaseUnits = purchaseUnits;
	}

	public String getConsumptionUnits() {
		return consumptionUnits;
	}

	public void setConsumptionUnits(String consumptionUnits) {
		this.consumptionUnits = consumptionUnits;
	}

	public String getDefaultLocation() {
		return defaultLocation;
	}

	public void setDefaultLocation(String defaultLocation) {
		this.defaultLocation = defaultLocation;
	}

	public Integer getTestsProductRatio() {
		return testsProductRatio;
	}

	public void setTestsProductRatio(Integer testsProductRatio) {
		this.testsProductRatio = testsProductRatio;
	}

	public boolean isActive() {
		return active;
	}

	public void setActive(boolean active) {
		this.active = active;
	}

	public Double getPricePerUnit() {
		return pricePerUnit;
	}

	public void setPricePerUnit(Double pricePerUnit) {
		this.pricePerUnit = pricePerUnit;
	}

	public Double getVatPercentage() {
		return vatPercentage;
	}

	public void setVatPercentage(Double vatPercentage) {
		this.vatPercentage = vatPercentage;
	}

	public String getComments() {
		return comments;
	}

	public void setComments(String comments) {
		this.comments = comments;
	}

	public String getProductBarcode() {
		return productBarcode;
	}

	public void setProductBarcode(String productBarcode) {
		this.productBarcode = productBarcode;
	}

	public String getProductHostCode() {
		return productHostCode;
	}

	public void setProductHostCode(String productHostCode) {
		this.productHostCode = productHostCode;
	}

	public String getProductMask() {
		return productMask;
	}

	public void setProductMask(String productMask) {
		this.productMask = productMask;
	}

	public Integer getTotalRemainingUnits() {
		return totalRemainingUnits;
	}

	public void setTotalRemainingUnits(Integer totalRemainingUnits) {
		this.totalRemainingUnits = totalRemainingUnits;
	}

	public Double getTotalCost() {
		return totalCost;
	}

	public void setTotalCost(Double totalCost) {
		this.totalCost = totalCost;
	}

	public String getProductField1() {
		return productField1;
	}

	public void setProductField1(String productField1) {
		this.productField1 = productField1;
	}

	public String getProductField2() {
		return productField2;
	}

	public void setProductField2(String productField2) {
		this.productField2 = productField2;
	}

	public Integer getTotalRemainingUnitsExpired() {
		return totalRemainingUnitsExpired;
	}

	public void setTotalRemainingUnitsExpired(Integer totalRemainingUnitsExpired) {
		this.totalRemainingUnitsExpired = totalRemainingUnitsExpired;
	}

	public Integer getTotalRemainingUnitsInQuarantine() {
		return totalRemainingUnitsInQuarantine;
	}

	public void setTotalRemainingUnitsInQuarantine(Integer totalRemainingUnitsInQuarantine) {
		this.totalRemainingUnitsInQuarantine = totalRemainingUnitsInQuarantine;
	}

	public String getQuarantineControl() {
		return quarantineControl;
	}

	public void setQuarantineControl(String quarantineControl) {
		this.quarantineControl = quarantineControl;
	}

	public boolean isMandatoryExpiry() {
		return mandatoryExpiry;
	}

	public void setMandatoryExpiry(boolean mandatoryExpiry) {
		this.mandatoryExpiry = mandatoryExpiry;
	}

	public Integer getMinDaysToExpire() {
		return minDaysToExpire;
	}

	public void setMinDaysToExpire(Integer minDaysToExpire) {
		this.minDaysToExpire = minDaysToExpire;
	}

	@Override
	public String toString() {
		return "Product [id=" + id + ", name=" + name + ", reportDescription=" + reportDescription + ", code=" + code
				+ ", supplierProductCode=" + supplierProductCode + ", supplier=" + supplier + ", warehouse=" + warehouse
				+ ", type=" + type + ", section=" + section + ", labelPrintingMode=" + labelPrintingMode
				+ ", productGroup=" + productGroup + ", minimumExpiry=" + minimumExpiry + ", consumptionPurchaseRatio="
				+ consumptionPurchaseRatio + ", minStock=" + minStock + ", maxStock=" + maxStock + ", orderPoint="
				+ orderPoint + ", fillingPoint=" + fillingPoint + ", preservation=" + preservation + ", purchaseUnits="
				+ purchaseUnits + ", consumptionUnits=" + consumptionUnits + ", defaultLocation=" + defaultLocation
				+ ", testsProductRatio=" + testsProductRatio + ", active=" + active + ", pricePerUnit=" + pricePerUnit
				+ ", vatPercentage=" + vatPercentage + ", comments=" + comments + ", productBarcode=" + productBarcode
				+ ", productHostCode=" + productHostCode + ", productMask=" + productMask + ", totalRemainingUnits="
				+ totalRemainingUnits + ", totalCost=" + totalCost + ", productField1=" + productField1
				+ ", productField2=" + productField2 + ", totalRemainingUnitsExpired=" + totalRemainingUnitsExpired
				+ ", totalRemainingUnitsInQuarantine=" + totalRemainingUnitsInQuarantine + ", quarantineControl="
				+ quarantineControl + ", mandatoryExpiry=" + mandatoryExpiry + ", minDaysToExpire=" + minDaysToExpire
				+ "]";
	}

}

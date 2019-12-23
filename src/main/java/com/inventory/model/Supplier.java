package com.inventory.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

@Entity
@JsonInclude(JsonInclude.Include.NON_NULL)
public class Supplier extends BaseEntity {
	@Id
	@GeneratedValue
	private Long id;
	private String name;
	private String address;
	private String city;
	private String state;
	private String country;
	private String zipCode;
	private String phone;
	private String fax;
	@JsonProperty("company")
	private String companyID;
	private boolean active;
	
	@OneToMany(cascade = CascadeType.ALL, fetch = FetchType.EAGER)
	private Set<SupplierContactPerson> contactPersonList = new HashSet<>();
	
	@ManyToOne(cascade = CascadeType.ALL, fetch = FetchType.EAGER, optional = true)
	private DocumentFormat orderDocumentFormat;
	
	@ManyToOne(cascade = CascadeType.ALL, fetch = FetchType.EAGER, optional = true)
	private DocumentFormat orderStatusDocumentFormat;

	public Supplier(Long id, String name, String address, String city, String state, String country, String zipCode,
			String phone, String fax, String companyID, boolean active, Set<SupplierContactPerson> contactPersonList,
			DocumentFormat orderDocumentFormat, DocumentFormat orderStatusDocumentFormat) {
		super();
		this.id = id;
		this.name = name;
		this.address = address;
		this.city = city;
		this.state = state;
		this.country = country;
		this.zipCode = zipCode;
		this.phone = phone;
		this.fax = fax;
		this.companyID = companyID;
		this.active = active;
		this.contactPersonList = contactPersonList;
		this.orderDocumentFormat = orderDocumentFormat;
		this.orderStatusDocumentFormat = orderStatusDocumentFormat;
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

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public String getZipCode() {
		return zipCode;
	}

	public void setZipCode(String zipCode) {
		this.zipCode = zipCode;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getFax() {
		return fax;
	}

	public void setFax(String fax) {
		this.fax = fax;
	}

	public String getCompanyID() {
		return companyID;
	}

	public void setCompanyID(String companyID) {
		this.companyID = companyID;
	}

	public boolean isActive() {
		return active;
	}

	public void setActive(boolean active) {
		this.active = active;
	}

	public Set<SupplierContactPerson> getContactPersonList() {
		return contactPersonList;
	}

	public void setContactPersonList(Set<SupplierContactPerson> contactPersonList) {
		this.contactPersonList = contactPersonList;
	}

	public DocumentFormat getOrderDocumentFormat() {
		return orderDocumentFormat;
	}

	public void setOrderDocumentFormat(DocumentFormat orderDocumentFormat) {
		this.orderDocumentFormat = orderDocumentFormat;
	}

	public DocumentFormat getOrderStatusDocumentFormat() {
		return orderStatusDocumentFormat;
	}

	public void setOrderStatusDocumentFormat(DocumentFormat orderStatusDocumentFormat) {
		this.orderStatusDocumentFormat = orderStatusDocumentFormat;
	}

	@Override
	public String toString() {
		return "Supplier [id=" + id + ", name=" + name + ", address=" + address + ", city=" + city + ", state=" + state
				+ ", country=" + country + ", zipCode=" + zipCode + ", phone=" + phone + ", fax=" + fax + ", companyID="
				+ companyID + ", active=" + active + ", contactPersonList=" + contactPersonList
				+ ", orderDocumentFormat=" + orderDocumentFormat + ", orderStatusDocumentFormat="
				+ orderStatusDocumentFormat + ", getId()=" + getId() + ", getName()=" + getName() + ", getAddress()="
				+ getAddress() + ", getCity()=" + getCity() + ", getState()=" + getState() + ", getCountry()="
				+ getCountry() + ", getZipCode()=" + getZipCode() + ", getPhone()=" + getPhone() + ", getFax()="
				+ getFax() + ", getCompanyID()=" + getCompanyID() + ", isActive()=" + isActive()
				+ ", getContactPersonList()=" + getContactPersonList() + ", getOrderDocumentFormat()="
				+ getOrderDocumentFormat() + ", getOrderStatusDocumentFormat()=" + getOrderStatusDocumentFormat()
				+ ", getCreatedAt()=" + getCreatedAt() + ", getLastModified()=" + getLastModified() + ", getClass()="
				+ getClass() + ", hashCode()=" + hashCode() + ", toString()=" + super.toString() + "]";
	}

}

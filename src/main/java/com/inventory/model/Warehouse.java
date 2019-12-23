package com.inventory.model;

import com.fasterxml.jackson.annotation.JsonInclude;

import javax.persistence.*;
import javax.validation.constraints.Size;

@Entity
@JsonInclude(JsonInclude.Include.NON_NULL)
public class Warehouse extends BaseEntity {
	@Id
	@GeneratedValue
	private Long id;
	@Size(max = 255)
	private String name;
	private boolean active;
	@ManyToOne(cascade = CascadeType.ALL, fetch = FetchType.EAGER, optional = true)
	private DocumentFormat orderDocumentFormat;
	@ManyToOne(cascade = CascadeType.ALL, fetch = FetchType.EAGER, optional = true)
	private DocumentFormat orderStatusDocumentFormat;
	
	public Warehouse(Long id, @Size(max = 255) String name, DocumentFormat orderDocumentFormat,
			DocumentFormat orderStatusDocumentFormat, boolean active) {
		super();
		this.id = id;
		this.name = name;
		this.orderDocumentFormat = orderDocumentFormat;
		this.orderStatusDocumentFormat = orderStatusDocumentFormat;
		this.active = active;
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

	public boolean isActive() {
		return active;
	}

	public void setActive(boolean active) {
		this.active = active;
	}

	@Override
	public String toString() {
		return "Warehouse [id=" + id + ", name=" + name + ", orderDocumentFormat=" + orderDocumentFormat
				+ ", orderStatusDocumentFormat=" + orderStatusDocumentFormat + ", active=" + active + "]";
	}

}
